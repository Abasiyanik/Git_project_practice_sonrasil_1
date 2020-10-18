package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*
we store all the ewb elements and methods realted to LoginPAge in this .java class.
only LoginPAgre realted thing will be here
 */

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id="ctl00_MainContent_username")// artik findelement gerek kalmadi
    public WebElement usernameInput;//findby ile bulur ve usernameinput icine kopyalar

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordInput;//stale element yani old element chek de yapar bunlar

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(id = "ctl00_MainContent_status")
    public WebElement errorMessage;

    //@FindBy(css = "")

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}

