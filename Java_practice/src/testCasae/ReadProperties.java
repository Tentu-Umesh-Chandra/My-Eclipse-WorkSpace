package testCasae;
import java.util.*;
import java.io.*;
public class ReadProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		String path = System.getProperty("user.dir")+"\\src\\data.properties";
		//prop.load(new FileInputStream("C:\\Users\\2408320\\Eclipse_Work\\Java_practice\\data.properties"));
		System.out.println(path);
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
	}

}
