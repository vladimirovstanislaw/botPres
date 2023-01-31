package ru.sv.rgBotBack.parse.parsers;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.sv.rgBotBack.parse.plainPOJO.ServiceEntryPOJO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
public class ServiceEntryParser {
    private String filenameFrom = null;
    private HashMap<String, ServiceEntryPOJO> asIsMap;

    private static final Logger logger = LoggerFactory.getLogger(TyreParser.class);

    public ServiceEntryParser(String filenameFrom) {
        super();
        this.filenameFrom = filenameFrom;
        asIsMap = new HashMap<String, ServiceEntryPOJO>();
    }

    public void setFilenameFrom(String fileName) {
        this.filenameFrom = fileName;
    }

    public HashMap<String, ServiceEntryPOJO> Parse() throws IOException {
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
        outer:
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
            if (row.getCell(1).toString().contains("Record Type")) {
                continue;
            }

            ServiceEntryPOJO serviceEntryPOJO = new ServiceEntryPOJO();

            serviceEntryPOJO.setCreatedDate(ParserUtils.makeCorrectStringDate(row.getCell(0).toString()));
            serviceEntryPOJO.setRecordType(row.getCell(1).toString());
            serviceEntryPOJO.setCampaignCampaignName(row.getCell(2).toString());
            serviceEntryPOJO.setCampaignCampaignID(row.getCell(3).toString());
            serviceEntryPOJO.setServiceEntryID(row.getCell(4).toString());
            serviceEntryPOJO.setServiceEntryId18d(row.getCell(5).toString());
            serviceEntryPOJO.setCreatedByFullName(row.getCell(6).toString());
            serviceEntryPOJO.setCreatedByFullNameSFID(row.getCell(7).toString());
            serviceEntryPOJO.setLastModifiedDate(ParserUtils.makeCorrectStringDate(row.getCell(8).toString()));
            serviceEntryPOJO.setLastModifiedByFullName(row.getCell(9).toString());
            serviceEntryPOJO.setLastModifiedByFullNameSFID(row.getCell(10).toString());
            serviceEntryPOJO.setValidFrom(ParserUtils.makeCorrectStringDate(row.getCell(11).toString()));
            serviceEntryPOJO.setValidTo(ParserUtils.makeCorrectStringDate(row.getCell(12).toString()));
            serviceEntryPOJO.setTyreModel(row.getCell(13).toString());
            serviceEntryPOJO.setIssueCountry(row.getCell(14).toString());
            serviceEntryPOJO.setCountryCode(row.getCell(15).toString());
            serviceEntryPOJO.setStatus(row.getCell(16).toString());
            serviceEntryPOJO.setServiceCode(row.getCell(17).toString());
            serviceEntryPOJO.setExternalServiceID(row.getCell(18).toString());
            serviceEntryPOJO.setCreatedAt(row.getCell(19).toString());
            serviceEntryPOJO.setPointOfSaleAccountName(row.getCell(20).toString());
            serviceEntryPOJO.setAccountID(row.getCell(21).toString());
            serviceEntryPOJO.setPointOfSaleAccountID18Digits(row.getCell(22).toString());
            serviceEntryPOJO.setPointOfSaleCompanySiteCode(row.getCell(23).toString());
            serviceEntryPOJO.setTyreSetName(row.getCell(24).toString());
            serviceEntryPOJO.setTyreSetID(row.getCell(25).toString());
            serviceEntryPOJO.setOwnerAccountName(row.getCell(26).toString());
            serviceEntryPOJO.setOwnerAccountID18Digits(row.getCell(27).toString());
            serviceEntryPOJO.setOwnerPersonAccountMobile(row.getCell(28).toString());
            serviceEntryPOJO.setProductProductName(row.getCell(29).toString());
            serviceEntryPOJO.setProductProductCode(row.getCell(30).toString());
            serviceEntryPOJO.setCarVehicleName(row.getCell(31).toString());
            serviceEntryPOJO.setCarVehicleID(row.getCell(32).toString());
            serviceEntryPOJO.setCarLicensePlateNumber(row.getCell(33).toString());
            serviceEntryPOJO.setOwnerOwnerID(row.getCell(34).toString());
            serviceEntryPOJO.setDateOfIssue(ParserUtils.makeCorrectStringDate(row.getCell(35).toString()));
            if (serviceEntryPOJO.getOwnerPersonAccountMobile().contains("79826711489") || serviceEntryPOJO.getOwnerPersonAccountMobile().contains("79059822228")) {
                logger.error("89 - bad; 28 - good:{}", serviceEntryPOJO.toString());
            }
            asIsMap.put(serviceEntryPOJO.getServiceEntryId18d(), serviceEntryPOJO);
            countAllRows++;

        }
        logger.info("The number of entrys rows: {}", countAllRows);


        return asIsMap;
    }

}