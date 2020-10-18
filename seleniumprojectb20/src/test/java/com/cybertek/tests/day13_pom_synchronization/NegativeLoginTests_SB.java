package com.cybertek.tests.day13_pom_synchronization;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTests_SB {
LoginPage loginPage;
@Test(description="entering incorrect username")
    public void negative_login_test1() {
    String url=ConfigurationReader.getProperty("smartbearUrl");
    Driver.getDriver().get(url);

    //lets strart using pageobjectmodel
    //#1- we nned to call the object of the class we want
    loginPage=new LoginPage();

    //#2 -call the object to use the web oelement
    //enter incorrect username
   // String username1=ConfigurationReader.getProperty("smartbear_username");


    loginPage.usernameInput.sendKeys("hayAllah");
    //loginPage.usernameInput.sendKeys(username1);

    //correct passwort
    String password1=ConfigurationReader.getProperty("smartbear_password");
    loginPage.passwordInput.sendKeys(password1);
    //click to login button
    loginPage.loginButton.click();

    Assert.assertTrue(loginPage.errorMessage.isDisplayed(), "Error message is not displayed. Verification Failed!");






}
}
