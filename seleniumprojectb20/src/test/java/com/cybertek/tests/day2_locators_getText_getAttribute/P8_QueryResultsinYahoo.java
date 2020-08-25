package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8_QueryResultsinYahoo {
    public static void main(String[] args) {


    //setup the browser driver
        WebDriverManager.chromedriver().setup();

    //create driver instance and open chrome borwser
    WebDriver driver=new ChromeDriver();

    /*
    String [] query={"Ahmed", "Ahmad", "Ahmet", "Ahmat"};
    String result="";
    String result2="";
        for (String each:query){
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys(each+ Keys.ENTER);// for Google the name of the  search box is "q"
        result=driver.findElement(By.id("result-stats")).getText();
        System.out.println("The query results of the key word, "+each+" is :"+result.substring(6,result.indexOf("results")-1));

     */

        driver.get("https://yahoo.com");
        driver.findElement(By.name("p")).sendKeys("Ahmad"+ Keys.ENTER);// for Google the name of the  search box is "q"
        System.out.println("hohoh");
        System.out.println("hohoh"+ driver.findElement(By.tagName("span")).getText());
      //  System.out.println("The query results of the key word, "+each+" is :"+result2;
        driver.close();

    }
    }
