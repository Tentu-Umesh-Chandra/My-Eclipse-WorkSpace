package miniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class AddEditTheEmployeeDetails {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2408320\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		EdgeDriver driver = new EdgeDriver(options);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input.oxd-input.oxd-input--active.orangehrm-firstname")).sendKeys("Muneeb");
		driver.findElement(By.cssSelector("input.oxd-input.oxd-input--active.orangehrm-middlename")).sendKeys("Khan");
		driver.findElement(By.cssSelector("input.oxd-input.oxd-input--active.orangehrm-lastname")).sendKeys("Md");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("8945");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys("muneeb20003");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys("MuNeEb@2004");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys("MuNeEb@2004");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Employee List\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),\"Muneeb\")]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[text()=\"-- Select --\"][1]")).click();
		
		driver.findElement(By.xpath("//span[text()=\"Indian\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[1]")).click();
		driver.findElement(By.xpath("//span[text()=\"Single\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
		driver.quit();
		}
}
