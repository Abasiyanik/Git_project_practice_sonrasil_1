package com.cybertek.tests.day3_cssCelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Test {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement button2=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/button[2]"));
        button2.click();
        // WebElement button2 = driver.findElement(By.xpath("//button[@name='button2'] "));
////*[@id="content"]/div[1]/button[2]
    }
}
