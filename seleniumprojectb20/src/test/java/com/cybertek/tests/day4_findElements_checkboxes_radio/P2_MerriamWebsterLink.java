package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P2_MerriamWebsterLink {
    public static void main(String[] args) {


        //1. Open Chrome browser
//2. Go to https://www.merriam-webster.com/
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.merriam-webster.com/");

        int count=0;
        int missingText=0;
//3. Print out the texts of all links
        //List<WebElement> ListofLinks = driver.findElements(By.xpath("//body//a"));
        List<WebElement> ListofLinks = driver.findElements(By.xpath("//body//*[@href]"));

        for (WebElement eachLink: ListofLinks){
            count++;
            if (eachLink.getText().isEmpty()){
                missingText++;}

        //    System.out.println(""+count+" "+eachLink.getText());

        }
        System.out.println("The number of links without any text is " + missingText+ ",  and the total number of links is "+count+
                " and, the number of links with text is "+(count-missingText));
        /*int count1=0;
        int missingText1=0;


        for (WebElement eachLink: ListofLinks1){
            count1++;
            if (eachLink.getText().isEmpty()){
                missingText1++;}
*/
        // System.out.println(""+count1+" "+eachLink.getText());
/*
    }
        System.out.println("The number of links without any text is " + missingText1+ ",  and the total number of links is "+count1+

    */
        //" and, the number of links with text is "+(count1-missingText1));
        driver.close();
//4. Print out how many link is missing text
//5. Print out how many link has text

//6. Print out how many total link
}}
