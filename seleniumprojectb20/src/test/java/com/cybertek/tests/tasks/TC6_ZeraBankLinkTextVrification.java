package com.cybertek.tests.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC6_ZeraBankLinkTextVrification {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();


        driver.get("http://zero.webappsecurity.com/login.html");

       String actualText=driver.findElement(By.className("brand")).getAttribute("href");// burda header h3
        //h1 olmadigi icin bunu kullandik tagname olarak
        System.out.println(actualText);
        String expectedText="index.html";
        if (actualText.contains(expectedText)){
            System.out.println("Header Varification  PASSED!");
        }else{
            System.out.println("Header Varification  FAILED!!!");

        }
        driver.close();
        //http://zero.webappsecurity.com/login.html


    }

}
