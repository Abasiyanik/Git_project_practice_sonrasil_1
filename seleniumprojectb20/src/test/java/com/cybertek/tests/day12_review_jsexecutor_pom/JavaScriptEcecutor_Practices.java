package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptEcecutor_Practices {


    @Test
    public void scroll_using_jsexecutor_1(){

        //get the page to scoll
        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        //create instance of JSExecutor and cast our driver type to it.
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();//casting
        //whenever i use js, downcasting and we reach this
for (int i=0; i<10;i++){// loop halinder scrool oldu
        BrowserUtils.wait(1);
        //use execute script method
           js.executeScript("window.scrollBy(0,50000)");
           }




    }
@Test
    public void scroll_using_jsexecutor_2(){
//burda belli hedefe kadar scroll yapacagiz

        //get the page to scoll
        Driver.getDriver().get("http://practice.cybertekschool.com/large");
        //create instance of JSExecutor and cast our driver type to it.
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();//casting

        //whenever i use js, downcasting and we reach this

        BrowserUtils.wait(1);
        //use execute script method
        WebElement cybertekLink= Driver.getDriver().findElement(By.linkText("Cybertek School"));
        WebElement homeLink= Driver.getDriver().findElement(By.linkText("Home"));

        BrowserUtils.wait(2);
        js.executeScript("arguments[0].scrollIntoView(true)", cybertekLink);
//sonra gerisin geriye tekrar scrol et

    BrowserUtils.wait(2);
    js.executeScript("arguments[0].scrollIntoView(true)", homeLink);

}
}
