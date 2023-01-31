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
import ru.sv.rgBotBack.DAO.model.Tyre;
import ru.sv.rgBotBack.parse.plainPOJO.TyrePOJO;

import java.util.List;
import java.util.Map;
@Service
public class TyreServiceImpl implements TyreService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private PlatformTransactionManager transactionManager;

    private TransactionTemplate transactionTemplate;

    private Class<Tyre> clazz = Tyre.class;

    public Tyre findOne(long id) {
        return entityManager.find(clazz, id);
    }

    @Transactional
    public void create(Tyre entity) {
        entityManager.persist(entity);
    }

    @Override
    public void createMassive(Map<String, TyrePOJO> map) {
        transactionTemplate = new TransactionTemplate(transactionManager);
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                for (Map.Entry<String, TyrePOJO> entry : map.entrySet()) {
                    Tyre tmp = new Tyre(entry.getValue());
                    entityManager.persist(tmp);
                }
            }
        });
    }

    @Override
    public List<Tyre> findAllTyresByTyreSetId(String tyreSetID) {
        return entityManager.createQuery("from " + Tyre.class.getName() + " where tyreSetID=\'" + tyreSetID + "\'").getResultList();
    }

}
