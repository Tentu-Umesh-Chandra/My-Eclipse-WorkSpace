package testCasae;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority=2)
	void methodA() {
		System.out.println("Method A");
	}
	@Test(priority=0)
	void methodC() {
		System.out.println("Method C");
	}
	@Test(priority=1)
	void methodB() {
		System.out.println("Method B");
	}
}
