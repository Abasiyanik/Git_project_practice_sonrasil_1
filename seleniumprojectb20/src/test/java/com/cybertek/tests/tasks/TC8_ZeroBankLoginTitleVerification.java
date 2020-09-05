package com.cybertek.tests.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC8_ZeroBankLoginTitleVerification {
    public static void main(String[] args) throws InterruptedException {
       //prepare the browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//open the address
        driver.get("http://zero.webappsecurity.com/login.html");
//login to the acount
        driver.findElement(By.name("user_login")).sendKeys("username");
        driver.findElement(By.name("user_password")).sendKeys("password"+ Keys.ENTER);
  //    Thread.sleep(500);


        //1. title check
        driver.findElement(By.linkText("Account Activity")).click();
        String actualTitle1=driver.getTitle();
//      System.out.println(actualTitle1);
        String expectedTitle1="Zero - Account Activity";

        if (actualTitle1.equals(expectedTitle1)){System.out.println("1. Title verification PASSED!!");} else {System.out.println("1. Title Verification FAILED!!");}

        //2. title check
        driver.findElement(By.linkText("Transfer Funds")).click();
        String actualTitle2=driver.getTitle();
//      System.out.println(actualTitle2);
        String expectedTitle2="Zero - Transfer Funds";

        if (actualTitle2.equals(expectedTitle2)){System.out.println("2. Title verification PASSED!!");} else {System.out.println("2. Title Verification FAILED!!");}



        //3. title check
        driver.findElement(By.linkText("Pay Bills")).click();
        String actualTitle3=driver.getTitle();
//      System.out.println(actualTitle3);
        String expectedTitle3="Zero - Pay Bills";

        if (actualTitle3.equals(expectedTitle3)){System.out.println("3. Title verification PASSED!!");} else {System.out.println("3. Title Verification FAILED!!");}


        //4. title check
        driver.findElement(By.linkText("My Money Map")).click();
        String actualTitle4=driver.getTitle();
//      System.out.println(actualTitle4);
        String expectedTitle4="Zero - My Money Map";

        if (actualTitle4.equals(expectedTitle4)){System.out.println("4. Title verification PASSED!!");} else {System.out.println("4. Title Verification FAILED!!");}


        //5. title check
        driver.findElement(By.linkText("Online Statements")).click();
        String actualTitle5=driver.getTitle();
      //System.out.println(actualTitle5);
        String expectedTitle5="Zero - Online Statements";

        if (actualTitle5.equals(expectedTitle5)){System.out.println("5. Title verification PASSED!!");} else {System.out.println("5. Title Verification FAILED!!");}

       driver.close();


    }
}
