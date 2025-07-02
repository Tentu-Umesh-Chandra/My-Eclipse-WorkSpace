package selenium_Day4;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

//import com.sun.org.apache.bcel.internal.generic.Select;
public class dragdown_option2_option1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2408320\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		EdgeDriver driver = new EdgeDriver(options);
		driver.get("https://the-internet.herokuapp.com/dropdown");
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		Select selectDropdown = new Select(dropdown);
		selectDropdown.selectByValue("2");
		Thread.sleep(5000);
		selectDropdown.selectByValue("1");
	}
}