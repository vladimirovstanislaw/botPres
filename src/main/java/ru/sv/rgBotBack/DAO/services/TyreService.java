package ru.sv.rgBotBack.DAO.services;

import ru.sv.rgBotBack.DAO.model.Tyre;
import ru.sv.rgBotBack.parse.plainPOJO.TyrePOJO;

import java.util.List;
import java.util.Map;
public interface TyreService {
    Tyre findOne(long id);

    void create(Tyre entity);

    void createMassive(Map<String, TyrePOJO> map);

    List<Tyre> findAllTyresByTyreSetId(String tyreSetID);
}
