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
import ru.sv.rgBotBack.DAO.model.Vehicle;
import ru.sv.rgBotBack.parse.plainPOJO.VehiclePOJO;

import java.util.List;
import java.util.Map;
@Service
public class VehicleServiceImpl implements VehicleService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private PlatformTransactionManager transactionManager;

    private TransactionTemplate transactionTemplate;

    private Class<Vehicle> clazz = Vehicle.class;

    public Vehicle findOne(long id) {
        return entityManager.find(clazz, id);
    }

    @Transactional
    public void create(Vehicle entity) {
        entityManager.persist(entity);
    }

    @Override
    public void createMassive(Map<String, VehiclePOJO> map) {
        transactionTemplate = new TransactionTemplate(transactionManager);
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                for (Map.Entry<String, VehiclePOJO> entry : map.entrySet()) {
                    Vehicle tmp = new Vehicle(entry.getValue());
                    entityManager.persist(tmp);
                }
            }
        });
    }

    @Override
    public Vehicle findVehicleBySFId(String carVehicleID) {
        List<Vehicle> list = entityManager.createQuery("from " + Vehicle.class.getName() + " where vehicleID=\'" + carVehicleID + "\'").getResultList();
        if (list.size() == 1) {
            return list.get(0);
        } else if (list.size() > 1) {
            throw new RuntimeException("More than 1 vehicle within 1 ServiceEntry, it's a monstaaaar");
        } else {
            return null;
        }
    }

}
