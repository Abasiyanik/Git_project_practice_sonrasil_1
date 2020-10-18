package com.cybertek.tests.base;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {//this is an abstract class whch can only inspire others

    protected WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
       // SmartBearUtilities.loginToSmartBear(driver);
    }

    @AfterMethod
    public void tearDown(){

        driver.close();
    }





}
