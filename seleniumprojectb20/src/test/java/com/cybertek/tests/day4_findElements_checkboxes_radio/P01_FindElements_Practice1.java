package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

class P0_FindElements_Practice1 {
    public static void main(String[] args) {

//        Open Chrome browser
//        2. Go to http://practice.cybertekschool.com/forgot_password
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");


//        3. Print out the texts of all links
//        4. Print out how many total link

        //shourtcut for local variable :alt+enter

        ///List<WebElement> ListofLinks = driver.findElements(By.xpath("//body//a"));
        List<WebElement> ListofLinks = driver.findElements(By.xpath("//body//*[@href]")); //bu da olabilir
        //driver.findElements(by.xpath("//body//a");
        int count=0;
        for (WebElement eachLink:ListofLinks){
            System.out.println(eachLink.getText());
            count++;

        }
        System.out.println(count);
        System.out.println(ListofLinks.size());

        driver.close();

       /* WebElement searchBox=driver.findElement(By.xpath("//a[.='Home']"));// text secilir from//<a class="nav-link" href="/">Home</a>

        System.out.println(searchBox.getText());
*/
    }
}
