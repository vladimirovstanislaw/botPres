package ru.sv.rgBotBack.DAO.services;

import ru.sv.rgBotBack.DAO.model.WholeUserData;

public interface WholeUserDataService {
    WholeUserData getWholeDataByMobile(String mobile);
}
