package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelUtils {
    public static String getCellData(String sheetName, int rowNum, int colNum) {
        try (FileInputStream fis = new FileInputStream("testdata/credentials.xlsx");
            Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(rowNum);
            Cell cell = row.getCell(colNum);
            return cell.getStringCellValue();
        } catch (Exception e) {
            System.out.println("Error reading Excel file: " + e.getMessage());
            return "";
        }
    }
}