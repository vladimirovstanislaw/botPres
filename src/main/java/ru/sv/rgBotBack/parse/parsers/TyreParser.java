package ru.sv.rgBotBack.parse.parsers;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.sv.rgBotBack.parse.plainPOJO.TyrePOJO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
public class TyreParser {
    private String filenameFrom = null;
    private HashMap<String, TyrePOJO> asIsMap;

    private static final Logger logger = LoggerFactory.getLogger(TyreParser.class);

    public TyreParser(String filenameFrom) {
        super();
        this.filenameFrom = filenameFrom;
        asIsMap = new HashMap<String, TyrePOJO>();
    }

    public void setFilenameFrom(String fileName) {
        this.filenameFrom = fileName;
    }

    public HashMap<String, TyrePOJO> Parse() throws IOException {
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
            if (row.getCell(1).toString().contains("Tyre Set Name")) {
                continue;
            }

            TyrePOJO tyrePOJO = new TyrePOJO();
            tyrePOJO.setTyreName(row.getCell(0).toString());
            tyrePOJO.setRecordTypeTyre(row.getCell(1).toString());
            tyrePOJO.setTyreID(row.getCell(2).toString());
            tyrePOJO.setTyreSetName(row.getCell(3).toString());
            tyrePOJO.setTyreSetID(row.getCell(4).toString());
            tyrePOJO.setTyreSetRecordType(row.getCell(5).toString());
            tyrePOJO.setParentNumberOfTyres(ParserUtils.removePointZero(row.getCell(6).toString()));
            tyrePOJO.setOwnerAccountName(row.getCell(7).toString());
            tyrePOJO.setTyreStatus(row.getCell(8).toString());
            tyrePOJO.setSerialNumber(row.getCell(9).toString());
            tyrePOJO.setFactoryCode(row.getCell(10).toString());
            tyrePOJO.setSizeCode(row.getCell(11).toString());
            tyrePOJO.setManufacturedWeek(row.getCell(12).toString());
            tyrePOJO.setManufacturedYear(row.getCell(13).toString());
            tyrePOJO.setCreatedByFullName(row.getCell(14).toString());
            tyrePOJO.setCreatedByFullNameSFID(row.getCell(15).toString());
            tyrePOJO.setLastModifiedByFullName(row.getCell(16).toString());
            tyrePOJO.setLastModifiedByFullNameSFID(row.getCell(17).toString());
            tyrePOJO.setLastModifiedDate(ParserUtils.makeCorrectStringDate(row.getCell(18).toString()));
            tyrePOJO.setOwnerAccountID(row.getCell(19).toString());
            tyrePOJO.setOwnerAccountID18Digits(row.getCell(20).toString());
            tyrePOJO.setCreatedDate(ParserUtils.makeCorrectStringDate(row.getCell(21).toString()));

            asIsMap.put(tyrePOJO.getTyreID(), tyrePOJO);
            countAllRows++;

        }
        logger.info("The number of entrys rows: {}", countAllRows);


        return asIsMap;
    }

}