package com.cybertek.tests.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC7_ZeroBankLoginTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();


        driver.get("http://zero.webappsecurity.com/login.html");
        driver.findElement(By.name("user_login")).sendKeys("username");
        driver.findElement(By.name("user_password")).sendKeys("password"+ Keys.ENTER);


        String actualTitle=driver.getTitle();
        String expectedTitle="Zero - Account Summary";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!!");
        } else {
            System.out.println("Title Verification FAILED!!");
        }

        //driver.close();


    }
}
