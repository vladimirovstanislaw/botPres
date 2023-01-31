package ru.sv.rgBotBack.DAO.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import ru.sv.rgBotBack.DAO.model.TyreSet;
import ru.sv.rgBotBack.parse.plainPOJO.TyreSetPOJO;

import java.util.List;
import java.util.Map;
@Service
public class TyreSetServiceImpl implements TyreSetService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private PlatformTransactionManager transactionManager;

    private TransactionTemplate transactionTemplate;

    private Class<TyreSet> clazz = TyreSet.class;

    public TyreSet findOne(long id) {
        return entityManager.find(clazz, id);
    }

    @Transactional
    public void create(TyreSet entity) {
        entityManager.persist(entity);
    }

    @Override
    public void createMassive(Map<String, TyreSetPOJO> map) {
        transactionTemplate = new TransactionTemplate(transactionManager);
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                for (Map.Entry<String, TyreSetPOJO> entry : map.entrySet()) {
                    TyreSet tmp = new TyreSet(entry.getValue());
                    entityManager.persist(tmp);
                }
            }
        });
    }

    @Override
    public List<TyreSet> findByTyreSetId(String tyreSetID) {
        return entityManager.createQuery("from " + TyreSet.class.getName() + " where tyreSetID=\'" + tyreSetID + "\'", TyreSet.class).getResultList();
    }
//entityManager.createQuery("from " + Vehicle.class.getName() + " where vehicleID=\'" + carVehicleID + "\'").getResultList()
}