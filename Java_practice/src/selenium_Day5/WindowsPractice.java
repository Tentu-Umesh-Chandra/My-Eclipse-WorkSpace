package selenium_Day5;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WindowsPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2408320\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		EdgeDriver driver = new EdgeDriver(options);
		driver.get("https://the-internet.herokuapp.com/windows");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);
		Set<String>windows = driver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.switchTo().window(child);
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.close();
	}

}
