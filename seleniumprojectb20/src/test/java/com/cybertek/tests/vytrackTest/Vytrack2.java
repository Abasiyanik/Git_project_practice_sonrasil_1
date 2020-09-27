package com.cybertek.tests.vytrackTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vytrack2 {
            public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://qa2.vytrack.com/user/login");
            driver.findElement(By.id("prependedInput")).sendKeys("user165");
            driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
            driver.findElement(By.id("_submit")).click();
            Thread.sleep(2000);

           // driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span")).click();
            //driver.findElement(By.linkText("Vehicles")).click();
            driver.findElement(By.linkText("Vehicle Odometer")).click();
            Thread.sleep(4000);
            driver.findElement(By.linkText("Create Vehicle Odometer")).click();
            Thread.sleep(4000);
            //driver.findElement(By.xpath("//*[@id=\"grid-custom-entity-grid-1205370636\"]/div[2]/div[1]/div/div[3]/div[1]/div/div/a/i")).click();
            //driver.findElement(By.className("column-manager dropdown")).sendKeys("68000");
            //driver.findElement(By.id("custom_entity_type_OdometerValue-uid-5f58ddeb6562d")).sendKeys("68000");
            // driver.findElement(By.xpath("//*[@id=\"custom_entity_type_OdometerValue-uid-5f58ddeb6562d\"]")).sendKeys("68000");
        }
    }

