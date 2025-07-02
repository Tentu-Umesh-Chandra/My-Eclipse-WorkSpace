package myPacKagE;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTestNgDemo {
	@Test
	public void testAddition() {
		int a = 10;
		int b = 15;
		int result = a+b;
		Assert.assertEquals(result, 25,"Addition testCase Failed");
	}
	@Test
	public void testSubtraction() {
		int a = 10;
		int b = 15;
		int result = a-b;
		Assert.assertEquals(result, -5,"Addition testCase Failed");
	}
	
	
	@DataProvider(name="adding")
	public Integer[][] dataProvider() {
		return new Integer[][]{{1,2,3},{22,23,45},{12,18,30}};
	}
	@Test(dataProvider="adding")
	public void testAdding(int a, int b, int result) {
		int expected = a+b;
		Assert.assertEquals(expected, result,"Wrong Adding was done");
	}
	
	
	@DataProvider(name="subtracting")
	public Integer[][] dataProviderSubs() {
		return new Integer[][]{{1,2,-1},{22,23,-1},{12,18,-6}};
	}
	@Test(dataProvider="subtracting")
	public void testSubtracting(int a, int b, int result) {
		int expected = a-b;
		Assert.assertEquals(expected, result,"Wrong Adding was done");
	}
}