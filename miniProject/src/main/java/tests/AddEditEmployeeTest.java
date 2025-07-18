package tests;

import base.BaseTest;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.EmployeePage;
import utils.ExcelUtils;

public class AddEditEmployeeTest extends BaseTest {

    @BeforeMethod
    public void init() {
        setup();
    }
    
    @Test
    public void testAddEditEmployee() throws Exception {
        String username = ExcelUtils.getCellData("Sheet1", 0, 0);
        String password = ExcelUtils.getCellData("Sheet1", 0, 1);
        
        LoginPage loginPage = new LoginPage(driver);
        //Thread.sleep(5000);
        loginPage.setUserName(username);
        loginPage.setPassword(password);
        loginPage.clickSubmit();
        
        EmployeePage empPage = new EmployeePage(driver);
        empPage.addEmployee("muneeb", "Khan", "Md", "8945", "muneeb20003", "MuNeEb@2004");
        
        //empPage.editEmployeeDetails();
        //Thread.sleep(7000);
        //empPage.logout();
        
    }

    @AfterMethod
    public void close() {
        tearDown();
    }
}
