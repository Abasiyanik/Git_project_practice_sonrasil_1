package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_EtsyTitleVerification {
    public static void main(String[] args) {
        //TC #5: EtsyTitle Verification
        // 1.Open Chrome browser

        WebDriverManager.chromedriver().setup();

        //create driver instance and open chrome borwser
        WebDriver driver=new ChromeDriver();

        // 2.Go to https://www.etsy.com

        driver.get("https://www.etsy.com");
        // 3.Search for “wooden spoon”
        //driver.findElement(By.name("search_query")).sendKeys("wooden spoon"+ Keys.ENTER);// but tihs is an ID practice so
        //we will search it by using ID

        //input id den sonraki kismi aldik ki "global-enhancements-search-query"
        //name unique degil ama ID herzaman unique olmas zorunda

        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon"+ Keys.ENTER);
       // System.out.println(driver.findElement(By.id("global-enhancements-search-query")).getText());


        // 4.Verify title: Expected: “Wooden spoon | Etsy” search_query  global-enhancements-search-query
        String expecteTitle="Wooden spoon | Etsy";
        String actualTitle=driver.getTitle();
        if (actualTitle.equals(expecteTitle)){
            System.out.println("Search  title verification PASSED!");
        }else{
            System.out.println("Search title verification FAILED!!!");

        }
        driver.close();
    }
}
