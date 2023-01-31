package ru.sv.rgBotBack.DAO.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sv.rgBotBack.DAO.model.*;

import java.util.List;
@Service
public class WholeUserDataServiceImpl implements WholeUserDataService {
    private Logger logger = LoggerFactory.getLogger(WholeUserDataServiceImpl.class);
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    VehicleService vehicleService;

    @Autowired
    TyreSetService tyreSetService;

    @Autowired
    TyreService tyreService;

    @Autowired
    ServiceEntryService serviceEntryService;

    @Override
    public WholeUserData getWholeDataByMobile(String mobile) {
        WholeUserData data = null;
        List<ServiceEntry> serviceEntryList = serviceEntryService.findAllServiceEntryByMobilePhone(mobile);
        if (serviceEntryList.size() > 0) {
            //tyres was bough/were activated guarantee
            data = new WholeUserData();


            for (ServiceEntry se : serviceEntryList) {
                var seWithOtherData = new ServiceEntryWithOtherData();
                seWithOtherData.setServiceEntry(se);

                //fill data TyreSets
                List<TyreSet> tyreSetList = tyreSetService.findByTyreSetId(se.getTyreSetID());//a2c0J000002lDFY 79165516090
                if (tyreSetList.size() > 0) {
                    seWithOtherData.setTyreSet(tyreSetList.get(0));
                }
                //fill data Tyres
                List<Tyre> tyreList = tyreService.findAllTyresByTyreSetId(se.getTyreSetID());
                if (tyreSetList.size() > 0) {
                    seWithOtherData.setTyreList(tyreList);
                }
                //fill data Vehicles
                Vehicle vehicle = vehicleService.findVehicleBySFId(se.getCarVehicleID());
                if (tyreSetList.size() > 0) {
                    seWithOtherData.setVehicle(vehicle);
                }
                data.addServiceEntryWithOtherDataToCollection(seWithOtherData);
            }

        }
        return data;
    }
}
