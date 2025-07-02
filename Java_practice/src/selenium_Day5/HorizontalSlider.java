package selenium_Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSlider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2408320\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		EdgeDriver driver = new EdgeDriver(options);
		driver.get("https://the-internet.herokuapp.com/horizontal_slider");
		Thread.sleep(2000);
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/input"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider, 5, 0).build().perform();
	}

}
