package selenium_Day4;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
public class Upload_File {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2408320\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		EdgeDriver driver = new EdgeDriver(options);
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"file-upload\"]")).sendKeys("C:\\Users\\2408320\\Downloads\\2408320_Team5_Global Warming_UmeshChandra.pptx");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"file-submit\"]")).click();
	}
}