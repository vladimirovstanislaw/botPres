package ru.sv.rgBotBack.parse.parsers;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
public class ParserUtils {
    private static final String pattern = "dd/MM/yyyy";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH);

    public static String removePointZero(String str) {
        try {
            return str.replace(".0", "");
        } catch (Exception ex) {
            return null;
        }
    }

    public static String getPlainDate(Date date) {
        if (date != null) {
            return (date.getDate()) + "/" + (date.getMonth() + 1) + "/" + (date.getYear() + 1900);
        } else {
            return null;
        }
    }

    public static Integer getInteger(String str) {
        try {
            int num = Integer.parseInt(str);

            return num;
        } catch (Exception ex) {
            System.out.println(("We get integer from: " + str));
            return null;
        }

    }

    public static Date makeJavaDate(String str) {
        try {
            LocalDate dateTime = LocalDate.parse(str, formatter);
            return Date.from(dateTime.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        } catch (Exception ex) {
            return null;
        }
    }

    //makeSlashStringDate
    public static String makeCorrectStringDate(String str) {
        if (str.contains(".")) {
            var replacedDot = str.replace('.', '/');
            if (replacedDot.length() == 9) {
                return ('0' + replacedDot);
            }
            return replacedDot;
        } else {
            return str;
        }
    }
}
