package selenium_Day4;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class dragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2408320\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		EdgeDriver driver = new EdgeDriver(options);
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		Thread.sleep(2000);
		WebElement drag = driver.findElement(By.id("column-a"));
		WebElement drop = driver.findElement(By.id("column-b"));
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
	}
}