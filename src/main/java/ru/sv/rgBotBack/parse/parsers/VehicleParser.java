package ru.sv.rgBotBack.parse.parsers;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.sv.rgBotBack.parse.plainPOJO.VehiclePOJO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
public class VehicleParser {
    private String filenameFrom = null;
    private HashMap<String, VehiclePOJO> asIsMap;

    private static final Logger logger = LoggerFactory.getLogger(VehicleParser.class);

    public VehicleParser(String filenameFrom) {
        super();
        this.filenameFrom = filenameFrom;
        asIsMap = new HashMap<String, VehiclePOJO>();
    }

    public void setFilenameFrom(String fileName) {
        this.filenameFrom = fileName;
    }

    public HashMap<String, VehiclePOJO> Parse() throws IOException {
        File myFile = new File(filenameFrom);

        FileInputStream fis = new FileInputStream(myFile);

        // Finds the workbook instance for XLSX file
        XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);

        // Return first sheet from the XLSX workbook
        XSSFSheet mySheet = myWorkBook.getSheetAt(0);

        // Get iterator to all the rows in current sheet
        Iterator<Row> rowIterator = mySheet.iterator();
        int countAllRows = 0;
        // Traversing over each row of XLSX file

        // Traversing over each row of XLSX file
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();

            //System.out.println(row.getCell(0) + "; " + row.getCell(1) + "; " + row.getCell(2));

            if (row == null) {
                continue;
            }
            if (row.getCell(1) == null) {
                continue;
            }
            if (row.getCell(1).getCellType() == Cell.CELL_TYPE_BLANK) {
                continue;
            }
            //continue for header of table
            if (row.getCell(1).toString().contains("Active")) {
                continue;
            }

            VehiclePOJO vehiclePOJO = new VehiclePOJO();
            vehiclePOJO.setActive(row.getCell(0).toString());
            vehiclePOJO.setVehicleVehicleName(row.getCell(1).toString());
            vehiclePOJO.setVehicleID(row.getCell(2).toString());
            vehiclePOJO.setVehicleOwnerAccountName(row.getCell(3).toString());
            vehiclePOJO.setVehicleOwnerAccountID18Digits(row.getCell(4).toString());
            vehiclePOJO.setVehicleOwnerAccountID(row.getCell(5).toString());
            vehiclePOJO.setVehicleCreatedBy(row.getCell(6).toString());
            vehiclePOJO.setVehicleCreatedBySFID(row.getCell(7).toString());
            vehiclePOJO.setVehicleLastModifiedDate(ParserUtils.makeCorrectStringDate(row.getCell(8).toString()));
            vehiclePOJO.setVehicleLastModifiedBy(row.getCell(9).toString());
            vehiclePOJO.setVehicleLastModifiedBySFID(row.getCell(10).toString());
            vehiclePOJO.setLicensePlateNumber(row.getCell(11).toString());
            vehiclePOJO.setLicensePlateNumberClean(row.getCell(12).toString());
            vehiclePOJO.setBrand(row.getCell(13).toString());
            vehiclePOJO.setModel(row.getCell(14).toString());
            vehiclePOJO.setEngine(row.getCell(15).toString());
            vehiclePOJO.setManufactureYear(row.getCell(16).toString());
            vehiclePOJO.setRegistrationCountry(row.getCell(17).toString());
            vehiclePOJO.setCountryCode(row.getCell(18).toString());
            vehiclePOJO.setCreatedAt(row.getCell(19).toString());
            vehiclePOJO.setInactivatedDate(ParserUtils.makeCorrectStringDate(row.getCell(20).toString()));
            vehiclePOJO.setAuthorAccount(row.getCell(21).toString());
            vehiclePOJO.setVehicleRecordType(row.getCell(22).toString());
            vehiclePOJO.setVehicleCreatedDate(ParserUtils.makeCorrectStringDate(row.getCell(23).toString()));


            asIsMap.put(vehiclePOJO.getVehicleID(), vehiclePOJO);
            countAllRows++;

        }
        logger.info("The number of entrys rows: {}", countAllRows);


        return asIsMap;
    }

}
