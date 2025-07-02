package selenium_Day1;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1_Basic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2408320\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		/*
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/forgot_password");
//		driver.findElement(By.id("email"));
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("abc@gmail.com");
		*/
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		EdgeDriver driver = new EdgeDriver(options);
		driver.get("https://the-internet.herokuapp.com/forgot_password");
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("abc@gmail.com");
	} 
}
