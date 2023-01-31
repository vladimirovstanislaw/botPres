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
import ru.sv.rgBotBack.DAO.model.ServiceEntry;
import ru.sv.rgBotBack.parse.plainPOJO.ServiceEntryPOJO;

import java.util.List;
import java.util.Map;
@Service
public class ServiceEntryServiceImpl implements ServiceEntryService {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private PlatformTransactionManager transactionManager;

    private TransactionTemplate transactionTemplate;
    private final String PLUS = "+";

    private Class<ServiceEntry> clazz = ServiceEntry.class;

    @Override
    public ServiceEntry findOne(long id) {
        return entityManager.find(clazz, id);
    }

    @Override
    @Transactional
    public void create(ServiceEntry entity) {
        entityManager.persist(entity);
    }

    @Override
    public void createMassive(Map<String, ServiceEntryPOJO> map) {
        transactionTemplate = new TransactionTemplate(transactionManager);
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                for (Map.Entry<String, ServiceEntryPOJO> entry : map.entrySet()) {
                    ServiceEntry tmp = new ServiceEntry(entry.getValue());
                    entityManager.persist(tmp);
                }
            }
        });
    }

    @Override
    public List<ServiceEntry> findAllServiceEntryByMobilePhone(String mobile) {
        return entityManager.createQuery("from " + ServiceEntry.class.getName() + " where ownerPersonAccountMobile=\'" + PLUS + mobile + "\'").getResultList();
    }
}
