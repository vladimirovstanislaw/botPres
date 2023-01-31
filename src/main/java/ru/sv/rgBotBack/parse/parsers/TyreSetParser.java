package ru.sv.rgBotBack.parse.parsers;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.sv.rgBotBack.parse.plainPOJO.TyreSetPOJO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
public class TyreSetParser {
    private String filenameFrom = null;
    private HashMap<String, TyreSetPOJO> asIsMap;

    private static final Logger logger = LoggerFactory.getLogger(TyreParser.class);

    public TyreSetParser(String filenameFrom) {
        super();
        this.filenameFrom = filenameFrom;
        asIsMap = new HashMap<String, TyreSetPOJO>();
    }

    public void setFilenameFrom(String fileName) {
        this.filenameFrom = fileName;
    }

    public HashMap<String, TyreSetPOJO> Parse() throws IOException {
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
            if (row.getCell(1).toString().contains("Purchase Date")) {
                continue;
            }

            TyreSetPOJO tyreSetPOJO = new TyreSetPOJO();
            tyreSetPOJO.setPurchaseDate(ParserUtils.makeCorrectStringDate(row.getCell(0).toString()));
            tyreSetPOJO.setTyreSetName(row.getCell(1).toString());
            tyreSetPOJO.setTyreSetID(row.getCell(2).toString());
            tyreSetPOJO.setRecordType(row.getCell(3).toString());
            tyreSetPOJO.setPurchaseCountry(row.getCell(4).toString());
            tyreSetPOJO.setCountryCode(row.getCell(5).toString());
            tyreSetPOJO.setNumberOfTyres(ParserUtils.removePointZero(row.getCell(6).toString()));
            tyreSetPOJO.setSizeCode(row.getCell(7).toString());
            tyreSetPOJO.setPointOfSaleAccountName(row.getCell(8).toString());
            tyreSetPOJO.setAccountID(row.getCell(9).toString());
            tyreSetPOJO.setPointOfSaleAccountID18Digits(row.getCell(10).toString());
            tyreSetPOJO.setPointOfSaleCompanySiteCode(row.getCell(11).toString());
            tyreSetPOJO.setServiceEntryID(row.getCell(12).toString());
            tyreSetPOJO.setServiceEntryId18d(row.getCell(13).toString());
            tyreSetPOJO.setOwnerAccountName(row.getCell(14).toString());
            tyreSetPOJO.setOwnerAccountID18Digits(row.getCell(15).toString());
            tyreSetPOJO.setOwnerPersonAccountMobile(row.getCell(16).toString());
            tyreSetPOJO.setProductProductName(row.getCell(17).toString());
            tyreSetPOJO.setProductProductCode(row.getCell(18).toString());
            tyreSetPOJO.setCarVehicleName(row.getCell(19).toString());
            tyreSetPOJO.setCarVehicleID(row.getCell(20).toString());
            tyreSetPOJO.setCreatedByFullName(row.getCell(21).toString());
            tyreSetPOJO.setCreatedByFullNameSFID(row.getCell(22).toString());
            tyreSetPOJO.setLastModifiedDate(ParserUtils.makeCorrectStringDate(row.getCell(23).toString()));
            tyreSetPOJO.setLastModifiedByFullName(row.getCell(24).toString());
            tyreSetPOJO.setLastModifiedByFullNameSFID(row.getCell(25).toString());
            tyreSetPOJO.setCreatedDate(ParserUtils.makeCorrectStringDate(row.getCell(26).toString()));
            asIsMap.put(tyreSetPOJO.getTyreSetID(), tyreSetPOJO);
            countAllRows++;

        }
        logger.info("The number of entrys rows: {}", countAllRows);


        return asIsMap;
    }

}
