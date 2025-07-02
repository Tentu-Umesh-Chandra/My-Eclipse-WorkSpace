package pages;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import bases.Base;
public class LoginPageTest extends Base{
	LoginPage2 page;
	@BeforeClass
	public void setup() {
		initializeBrowser();
	}
	@BeforeMethod
	public void methodSetup() {
		driver.get("file:///C:/Users/2408320/Downloads/login_page.html");
		page = new LoginPage2(driver);
	}
	@AfterMethod
	public void methodShutDown() {
		page = null;
	}
	@Test
	public void testPositiveLogin() {
		page.enterUserName("alex@abc");
		page.enterPassword("P@ssword123");
		page.clickBtn();
		Assert.assertTrue(page.isMessageSuccess());
	}
	@Test
	public void testNegativeLogin() {
		page.enterUserName("alex@abc");
		page.enterPassword("P@assword13");
		page.clickBtn();
		Assert.assertTrue(page.isMessageFailure());
	}
	@AfterClass
	public void tearDown() {
		closeBrowser();
	}
	
}
