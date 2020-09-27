package com.cybertek.tests.day8_alerts_ıframes_wındows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertsPractices {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

    }
    @Test
    public void p1_information_alert_practice(){
        //loacate the button
        WebElement warningAlertButton=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        //click the button
        warningAlertButton.click();
        //get rid of the alert
        //1- Create Alert instance and switch to alert
        Alert alert = driver.switchTo().alert();

        //2- Use "alert" instance to accept the javascript alert(popup)
        alert.accept();
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //assert "resultText" is displayed
        Assert.assertTrue(resultText.isDisplayed(), "Result text is not displayed. Verification failed!!!");

    /*
        WebElement resultText=driver.findElement(By.xpath("//*[@id='result']"));
        String resultTexT=resultText.getText();
        Assert.assertEquals(resultTexT,"You successfuly clicked an alert", "Correct");


     */


    }

    @Test
    public void p2_confirmation_alert_practice(){
        //Locating the warning/information alert button to click it
        WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));

        //click to the button
        warningAlertButton.click();

        //Create alert instance
        Alert alert = driver.switchTo().alert();

        //We can either accept(), or dismiss() the confirmation alert
        //alert.dismiss();
        alert.accept();

        //Locating the result text web element
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //Assert
        Assert.assertTrue(resultText.isDisplayed(), "Text is not displayed. Verification FAILED!!!");



    }
}
