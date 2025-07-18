package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

    public static void writeCompanyData(List<String> names, List<String> prices, String path) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Insurance Details");

        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("Company");
        header.createCell(1).setCellValue("Price");

        for (int i = 0; i < names.size(); i++) {
            Row row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(names.get(i));
            row.createCell(1).setCellValue(prices.get(i));
        }

        sheet.autoSizeColumn(0);
        sheet.autoSizeColumn(1);
        FileOutputStream fos = new FileOutputStream(path);
        workbook.write(fos);
        workbook.close();
        fos.close();
    }
    public static void writeSingleColumnData(List<String> items, String heading, String path) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Health Insurance Menu");

        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue(heading);

        for (int i = 0; i < items.size(); i++) {
            Row row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(items.get(i));
        }

        sheet.autoSizeColumn(0);
        FileOutputStream fos = new FileOutputStream(path);
        workbook.write(fos);
        workbook.close();
        fos.close();
}
}
