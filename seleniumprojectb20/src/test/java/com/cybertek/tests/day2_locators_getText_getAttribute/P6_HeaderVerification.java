package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_HeaderVerification {
    public static void main(String[] args) {
        //TC #6: Zero Bankheader verification
        WebDriverManager.chromedriver().setup();
        // 1.Open Chrome browser
        WebDriver driver=new ChromeDriver();

        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        // 3.Verify header textExpected: “Log in to ZeroBank”
        String actualHeaderText=driver.findElement(By.tagName("h3")).getText();// burda header h3
        //h1 olmadigi icin bunu kullandik tagname olarak

        String expectedHeaderText="Log in to ZeroBank";
        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header Varification  PASSED!");
        }else{
            System.out.println("Header Varification  FAILED!!!");

        }
        driver.close();

}}
