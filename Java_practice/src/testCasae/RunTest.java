package testCasae;

import org.testng.annotations.Test;

import graphql.Assert;

public class RunTest {
	@Test(retryAnalyzer=Return.class)
	void pass() {
		
	}
	@Test(retryAnalyzer=Return.class)
	void fail() {
		System.out.println("Fail");
		Assert.assertTrue(false);
	}
}
