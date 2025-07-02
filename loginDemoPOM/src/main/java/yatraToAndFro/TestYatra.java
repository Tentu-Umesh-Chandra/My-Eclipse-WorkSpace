package yatraToAndFro;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class TestYatra {
	ChromeDriver driver;
	private SelectingToandFroInFlight flight;
	
	@Test
	public void selectTo() throws InterruptedException {
		driver = new ChromeDriver();
		flight = new SelectingToandFroInFlight(driver);
		driver.get("https://www.yatra.com/");
		flight.clickFlight();
		flight.clickFlightTo();
		flight.emptyToTest();
		//flight.clickonPune();
		//Thread.sleep(5000);
		//flight.closeTheAd();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement puneSele = driver.findElement(flight.clickonPune());
		
		
	}
}
