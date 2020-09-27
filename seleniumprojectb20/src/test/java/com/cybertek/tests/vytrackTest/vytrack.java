package com.cybertek.tests.vytrackTest;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
    public class vytrack {
        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://qa2.vytrack.com/user/login");//access the page URL
            driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys("user165");//enter user name
            driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys("UserUser123");//enter password
            driver.findElement(By.xpath("//button[@id='_submit']")).click();//find and click "login" button
            Thread.sleep(5000);//slow next operation by 3 sec to fully load the page
            driver.findElement(By.xpath("//span[@class='title title-level-1']")).click();//find and click "fleet" button
            Thread.sleep(3000);//wait to load
            driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[5]/a/span")).click();//find and click "vehicle cost" button
            Thread.sleep(5000);//wait for page to load
            driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div/div[2]/a")).click();//find and click "creat vehicle cost" button
            Thread.sleep(5000);//wait for page to load
            driver.findElement(By.xpath("//a[contains(@class,'btn back icons-holder-text')]")).click();//find and click "cancel"button
            Thread.sleep(2000);//wait to load
            driver.navigate().back();//navigate back
            Thread.sleep(2000);//wait to load
            driver.findElement(By.xpath("//button[contains(@class,'btn btn-success action-button')]")).click();//find and click "save"button
            String actualPage=driver.getCurrentUrl();//get current URL to verify if ticket was created
            String expectedPage="item";//expected ticket name once created
            if(actualPage.contains(expectedPage)){//condition to find out if test fail or pass
                System.out.println("Driver was able to create vehicle cost successfully, Test PASS!!! ");
            }else {
                System.out.println("Test FAILED!!!!");
            }
            driver.close();// to close web browser
        }
    }


