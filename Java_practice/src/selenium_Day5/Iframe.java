package selenium_Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2408320\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		EdgeDriver driver = new EdgeDriver(options);
		driver.get("https://the-internet.herokuapp.com/iframe");
		Thread.sleep(2000);
		driver.findElement(By.className("tox-notification__dismiss")).click();
		Thread.sleep(3000);
		WebElement frame=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);
		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/div[4]/div/div/button/div/svg")).click();
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).getText());
//		System.out.println(driver.findElement(By.cssSelector("body#tinymce")).getText());
//		driver.findElement(By.cssSelector("button.tox-notification__dismiss tox-button tox-button--naked tox-button--icon")).click();
		System.out.println(driver.findElement(By.tagName("p")).getText());
	}

}
