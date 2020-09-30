package com.cybertek.tests.day8_alerts_ıframes_wındows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {
    //TC #4 : Iframe practice
//1. Create a new class called: IframePractice
//2. Create new test and make set ups
//3. Go to: http://practice.cybertekschool.com/iframe
//4. Assert: "Your content goes here." Text is displayed.
//5. Assert: "An iFrame containing the TinyMCE WYSIWYG Editor
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");

    }
    @Test
    public void p4_iframe_practice(){
        //loacate the button
    //    WebElement yourContentGoesHereText=driver.findElement(By.xpath("//*[@id='tinymce']/p"));


        //get the text
        //   String yourContentGoesHereString=yourContentGoesHereText.getText();
//Bu haliyle ipharame icinde olmadi ama 3
        /* 3 sekildd location ihrame
* 1. by index
* 2. by id or name
* 3. by as a web element than swith to it*/

// by index

        /*driver.switchTo().frame(0);// burda indexe gore iframe bulundu ve iframe idex burda 0 zira 1 iframe var o da bu index 0 dan baslar
        WebElement yourContentGoesHereText=driver.findElement(By.xpath("//*[@id='tinymce']/p"));
        String yourContentGoesHereString=yourContentGoesHereText.getText();
        System.out.println(yourContentGoesHereString);*/

//by id or name

      /*  driver.switchTo().frame("mce_0_ifr");// burda indexe gore iframe bulundu ve iframe idex burda 0 zira 1 iframe var o da bu index 0 dan baslar
        WebElement yourContentGoesHereText=driver.findElement(By.xpath("//*[@id='tinymce']/p"));
        String yourContentGoesHereString=yourContentGoesHereText.getText();
        System.out.println(yourContentGoesHereString);*/

//by web element
        // web element ile id sine bakarak iframe bulundu ve oraya switch edildikten sonra ikinci webelement ile olay halledildi. test gecti

        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        /*String yourContentGoesHereString=yourContentGoesHereText.getText();
        System.out.println(yourContentGoesHereString);*/
        Assert.assertTrue(yourContentGoesHereText.isDisplayed(), "Text is not displayed");
//how to switch back
        // WebElement headerText = driver.findElement(By.xpath("//h3"));// bu hata verecektr
// our goal is to locate assert header3 and ....
        driver.switchTo().defaultContent();
      //  driver.switchTo().parentFrame();// move back one frame
         WebElement headerText = driver.findElement(By.xpath("//h3"));

        Assert.assertTrue(headerText.isDisplayed(),"head not dislpalted faile... ");
// test passed
    }
}
