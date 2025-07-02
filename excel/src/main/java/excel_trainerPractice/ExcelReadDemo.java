package excel_trainerPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadDemo {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\2408320\\Downloads\\dataAddition.xlsx");
		XSSFWorkbook myWorkbook = new XSSFWorkbook(fis);
		XSSFSheet mySheet = myWorkbook.getSheet("Sheet1");
		//XSSFSheet mySheet = myWorkbook.getSheetAt(0);
		int noOfRows = mySheet.getLastRowNum();
		int noOfCols = mySheet.getRow(0).getLastCellNum();
		//XSSFRow row = mySheet;
		for(Row row:mySheet) {
			for(Cell cell:row) {
				switch (cell.getCellType()) {
					case BOOLEAN:
						System.out.println(cell.getBooleanCellValue()+" ");
						break;
					case NUMERIC:
						System.out.println(cell.getNumericCellValue()+" ");
						break;
					case STRING:
						System.out.println(cell.getStringCellValue()+" ");
						break;
				}
				//System.out.println((int)cell.getNumericCellValue()+" ");
			}
			System.out.println();
		}
		ExcelReadDemo obj = new ExcelReadDemo();
		int arr[][] = obj.returningArray(noOfRows,noOfCols,mySheet);
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public int[][] returningArray(int noOfRows, int noOfCols, XSSFSheet Sheet){
		int array[][] = new int[noOfRows][noOfCols];
		int r1=0;
		for(int r=1; r<=noOfRows; r++) {
			XSSFRow curRow = Sheet.getRow(r);
			for(int c=0; c<noOfCols; c++) {
				XSSFCell curCell = curRow.getCell(c);
				array[r1][c] = (int)curCell.getNumericCellValue();
			}
			r1++;
		}
		return array;
	}
		
	}