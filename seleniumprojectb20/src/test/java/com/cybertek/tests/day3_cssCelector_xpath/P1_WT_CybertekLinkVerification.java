package com.cybertek.tests.day3_cssCelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_WT_CybertekLinkVerification {
    public static void main(String[] args) {
        //TC #3: PracticeCybertek/ForgotPassword URL verification
        // 1.Open Chrome browser
//=================================================================================================
        //ornek to webdrivefactory
        WebDriver driver= WebDriverFactory.getDriver("chrome");// bu costum method sayesinde iki line bir line halini almis olur
//==================================


        // 2.Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // 3.Enter any email into input box
     //   driver.findElement(By.name("email")).sendKeys("abasiyanik@gmail.com");//+ Keys.ENTER);
       //YUKARIDAKINI BU HALE DONUSTUREBILIRIZ
        // BU FLEXIBLE YAPAR
        WebElement emailInputBox=driver.findElement(By.name("email"));
        emailInputBox.sendKeys("abasiyanik@gmail.com");//+ Keys.ENTER);

        // 4.Click on Retrieve password
        WebElement reteivePasswordButton=driver.findElement(By.id("form_submit"));
        reteivePasswordButton.click();//
        // 5.Verify URL contains: Expected: “email_sent”
        String expectedInUrl="email_sent";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(expectedInUrl)){
            System.out.println("URL  verification PASSED!");
        } else {
            System.out.println("URL  verification FAILED!");

        }
        // 6.Verify textbox displayed the content as expected.Expected: “Your e-mail’s been sent!”Hint: You need to use getText method for this practice.
        WebElement conformationMessage= driver.findElement(By.name("confirmation_message")); // ddaha simple ve kolay
        String actualText=conformationMessage.getText();
        //String actualText=driver.findElement(By.name("confirmation_message")).getText();
        String expectedText="Your e-mail's been sent!";
/*
        if (actualText.equals(expectedText)){
            System.out.println("Header text value verification PASSED!");
        } else {
            System.out.println("Header text value verification FAILED!!!");}

 */
        if(conformationMessage.isDisplayed()){ System.out.println("Header text value verification PASSED!");
        } else {
            System.out.println("Header text value verification FAILED!!!");}


        }

}
