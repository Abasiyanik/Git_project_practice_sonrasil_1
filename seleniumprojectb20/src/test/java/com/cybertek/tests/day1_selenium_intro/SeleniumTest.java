package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        //1-setup the driver
        WebDriverManager.chromedriver().setup();

        //2- creat instance of the driver
        WebDriver driver=new ChromeDriver();// this line opens the browser


        driver.manage().window().maximize();//bu sayede borwser acilir ve mzimize edilir


        // 3-use the driver instance to test selenium;
       driver.get("https://www.google.com");
     //   driver.get("https://www.yahoo.com");
       String actualTitle=driver.getTitle();
        //System.out.println(driver.getTitle());
        System.out.println("the title of the webpage is: "+ actualTitle);//web page isimleini alir

        String actualUrl=driver.getCurrentUrl();
        System.out.println("Acutal url: "+actualUrl);
        System.out.println("actualUrl = " + actualUrl);//shortcut: actualUrl.soutv ==>ENTER

        Thread.sleep(1000);//bunu kullanmak icin main methoda throws InterruptedException yazmak gerekir
//selenium burada biraz bekletir ve sonra digerini isleme koyar. burada 2 sn bekler 1000 ms=1 second

        driver.navigate().back();//bunun amaci geri gitmesini saglar.
        Thread.sleep(1000);
       //driver.get("https://www.yahoo.com");
        // bu sayede gecisleri gorebildir
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();// press refress button
        Thread.sleep(1000);
        driver.navigate().to("https://yahoo.com");
        String pageSoruce=driver.getPageSource();
        System.out.println("pageSoruce = " + pageSoruce);//pagesource da nevar ne yok yazar amca.

        driver.close();//close only the last browser

        driver.quit();// it close all the browers opened during this main method



    }
}
