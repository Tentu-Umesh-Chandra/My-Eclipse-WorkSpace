package testCasae;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import graphql.Assert;

public class AssertionTest {
	@Test
	void methodA() {
		//Assert.assertTrue(false); this statement helps to fail the testcase but runs the content that is above the statement the method
		System.out.println("Hello");
		Assert.assertTrue(false);
		System.out.println("Test A");
	}
	
	@Test
	void methodB() {
		System.out.println("hello");
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(false);
		System.out.println("Test B");
		soft.assertAll();
	}
}
