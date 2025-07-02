package maven_practice1;

import java.io.*;
import java.util.*;

public class Base {
	public String getUrl() throws IOException{
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\Users\\2408320\\Eclipse_Work\\Java_practice\\src\\data.properties"));
		return prop.getProperty("url");
	}
}
