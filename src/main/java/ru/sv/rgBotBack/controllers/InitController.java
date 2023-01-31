package ru.sv.rgBotBack.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sv.rgBotBack.DAO.services.ServiceEntryService;
import ru.sv.rgBotBack.DAO.services.TyreService;
import ru.sv.rgBotBack.DAO.services.TyreSetService;
import ru.sv.rgBotBack.DAO.services.VehicleService;
import ru.sv.rgBotBack.RgBotBackApplication;
import ru.sv.rgBotBack.parse.parsers.ServiceEntryParser;
import ru.sv.rgBotBack.parse.parsers.TyreParser;
import ru.sv.rgBotBack.parse.parsers.TyreSetParser;
import ru.sv.rgBotBack.parse.parsers.VehicleParser;
import ru.sv.rgBotBack.parse.plainPOJO.ServiceEntryPOJO;
import ru.sv.rgBotBack.parse.plainPOJO.TyrePOJO;
import ru.sv.rgBotBack.parse.plainPOJO.TyreSetPOJO;
import ru.sv.rgBotBack.parse.plainPOJO.VehiclePOJO;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.http.HttpStatus.OK;

@CrossOrigin("*")
@RestController
public class InitController {
    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private TyreSetService tyreSetService;

    @Autowired
    private TyreService tyreService;

    @Autowired
    private ServiceEntryService serviceEntryService;
    private int MAXIMUM_SIZE = 10000;
    private Logger logger = LoggerFactory.getLogger(InitController.class);

    //files with Tyres
    private final String filenameTyres_TEST = "Tyres.xlsx";

    //files with Vehicles
    private final String filenameVehicles_TEST = "Vehicles.xlsx";


    //files with TyreSets
    private final String filenameTyreSets_TEST = "TyreSets.xlsx";

    //files with ServiceEntries
    private final String filenameServiceEntries_TEST = "ServiceEntrys.xlsx";


    private final String STATIC = "/static/";
    private final String STATIC_VEHICLE = "/static/vehicle/";
    private final String STATIC_TYRE = "/static/tyre/";
    private final String STATIC_TYRE_SET = "/static/tyreSet/";
    private final String STATIC_SE = "/static/serviceEntry/";
    private Map<String, TyrePOJO> tyrePlain = new HashMap<>();
    private Map<String, TyreSetPOJO> tyreSetPlain = new HashMap<>();
    private Map<String, ServiceEntryPOJO> serviceEntryPlain = new HashMap<>();
    private Map<String, VehiclePOJO> vehiclePlain = new HashMap<>();

    @PostMapping(value = "/api/initData")
    public ResponseEntity initData() throws Exception {


        //parsing data
        logger.info("parsing data...");
        parseAndLoadData();
        logger.info("parsing data finished.");

        return ResponseEntity.ok(OK);
    }

