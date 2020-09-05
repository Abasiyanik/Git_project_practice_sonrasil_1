package com.cybertek.tests.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_FacebookIncorrectLoginTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //if you are using browser drivers locally, you need to use System.
     //   System.setProperty("webdriver.ie.driver", "D:IE Driver ServerIEDriverServer.exe");
        //open a chrome browser
        //we create on insatance of the ChromeDrier, which also opens an empty browser for us
       // WebDriver driver=new InternetExplorerDriver();
      WebDriver driver=new ChromeDriver();

        //
        //driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.findElement(By.name("email")).sendKeys("apple@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("eatappleeat2323!!$$"+ Keys.ENTER);

        //VERFIICATION FOR WHETHER THE TITLE IS "Facebook-Log In or Sign Up"
        String actualTitle=driver.getTitle();
        String expectedTitle="Log into Facebook | Facebook";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!!");
        } else {
            System.out.println("Title Verification FAILED!!");
        }

        //driver.close();


    }
}
