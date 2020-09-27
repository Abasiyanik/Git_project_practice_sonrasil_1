package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7_Result_of_Google_Research {
    public static void main(String[] args) {
        //        1-Open	a	chrome	browser

        //setup the browser driver
        WebDriverManager.chromedriver().setup();

        //create driver instance and open chrome borwser
        WebDriver driver=new ChromeDriver();

        //        2-Go	to:	https://google.com
       /*
        driver.get("https://google.com");



        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);// for Google the name of the  search box is "q"
        String result= driver.findElement(By.id("result-stats")).getText();

        //System.out.println(result);
        System.out.println(result.substring(6,result.indexOf("results")-1));
        //String actualTitle=driver.getTitle();

        */

       // String [] queryKeywords={"Ahmed", "Ahmad", "Ahmet", "Ahmat", "Amed"};
      //  String [] queryKeywords2={"Mustafa", "Mostafa", "Mustapha", "Mostopha", "Mostofa"};
        String [] queryKeywords2={"England", "\"South Korea\"","\"North Korea\"","Mexico", "Indonesia", "Turkey", "Germany", "Russia", "USA", "China", "India", "Canada","Pakistan"};
        String result="";
        for (String each:queryKeywords2){
          driver.get("https://google.com");
            driver.findElement(By.name("q")).sendKeys(each+ Keys.ENTER);// for Google the name of the  search box is "q"
            result=driver.findElement(By.id("result-stats")).getText();
            System.out.println("The query results of the key word, "+each+" is :"+result.substring(6,result.indexOf("results")-1));


        }
        driver.close();

    }
}
