package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerfication {
    public static void main(String[] args) {
/*
TC	#2:	Cybertek	verifications
1.Open	Chrome	browser
2.Go	to	https://practice.cybertekschool.com
3.Verify	URL	containsExpected:	cybertekschool
4.Verify	title:	Expected:	Practice
 */
        WebDriverManager.chromedriver().setup();


        WebDriver driver=new ChromeDriver();


        //driver.get("https://practice.cybertekschool.com");//s is secure for something so remove s and rewrite again
        driver.get("http://practice.cybertekschool.com");

        //URL VARIFICIATION
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="cybertek";
        if (actualUrl.contains(expectedUrl)){
            System.out.println(" URL verificaition test PASSED");
        } else {
            System.out.println(" ULR verification test FAILED");

        }
        String actualTitle=driver.getTitle().toLowerCase();
        String expectedTitle="practice";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!!");
        } else {
            System.out.println("Title Verification FAILED!!");
        }

        driver.close();


    }
}
