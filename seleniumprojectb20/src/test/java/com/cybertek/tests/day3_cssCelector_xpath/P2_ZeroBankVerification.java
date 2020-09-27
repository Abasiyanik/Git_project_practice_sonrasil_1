package com.cybertek.tests.day3_cssCelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_ZeroBankVerification {
    public static void main(String[] args) {


  //      TC #2:Zero Bank link text verification
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
//        3. Verify link text from top left:
        WebElement zeroBankLintTopLeft=driver.findElement(By.className("brand"));

        String expectedLinkText="Zero Bank";
        String actuallLinkText=zeroBankLintTopLeft.getText();

        if (actuallLinkText.equals(expectedLinkText))
        {System.out.println("Link text verification PASSED!");}
    else {System.out.println("Link text verification FAILED!");}

//        Expected: "Zero Bank"
//        4. Verify link href attribute value contains:
//
//
//        Expected: "index.html"
        String expectedInHref="index.html";
        String actualHrefValue=zeroBankLintTopLeft.getAttribute("href");
/*
        if (actualHrefValue.contains(expectedInHref))
        {System.out.println("Href value  verification PASSED!");}
        else
        {System.out.println("Href value  verification failed!");}

 */
      //  WebDriveFactory.ifStatementVerification(actualHrefValue, expectedInHref,"Href");
    }
}