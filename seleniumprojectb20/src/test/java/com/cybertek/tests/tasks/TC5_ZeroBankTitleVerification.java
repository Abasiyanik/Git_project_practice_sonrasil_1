package com.cybertek.tests.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_ZeroBankTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();


        WebDriver driver=new ChromeDriver();


        driver.get("http://zero.webappsecurity.com/login.html");

        //VERFIICATION FOR WHETHER THE TITLE IS GOOGLE
        String actualTitle=driver.getTitle();
        String expectedTitle="Zero - Log in";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!!");
        } else {
            System.out.println("Title Verification FAILED!!");
        }

        driver.close();
        //boolean verificationGoogle = actualTitle.equals("Google");
        //System.out.println("verficiation: "+ verificationGoogle+"  title: "+actualTitle);//web page isimleini alir
        //driver.close();


    }
}
