package testCasae;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.*;

import org.testng.annotations.Test;



public class OtherTest {
	@Test
	void login() {
		AssertJUnit.assertTrue(false);
		System.out.println("Login");
	}
	@Test(dependsOnMethods="login")
	void logout(){
		System.out.println("Logout");
	}
	@Test (timeOut=2000)
	// "timeOut=2000" it fails the testcase if it does'nt execute in 2secs. 
	void forgetPassword() throws InterruptedException {
		Thread.sleep(3000);
	}
	@Parameters({"username"})
	@Test
	void getParameters(String data) {
		System.out.println("username:"+data);
	}
}
