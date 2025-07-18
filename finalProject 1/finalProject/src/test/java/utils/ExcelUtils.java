package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
import java.io.FileInputStream;
 
public class ExcelUtils {
    public static String[][] getCellData(String fileName, String sheetName) throws Exception {
    	FileInputStream fis = new FileInputStream(fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		String[][] data = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		int r = 0;
		for(Row row: sheet) {
			if(row.getRowNum() != 0) {
				int c = 0;
				for(Cell cell: row) {
					if (cell.getCellType() == CellType.NUMERIC) {
						data[r][c] = String.valueOf((int) cell.getNumericCellValue());
						c++;
					}
					else if(cell.getCellType() == CellType.STRING) {
						data[r][c] = cell.getStringCellValue();
						c++;
					}
					
				}
				r++;
			}
		}
		return data;
    }
}
