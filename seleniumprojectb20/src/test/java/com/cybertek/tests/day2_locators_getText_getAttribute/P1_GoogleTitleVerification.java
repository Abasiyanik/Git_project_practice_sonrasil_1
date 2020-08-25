package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_GoogleTitleVerification {
    public static void main(String[] args) {
        /*
        TC
        #1:	Google	Title
        1.Open	Chrome	browser
        2.Go	to	https://www.google.com
        3.Verify	title:	Expected:	Go
         */
        //set up the browser driver
        WebDriverManager.chromedriver().setup();
        //if you are using browser drivers locally, you need to use System.

        //open a chrome browser
        //we create on insatance of the ChromeDrier, which also opens an empty browser for us

        WebDriver driver=new ChromeDriver();

        //
        //driver.manage().window().maximize();
        driver.get("https://www.google.com");
//VERFIICATION FOR WHETHER THE TITLE IS GOOGLE
        String actualTitle=driver.getTitle();
        String expectedTitle="Google";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!!");
        } else {
            System.out.println("Title Verification FAILED!!");
        }

        driver.close();
        //boolean verificationGoogle = actualTitle.equals("Google");
        //System.out.println("verficiation: "+ verificationGoogle+"  title: "+actualTitle);//web page isimleini alir
        //driver.close();

/*
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

 */

    }
}
