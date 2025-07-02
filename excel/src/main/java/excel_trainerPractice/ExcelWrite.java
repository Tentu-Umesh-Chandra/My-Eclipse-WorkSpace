package excel_trainerPractice;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook myworkbook = new XSSFWorkbook();
		XSSFSheet mysheet = myworkbook.createSheet("Sheet");
		
		XSSFRow headingrow = mysheet.createRow(0);
		XSSFCell hcell1 = headingrow.createCell(0);
		XSSFCell hcell2 = headingrow.createCell(1);
		XSSFCell hcell3 = headingrow.createCell(2);
		hcell1.setCellValue("FirstName");
		hcell2.setCellValue("LastName");
		hcell3.setCellValue("Age");
		
		XSSFRow headingrow1 = mysheet.createRow(1);
		XSSFCell icell1 = headingrow1.createCell(0);
		XSSFCell icell2 = headingrow1.createCell(1);
		XSSFCell icell3 = headingrow1.createCell(2);
		icell1.setCellValue("Muneeb");
		icell2.setCellValue("Md");
		icell3.setCellValue(22);
		
		XSSFRow headingrow2 = mysheet.createRow(2);
		XSSFCell jcell1 = headingrow2.createCell(0);
		XSSFCell jcell2 = headingrow2.createCell(1);
		XSSFCell jcell3 = headingrow2.createCell(2);
		jcell1.setCellValue("Bhai");
		jcell2.setCellValue("HAAA");
		jcell3.setCellValue(40);
		
		XSSFRow headingrow3 = mysheet.createRow(3);
		XSSFCell kcell1 = headingrow3.createCell(0);
		XSSFCell kcell2 = headingrow3.createCell(1);
		XSSFCell kcell3 = headingrow3.createCell(2);
		kcell1.setCellValue("Deepak");
		kcell2.setCellValue("Good");
		kcell3.setCellValue(25);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\2408320\\Downloads\\myFirstExcel.xlsx");
		myworkbook.write(fos);
		fos.close();
	}

}
