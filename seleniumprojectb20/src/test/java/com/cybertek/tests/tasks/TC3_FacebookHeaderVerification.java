package com.cybertek.tests.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_FacebookHeaderVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        // 1.Open Chrome browser
        WebDriver driver=new ChromeDriver();

        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("https://www.facebook.com");
        // 3.Verify header textExpected: “Log in to ZeroBank”
        String actualHeaderText=driver.findElement(By.tagName("h2")).getText();// burda header h3
        //h1 olmadigi icin bunu kullandik tagname olarak

        String expectedHeaderText="Connect with friends and the world around you on Facebook.";
        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header Varification  PASSED!");
        }else{
            System.out.println("Header Varification  FAILED!!!");

        }
        driver.close();
        //driver.close();

    }
}
