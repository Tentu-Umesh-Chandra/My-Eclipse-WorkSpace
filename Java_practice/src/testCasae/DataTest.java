package testCasae;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataTest {
	@Test(dataProvider="getData")
	void MethodA(String username, int pass) {
		System.out.println(username+"**"+pass);
	}
	@DataProvider
	Object[][]getData(){
		Object[][] data = new Object[2][2];
		data[0][0] = "user@123";
		data[0][1] = 12345;
		data[1][0] = "user@456";
		data[1][1] = 67890;
		return data;
	}
}
