package com.cybertek.tests.day9_windows_tabs;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;


public class WindowHandle {
    /*
        TC5 # : Window Handle practice
        1. Create a new class called: WindowHandlePractice
        2. Create new test and make set ups
        3. Go to : http://practice.cybertekschool.com/windows
        4. Assert: Title is "Practice"
        5. Click to: "Click Here" text
        6. Switch to new Window.
        7. Assert: Title is "New Window"
         */
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("http://practice.cybertekschool.com/windows");

    }
    @Test
    public void p5_handling_windows(){
        driver.get("http://practice.cybertekschool.com/windows");
        String actualTitle=driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertTrue(actualTitle.equals("Practice"));

        WebElement clickHerLink=driver.findElement(By.linkText("Click Here"));
        clickHerLink.click();
        String titleAfterClick=driver.getTitle();
        System.out.println("titleAfterClick = " + titleAfterClick);
        String mainHandle=driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        Set<String> windowHandles=driver.getWindowHandles();
        //notlar hocaninkinde hastaydim yazamadim

        for (String each:windowHandles){
            driver.switchTo().window(each);
            System.out.println("Current title="+driver.getTitle());
            System.out.println("CURRENT WINDOW HANDLE = "+driver.getWindowHandle());
        }
        Assert.assertTrue(driver.getTitle().equals("New Window"));
        //driver.close();// it closes the second page

// geri gelmek istiyorsak
        driver.switchTo().window(mainHandle);
        //driver.close();//birincini kapar
        driver.quit();//hepsini kapatir

    }
    @Test
    public void p6_(){
        driver.get("http:www.amazon.com");
        //we are downcasting our driver type to javascrip executor
        // open new tabs with links
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        Set<String> windowHandles=driver.getWindowHandles();
        //notlar hocaninkinde hastaydim yazamadim

        for (String each:windowHandles){
            driver.switchTo().window(each);
            System.out.println("Current title="+driver.getTitle());
            System.out.println("CURRENT WINDOW HANDLE = "+driver.getWindowHandle());
            if(driver.getCurrentUrl().contains("etsy"));
            Assert.assertTrue(driver.getTitle().contains("Etsy"));
            break;
        }
    }
}