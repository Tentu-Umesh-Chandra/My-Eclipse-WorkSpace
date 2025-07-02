/*
package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EmployeePage {
    WebDriver driver;
    WebDriverWait wait;

    public EmployeePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void addEmployee(String firstName, String middleName, String lastName, String empId, String uname, String pwd) {
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("PIM"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add Employee"))).click();
        driver.findElement(By.name("firstName")).sendKeys(firstName);
        driver.findElement(By.name("middleName")).sendKeys(middleName);
        driver.findElement(By.name("lastName")).sendKeys(lastName);
        driver.findElement(By.name("employeeId")).sendKeys(empId);
        driver.findElement(By.cssSelector("span.oxd-switch-input")).click();
        driver.findElement(By.name("user_name")).sendKeys(uname);
        driver.findElement(By.name("password")).sendKeys(pwd);
        driver.findElement(By.name("confirm_password")).sendKeys(pwd);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    public void editEmployeeDetails() {
        // Add logic similar to above using ID/Name locators and WebDriverWait
    }

    public void logout() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("i.oxd-icon.bi-caret-down-fill"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout"))).click();
    }
}
*/
//package pages;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
///*
//  Page Object Model class for Employee-related actions in OrangeHRM.
//  Includes methods to add and edit employee details.
// */
//public class EmployeePage {
//    WebDriver driver;
//    WebDriverWait wait;
//
//    // Constructor to initialize WebDriver and WebDriverWait
//    public EmployeePage(WebDriver driver) {
//        this.driver = driver;
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    }
//
//    /*
//      Adds a new employee with login details.
//      @throws InterruptedException 
//     */
//    public void addEmployee(String firstName, String middleName, String lastName, String empId, String uname, String pwd) throws InterruptedException {
//        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("PIM"))).click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add Employee"))).click();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName"))).sendKeys(firstName);
//        driver.findElement(By.name("middleName")).sendKeys(middleName);
//        driver.findElement(By.name("lastName")).sendKeys(lastName);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).clear();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(empId);
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("span.oxd-switch-input")).click(); // Toggle login details
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys(uname);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(pwd);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(pwd);
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("button[type='submit']")).click(); // Save
//        Thread.sleep(3000);
//    }
//
//    /*
//      Edits employee details such as nationality, gender, and marital status.
//     */
//    public void editEmployeeDetails() {
//        // Navigate to Employee List
//        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Employee List"))).click();
//        
//        // Select employee by name (assuming unique name for simplicity)
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Muneeb')]"))).click();
//
//        // Wait for Personal Details section to load
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.orangehrm-card-container")));
//
//        // Select Nationality
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@class,'oxd-select-text')])[1]"))).click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Indian']"))).click();
//        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        // Select Gender (Male)
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Male']/span"))).click();
//
//        // Select Marital Status
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@class,'oxd-select-text')])[4]"))).click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Single']"))).click();
//
//        // Save changes
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
//    }
//
//    /*
//      Logs out from the application.
//     */
//    public void logout() {
//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("i.oxd-icon.bi-caret-down-fill"))).click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout"))).click();
//    }
//}

package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
  Page Object Model class for Employee-related actions in OrangeHRM.
  Includes methods to add and edit employee details.
 */
public class EmployeePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor js;
    
    public EmployeePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }
    
    // Navigation
    @FindBy(linkText = "PIM")
    WebElement pimTab;
    
    @FindBy(linkText = "Add Employee")
    WebElement addEmployeeTab;
    
    @FindBy(name = "firstName")
    WebElement firstNameField;

    @FindBy(name = "middleName")
    WebElement middleNameField;
    
    @FindBy(name = "lastName")
    WebElement lastNameField;
    
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement employeeIdField;
    
    @FindBy(css = "span.oxd-switch-input")
    WebElement loginDetailsToggle;
    
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    WebElement usernameField;
    
    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement passwordField;
    
    @FindBy(xpath = "(//input[@type='password'])[2]")
    WebElement confirmPasswordField;
    
    @FindBy(css = "button[type='submit']")
    WebElement saveButton;
    
    @FindBy(linkText = "Employee List")
    WebElement employeeListTab;
    
    @FindBy(xpath = "//*[contains(text(),'Amuneeb')]")
    WebElement employeeRecord;
    
    @FindBy(xpath = "(//div[contains(@class,'oxd-select-text')])[1]")
    WebElement nationalityDropdown;
    
    @FindBy(xpath = "//span[text()='Indian']")
    WebElement nationalityIndian;
    
    @FindBy(xpath = "//label[text()='Male']/span")
    WebElement genderMale;
    
    @FindBy(xpath = "(//div[contains(@class,'oxd-select-text')])[4]")
    WebElement maritalStatusDropdown;
    
    @FindBy(xpath = "//span[text()='Single']")
    WebElement maritalStatusSingle;
    
    @FindBy(css = "i.oxd-icon.bi-caret-down-fill")
    WebElement profileDropdown;
    
    @FindBy(linkText = "Logout")
    WebElement logoutLink;
    
    /**
     * Adds a new employee with login details.
     */
    public void addEmployee(String firstName, String middleName, String lastName, String empId, String uname, String pwd) throws InterruptedException {
        pimTab.click();
        addEmployeeTab.click();
        Thread.sleep(2000);
        firstNameField.sendKeys(firstName);
        middleNameField.sendKeys(middleName);
        lastNameField.sendKeys(lastName);
        employeeIdField.clear();
        Thread.sleep(1000);
        employeeIdField.sendKeys(empId);
        loginDetailsToggle.click();
        usernameField.sendKeys(uname);
        passwordField.sendKeys(pwd);
        confirmPasswordField.sendKeys(pwd);
        Thread.sleep(1000);
        saveButton.click();
    }
    
    /*
      Edits employee details such as nationality, gender, and marital status.
     */
    public void editEmployeeDetails() throws InterruptedException {
        employeeListTab.click();
        Thread.sleep(2000);
        boolean temp = true;
        while(temp) {
          if(wait.until(ExpectedConditions.elementToBeClickable(employeeRecord)) == null) {
        	  //employeeRecord.click();
        	  driver.findElement(By.xpath("//i[@class='oxd-icon bi-chevron-right']")).click();
        	  
          }
          else if(wait.until(ExpectedConditions.elementToBeClickable(employeeRecord)) != null){
        	  employeeRecord.click();
        	  temp = false;
          }
        }
        //employeeRecord.click();
        Thread.sleep(2000);
        nationalityDropdown.click();
        nationalityIndian.click();
        Thread.sleep(2000);
        genderMale.click();
        Thread.sleep(2000);
        maritalStatusDropdown.click();
        maritalStatusSingle.click();
        Thread.sleep(2000);
        saveButton.click();
        Thread.sleep(4000);
    }
    
    /*
      Logs out from the application.
     */
    public void logout() throws InterruptedException {
        profileDropdown.click();
        Thread.sleep(4000);
        logoutLink.click();
    }
}
