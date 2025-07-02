package testCasae;

import org.testng.annotations.Test;

public class LoginTest {
	@Test
	void login() {
		System.out.println("Login Test");
	}
	@Test(groups="smoke")
	void logout() {
		try {
			int num = 10/0;
		}
		catch (Exception ex) {
			System.out.println("Exceptionn Occured & Handeled");
		}
		//System.out.println("Logout Test");
	}
}
