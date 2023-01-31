package ru.sv.rgBotBack.DAO.services;

import ru.sv.rgBotBack.DAO.model.ServiceEntry;
import ru.sv.rgBotBack.parse.plainPOJO.ServiceEntryPOJO;

import java.util.List;
import java.util.Map;
public interface ServiceEntryService {
    ServiceEntry findOne(long id);

    void create(ServiceEntry entity);

    void createMassive(Map<String, ServiceEntryPOJO> map);

    List<ServiceEntry> findAllServiceEntryByMobilePhone(String mobile);
}
