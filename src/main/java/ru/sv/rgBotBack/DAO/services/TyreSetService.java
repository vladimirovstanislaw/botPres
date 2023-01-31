package ru.sv.rgBotBack.DAO.services;

import ru.sv.rgBotBack.DAO.model.TyreSet;
import ru.sv.rgBotBack.parse.plainPOJO.TyreSetPOJO;

import java.util.List;
import java.util.Map;
public interface TyreSetService {
    TyreSet findOne(long id);

    void create(TyreSet entity);

    void createMassive(Map<String, TyreSetPOJO> map);

    List<TyreSet> findByTyreSetId(String tyreSetID);
}
