/*
package maven_practice1;
import java.io.FileInputStream;
import java.util.*;
import java.util.Iterator;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.*;
public class ExcelRead {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String path = "C:\\Users\\2408320\\Eclipse_Work\\SelemiumPractice\\src\\main\\resources\\ExcelData.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook workBook = new XSSFWorkbook(fis);
		Sheet sheet = workBook.getSheetAt(0);
		Iterator<Row>rows = sheet.rowIterator();
		while(rows.hasNext()){
			Row row=rows.next();
			Iterator<Cell>cells=row.cellIterator();
			while(cells.hasNext()){
				Cell cell=cells.next();
				System.out.print(cell.toString()+" ");
			}
			System.out.println();
		}
	}
}
*/
//package maven_practice1;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//class Person {
//    int id;
//    String name;
//    public Person(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return id + " " + name;
//    }
//}
//
//public class ExcelRead {
//    public static void main(String[] args) throws Exception {
//        String path = "C:\\Users\\2408320\\Eclipse_Work\\SelemiumPractice\\src\\main\\resources\\ExcelData.xlsx";
//        FileInputStream fis = new FileInputStream(path);
//        Workbook workBook = new XSSFWorkbook(fis);
//        Sheet sheet = workBook.getSheetAt(0);
//        Iterator<Row> rows = sheet.rowIterator();
//        List<Person> personList = new ArrayList<>();
//        
//        boolean isHeader = true; // Track the first row
//        while (rows.hasNext()) {
//            Row row = rows.next();
//            
//            // Skip the header row
//            if (isHeader) {
//                isHeader = false;
//                continue;
//            }
//            Iterator<Cell> cells = row.cellIterator();
//            int id = 0;
//            String name = "";
//            while (cells.hasNext()) {
//                Cell cell = cells.next();
//                if (cell.getColumnIndex() == 0) { // First column (ID)
//                    if (cell.getCellType() == CellType.NUMERIC) {
//                        id = (int) cell.getNumericCellValue(); // Convert to integer
//                    } else if (cell.getCellType() == CellType.STRING) {
//                        try {
//                            id = Integer.parseInt(cell.getStringCellValue()); // Convert string to integer
//                        } catch (NumberFormatException e) {
//                            System.err.println("Invalid ID format: " + cell.getStringCellValue());
//                            continue; // Skip invalid values
//                        }
//                    }
//                } else if (cell.getColumnIndex() == 1) { // Second column (Name)
//                    name = cell.getStringCellValue();
//                }
//            }
//
//            if (id > 0 && !name.isEmpty()) {
//                personList.add(new Person(id, name));
//            }
//        }
//        /*
//        while (rows.hasNext()) {
//            Row row = rows.next();
//            Iterator<Cell> cells = row.cellIterator();
//
//            int id = 0;
//            String name = "";
//
//            while (cells.hasNext()) {
//                Cell cell = cells.next();
//                
//                if (cell.getCellType() == CellType.NUMERIC) {
//                    id = (int) cell.getNumericCellValue(); // Convert numeric value to integer
//                } else if (cell.getCellType() == CellType.STRING) {
//                    id = Integer.parseInt(cell.getStringCellValue()); // Convert string value to integer
//                }
//                
//                
////                if (cell.getColumnIndex() == 0) { // Assuming first column is ID
////                    id = (int) cell.getNumericCellValue(); // Convert to integer
////                } else if (cell.getColumnIndex() == 1) { // Assuming second column is Name
////                    name = cell.getStringCellValue();
////                }
//                
//                
//            }
//
//            if (id > 0 && !name.isEmpty()) {
//                personList.add(new Person(id, name));
//            }
//        }
//        */
//        // Add the new entry (Id=104, Name="Rajat") to the list
//        personList.add(new Person(104, "Rajat"));
//        // Write the updated data back to the Excel sheet
//        Row newRow = sheet.createRow(sheet.getLastRowNum() + 1);
//        newRow.createCell(0).setCellValue(104);
//        newRow.createCell(1).setCellValue("Rajat");
//        // Save changes
//        FileOutputStream fos = new FileOutputStream(path);
//        workBook.write(fos);
//        fos.close();
//        workBook.close();
//        // Print the list
//        for (Person person : personList) {
//            System.out.println(person);
//        }
//    }
//}
package maven_practice1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class Person {
    int id;
    String name;
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class ExcelRead {
    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\2408320\\Eclipse_Work\\SelemiumPractice\\src\\main\\resources\\ExcelData.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook workBook = new XSSFWorkbook(fis);
        Sheet sheet = workBook.getSheetAt(0);
        Iterator<Row> rows = sheet.rowIterator();
        List<Person> personList = new ArrayList<>();
        
        boolean isHeader = true; // Track the first row
        while (rows.hasNext()) {
            Row row = rows.next();
            
            // Skip the header row
            if (isHeader) {
                isHeader = false;
                continue;
            }
            Iterator<Cell> cells = row.cellIterator();
            int id = 0;
            String name = "";
            while (cells.hasNext()) {
                Cell cell = cells.next();
                if (cell.getColumnIndex() == 0) { // First column (ID)
                    if (cell.getCellType() == CellType.NUMERIC) {
                        id = (int) cell.getNumericCellValue(); // Convert to integer
                    } 
                    else if (cell.getCellType() == CellType.STRING) {
                        try {
                            id = Integer.parseInt(cell.getStringCellValue()); // Convert string to integer
                        } 
                        catch (NumberFormatException e) {
                            System.err.println("Invalid ID format: " + cell.getStringCellValue());
                            continue; // Skip invalid values
                        }
                    }
                } 
                else if (cell.getColumnIndex() == 1) { // Second column (Name)
                    name = cell.getStringCellValue();
                }
            }
            if (id > 0 && !name.isEmpty()) {
                personList.add(new Person(id, name));
            }
        }
        // Add the new entry (Id=104, Name="Rajat") to the list
        personList.add(new Person(104, "Rajat"));
        // Write the updated data back to the Excel sheet
        Row newRow = sheet.createRow(sheet.getLastRowNum() + 1);
        newRow.createCell(0).setCellValue(104);
        newRow.createCell(1).setCellValue("Rohan");
        // Save changes
        FileOutputStream fos = new FileOutputStream(path);
        workBook.write(fos);
        fos.close();
        workBook.close();
        // Print the list
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}