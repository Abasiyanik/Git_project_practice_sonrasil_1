package com.cybertek.tests.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_FacebookHrefText {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        // 1.Open Chrome browser
        WebDriver driver=new ChromeDriver();

        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("https://www.facebook.com");
        // 3.Verify header textExpected: “Log in to ZeroBank”
        String actualText=driver.findElement(By.linkText("Create a Page")).getAttribute("href");// burda header h3
        //h1 olmadigi icin bunu kullandik tagname olarak
        System.out.println(actualText);
        String expectedText="registration_form";
        if (actualText.contains(expectedText)){
            System.out.println("Header Varification  PASSED!");
        }else{
            System.out.println("Header Varification  FAILED!!!");

        }
        driver.close();
        //driver.close();


    }
}
