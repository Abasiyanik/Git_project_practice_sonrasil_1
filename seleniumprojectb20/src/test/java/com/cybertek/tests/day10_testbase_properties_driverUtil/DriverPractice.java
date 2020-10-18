package com.cybertek.tests.day10_testbase_properties_driverUtil;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverPractice {

    @Test
    public void simple_google_search_test(){
        //driver.getDriver()=driver.get(http://google.com")
        Driver.getDriver().get("https://google.com");

        //locating ggoole seach box using its namea ttibute value
        WebElement searchBox =Driver.getDriver().findElement(By.name("q"));
       //        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);
        String searchBox2= ConfigurationReader.getProperty("searchquery");
        searchBox.sendKeys(searchBox2+ Keys.ENTER);
        String expectedTitle=searchBox2;
        String actualTitle=Driver.getDriver().getTitle();

        String result=Driver.getDriver().findElement(By.id("result-stats")).getText();
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("result = " + result);
        Assert.assertTrue(actualTitle.contains(expectedTitle),"yine mi olmadi");
        Driver.getDriver().close();


    }
}
