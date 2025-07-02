package miniProj;
import java.io.*;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCases {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\Users\\2408320\\Eclipse_Work\\testNgDemo\\src\\test\\resources\\data.properties"));
		
		EdgeDriver driver = new EdgeDriver();
		driver.get(prop.getProperty("url"));
		
		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\credentials.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data");
		XSSFRow row = sheet.createRow(0);
		
	}
}