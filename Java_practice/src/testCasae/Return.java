package testCasae;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Return implements IRetryAnalyzer{
	static int count = 2;
	@Override
	public boolean retry(ITestResult result) {
		if(count>0) {
			System.out.println("Retry: "+result.getMethod().getMethodName());
			count--;
			return true;
		}
		else {
			return false;
		}
	}
}
