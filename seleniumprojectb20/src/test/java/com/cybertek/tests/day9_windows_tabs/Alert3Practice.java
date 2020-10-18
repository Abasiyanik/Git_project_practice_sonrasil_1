package com.cybertek.tests.day9_windows_tabs;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alert3Practice {

    /*
TC #3: Information alert practice
1. Open browser
2. Go to website: http://practice.cybertekschool.com/javascript_alerts
3. Click to "Click for JS Prompt" button
4. Send "hello" text to alert
5. Click to OK button from the alert
6. Verify "You entered: hello" text is displayed.
 */
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

    }
    @Test
    public void p3_promt_alert_practicee(){


        WebElement promptAlertButton=driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        //click the button
        promptAlertButton.click();
        //get rid of the alert
        //1- Create Alert instance and switch to alert
        Alert alert = driver.switchTo().alert();
        //browserutilclasstan birini aliyouz
       // BrowserUtils.wait(2);

        //2- Use "alert" instance to accept the javascript alert(popup)
        alert.sendKeys("You entered: hello");
       // BrowserUtils.wait(2);
        //accepting the alert
        alert.accept();
        WebElement resultText = driver.findElement(By.id("result"));

        //assert "resultText" is displayed
        Assert.assertTrue(resultText.isDisplayed(), "Result text is not displayed. Verification failed!!!");

        //verify that the resutl tex contians the entered input

        String actual=resultText.getText();
        Assert.assertTrue(actual.contains("hello"),"does not contain");

    }

}
