package testCasae;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest {
	
	@BeforeSuite
	void beforeSuite() {
		System.out.println("BEfore Suite");
	}
	@AfterSuite
	void afterSuite() {
		System.out.println("After Suite");
	}
	@BeforeTest
	void beforeTest() {
		System.out.println("BEfore Test");
	}
	@AfterTest
	void afterTest() {
		System.out.println("After Test");
	}
	@BeforeClass
	void beforeClass() {
		System.out.println("BEfore Class");
	}
	@AfterClass
	void afterClass() {
		System.out.println("After Class");
	}
	@Test
	void paymentA() {
		System.out.println("Payment A");
	}
	@Test
	void paymentB() {
		System.out.println("Payment B");
	}
}
