package selenium_Day4;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
public class Alert_Handling {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2408320\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		EdgeDriver driver = new EdgeDriver(options);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Alert alertBox = driver.switchTo().alert();
		Thread.sleep(2000);
		alertBox.accept();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Alert alertBox1 = driver.switchTo().alert();
		Thread.sleep(2000);
		alertBox1.dismiss();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert alertBox2 = driver.switchTo().alert();
		alertBox2.sendKeys("Hello Umesh");
		alertBox2.accept();
		Thread.sleep(5000);
	}
}