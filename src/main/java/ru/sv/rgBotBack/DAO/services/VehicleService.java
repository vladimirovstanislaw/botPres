package ru.sv.rgBotBack.DAO.services;

import ru.sv.rgBotBack.DAO.model.Vehicle;
import ru.sv.rgBotBack.parse.plainPOJO.VehiclePOJO;

import java.util.Map;
public interface VehicleService {
    Vehicle findOne(long id);

    void create(Vehicle entity);

    void createMassive(Map<String, VehiclePOJO> map);

    Vehicle findVehicleBySFId(String carVehicleID);
}
