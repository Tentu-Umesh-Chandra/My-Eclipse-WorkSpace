package testCasae;

import org.testng.annotations.Test;

public class MobileTest {
	@Test
	void mobileOn() {
		System.out.println("Mobile on Test");
	}
	@Test(groups="smoke")
	void mobileOff() {
		System.out.println("Mobile off Test");
	}
}
