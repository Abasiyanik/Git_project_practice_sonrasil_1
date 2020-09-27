package com.cybertek.tests.day3_cssCelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Amazon_CssSelector {
    public static void main(String[] args) throws InterruptedException {

//TC #3: Amazon link number verification
// 1. Open Chrome browser
// 2. Go to https://www.amazon.com
    WebDriver driver= WebDriverFactory.getDriver("chrome");
 driver.get("https://www.amazon.com");
// 3. Enter search term (use cssSelectorto locate search box)

//        WebElement webelement1=driver.
       // WebElement searchBox=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));// birinci tip

    //  WebElement searchBox=driver.findElement(By.cssSelector("input#twotabsearchtextbox"));// birinci tip
        WebElement searchBox=driver.findElement(By.cssSelector("input#twotabsearchtextbox"));//ikinci tip css
        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);
        Thread.sleep(2000);
        driver.navigate().back();

        WebElement searchBox2=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));// birinci tip
        searchBox2.sendKeys("wooden spoon"+ Keys.ENTER);


// 4. Verify title contains search term

    }

}
