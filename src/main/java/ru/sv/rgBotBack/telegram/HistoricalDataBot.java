package ru.sv.rgBotBack.telegram;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.sv.rgBotBack.DAO.services.WholeUserDataService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class HistoricalDataBot extends TelegramLongPollingBot {
    private Logger logger = LoggerFactory.getLogger(HistoricalDataBot.class);
    private String botToken;
    private String botName;

    private final ExecutorService executor = Executors.newFixedThreadPool(10);

    private final WholeUserDataService wholeUserDataService;

    final int RECONNECT_PAUSE = 10000;
    private TelegramBotsApi telegramBotsApi;

    @Autowired
    public HistoricalDataBot(TelegramBotsApi telegramBotsApi, WholeUserDataService wholeUserDataService, @Value("${telegram-bot.name}") String botName, @Value("${telegram-bot.token}") String botToken) {
        this.telegramBotsApi = telegramBotsApi;
        this.wholeUserDataService = wholeUserDataService;
        this.botName = botName;
        this.botToken = botToken;
        botConnect();
    }

    @Override
    public String getBotUsername() {
        return botName;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage()) {
            var msg = update.getMessage();
            var chatId = msg.getChatId();
            //for statistic purpose
            logger.info("we received a message: {}", msg.getText());

            executor.submit(() -> {
                try {
                    handleMessage(msg, chatId);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            });

        }
    }


    private void handleMessage(Message msg, long chatId) throws TelegramApiException {
        if (msg.getText().equals("/start") || msg.getText().equals("/info")) {
            var reply = "Введите телефон потребителя в формате:\n<b>7XXXxxxXXxx</b>";
            sendNotification(String.valueOf(chatId), reply);

        } else if (msg.getText().contains("79") && msg.getText().length() == 11) {
            var data = wholeUserDataService.getWholeDataByMobile(msg.getText());
            if (data != null) {
                if (data.toString().length() < 4096) {
                    sendNotification(String.valueOf(chatId), data.toString());
                } else {
                    var listOfData = data.bigToString();
                    for (String s : listOfData) {
                        sendNotification(String.valueOf(chatId), s);
                    }
                }
            } else {
                sendNotification(String.valueOf(chatId), "<i>Данных по данному пользователю не найдено</i>");
            }
        } else {
            sendNotification(String.valueOf(chatId), "<b>Неверный формат</b>\nВведите телефон потребителя в формате:\n7XXXxxxXXxx");
        }
    }

    private void sendNotification(String chatId, String msg) throws TelegramApiException {
        var response = new SendMessage(chatId, msg);
        response.enableHtml(true);
        execute(response);
    }

    private void botConnect() {
        try {
            telegramBotsApi.registerBot(this);
            logger.info("TelegramAPI started. Look for messages");
        } catch (TelegramApiException e) {
            logger.error("Cant Connect. Pause " + RECONNECT_PAUSE / 1000 + "sec and try again. Error: " + e.getMessage());
            try {
                Thread.sleep(RECONNECT_PAUSE);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
                return;
            }
            botConnect();
        }
    }

}