    public void parseAndLoadData() throws Exception {

        //Tyres
        logger.info("Parsing Tyres...");
        List<String> listOfTyreFilenames = new ArrayList<>();
        listOfTyreFilenames.add(filenameTyres_TEST);

        for (int i = 0; i < listOfTyreFilenames.size(); i++) {
            URL resourceTyres = RgBotBackApplication.class.getResource(STATIC_TYRE + listOfTyreFilenames.get(i));
            logger.error(STATIC_TYRE + listOfTyreFilenames.get(i));
            var pathTyre = Paths.get(resourceTyres.toURI());
            logger.info("File TyreURL:{}", pathTyre.toAbsolutePath());

            TyreParser tyreParser = new TyreParser(pathTyre.toAbsolutePath().toString());
            var tmpMap = tyreParser.Parse();
            tyrePlain.putAll(tmpMap);
        }
        logger.info("Parsing Tyres finished.");
        logger.info("loading Tyre to the storage...");
        var listOfSplitedTyreMaps = splitTyreMap(tyrePlain);
        logger.info("TyreMaps.size(): {}", listOfSplitedTyreMaps.size());
        for (Map<String, TyrePOJO> map : listOfSplitedTyreMaps) {
            logger.info("splitedTyremap.size(): {}", map.size());
            tyreService.createMassive(map);
        }
        logger.info("loading Tyre to the storage done.");

        //Vehicles
        logger.info("Parsing Vehicles...");
        List<String> listOfVehiclesFilenames = new ArrayList<>();
        listOfVehiclesFilenames.add(filenameVehicles_TEST);

        for (int i = 0; i < listOfVehiclesFilenames.size(); i++) {

            URL resourceVehicles = RgBotBackApplication.class.getResource(STATIC_VEHICLE + listOfVehiclesFilenames.get(i));
            logger.error(STATIC_TYRE + listOfVehiclesFilenames.get(i));
            var pathVehicles = Paths.get(resourceVehicles.toURI());
            logger.info("File VehiclesURL:{}", pathVehicles.toAbsolutePath());

            VehicleParser vehicleParser = new VehicleParser(pathVehicles.toAbsolutePath().toString());
            var vehicleMapTmp = vehicleParser.Parse();
            vehiclePlain.putAll(vehicleMapTmp);

        }
        logger.info("Parsing Vehicles finished.");

        logger.info("loading Vehicle to the storage...");
        var listOfSplitedVehicleMaps = splitVehicleMap(vehiclePlain);
        logger.info("VehicleMaps.size(): {}", listOfSplitedVehicleMaps.size());
        for (Map<String, VehiclePOJO> map : listOfSplitedVehicleMaps) {
            logger.info("splitedVehicleMap.size(): {}", map.size());
            vehicleService.createMassive(map);
        }
        logger.info("loading Vehicle to the storage done.");


        //TyreSets
        logger.info("Parsing TyreSets...");
        List<String> listOfTyreSetsFilenames = new ArrayList<>();
        listOfTyreSetsFilenames.add(filenameTyreSets_TEST);
        for (int i = 0; i < listOfTyreSetsFilenames.size(); i++) {
            URL resourceTyreSets = RgBotBackApplication.class.getResource(STATIC_TYRE_SET + listOfTyreSetsFilenames.get(i));
            logger.error(STATIC_TYRE + listOfTyreSetsFilenames.get(i));
            var pathTyreSets = Paths.get(resourceTyreSets.toURI());
            logger.info("File TyreSetsURL:{}", pathTyreSets.toAbsolutePath());

            TyreSetParser tyreSetParser = new TyreSetParser(pathTyreSets.toAbsolutePath().toString());
            var tyreSetTmp = tyreSetParser.Parse();
            tyreSetPlain.putAll(tyreSetTmp);
        }
        logger.info("Parsing TyreSets finished.");

        logger.info("loading TyreSet to the storage...");
        var listOfSplitedTyreSetMaps = splitTyreSetMap(tyreSetPlain);
        logger.info("TyreSetMaps.size(): {}", listOfSplitedTyreSetMaps.size());
        for (Map<String, TyreSetPOJO> map : listOfSplitedTyreSetMaps) {
            logger.info("splitedTyreSetMap.size(): {}", map.size());
            tyreSetService.createMassive(map);
        }
        logger.info("loading TyreSet to the storage done.");

        //ServiceEntries
        logger.info("Parsing ServiceEntries...");
        List<String> listOfServiceEntriesFilenames = new ArrayList<>();
        listOfServiceEntriesFilenames.add(filenameServiceEntries_TEST);

        for (int i = 0; i < listOfServiceEntriesFilenames.size(); i++) {
            URL resourceServiceEntries = RgBotBackApplication.class.getResource(STATIC_SE + listOfServiceEntriesFilenames.get(i));
            logger.error(STATIC_TYRE + listOfServiceEntriesFilenames.get(i));
            var pathServiceEntries = Paths.get(resourceServiceEntries.toURI());
            logger.info("File ServiceEntriesURL:{}", pathServiceEntries.toAbsolutePath());

            ServiceEntryParser serviceEntryParser = new ServiceEntryParser(pathServiceEntries.toAbsolutePath().toString());
            var serviceEntryMapTmp = serviceEntryParser.Parse();
            serviceEntryPlain.putAll(serviceEntryMapTmp);
        }
        logger.info("Parsing ServiceEntries finished.");
        logger.info("loading ServiceEntry to the storage...");
        var listOfSplitedServiceEntryMaps = splitServiceEntryMap(serviceEntryPlain);
        logger.info("ServiceEntryMaps.size(): {}", listOfSplitedServiceEntryMaps.size());
        for (Map<String, ServiceEntryPOJO> map : listOfSplitedServiceEntryMaps) {
            logger.info("splitedServiceEntryMap.size(): {}", map.size());
            serviceEntryService.createMassive(map);
        }
        logger.info("loading ServiceEntry to the storage done.");

    }

    private List<Map<String, TyrePOJO>> splitTyreMap(Map<String, TyrePOJO> original) {

        List<Map<String, TyrePOJO>> splitMaps = new ArrayList<>();
        Map<String, TyrePOJO> current = new HashMap<>();

        for (Map.Entry<String, TyrePOJO> entry : original.entrySet()) {
            current.put(entry.getKey(), entry.getValue());

            if (current.size() >= MAXIMUM_SIZE) {
                splitMaps.add(current);
                current = new HashMap<>();
            }
        }

        if (!current.isEmpty()) {
            splitMaps.add(current);
        }
        return splitMaps;
    }

    private List<Map<String, TyreSetPOJO>> splitTyreSetMap(Map<String, TyreSetPOJO> original) {

        List<Map<String, TyreSetPOJO>> splitMaps = new ArrayList<>();
        Map<String, TyreSetPOJO> current = new HashMap<>();

        for (Map.Entry<String, TyreSetPOJO> entry : original.entrySet()) {
            current.put(entry.getKey(), entry.getValue());

            if (current.size() >= MAXIMUM_SIZE) {
                splitMaps.add(current);
                current = new HashMap<>();
            }
        }

        if (!current.isEmpty()) {
            splitMaps.add(current);
        }
        return splitMaps;
    }

    private List<Map<String, VehiclePOJO>> splitVehicleMap(Map<String, VehiclePOJO> original) {

        List<Map<String, VehiclePOJO>> splitMaps = new ArrayList<>();
        Map<String, VehiclePOJO> current = new HashMap<>();

        for (Map.Entry<String, VehiclePOJO> entry : original.entrySet()) {
            current.put(entry.getKey(), entry.getValue());

            if (current.size() >= MAXIMUM_SIZE) {
                splitMaps.add(current);
                current = new HashMap<>();
            }
        }

        if (!current.isEmpty()) {
            splitMaps.add(current);
        }
        return splitMaps;
    }

    private List<Map<String, ServiceEntryPOJO>> splitServiceEntryMap(Map<String, ServiceEntryPOJO> original) {

        List<Map<String, ServiceEntryPOJO>> splitMaps = new ArrayList<>();
        Map<String, ServiceEntryPOJO> current = new HashMap<>();

        for (Map.Entry<String, ServiceEntryPOJO> entry : original.entrySet()) {
            current.put(entry.getKey(), entry.getValue());

            if (current.size() >= MAXIMUM_SIZE) {
                splitMaps.add(current);
                current = new HashMap<>();
            }
        }

        if (!current.isEmpty()) {
            splitMaps.add(current);
        }
        return splitMaps;
    }


}
