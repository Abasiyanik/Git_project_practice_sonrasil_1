package com.cybertek.tests.tasks.Sergey.Tests;
//package com.cybertek.homework.vyTrack.Tests;

//import com.cybertek.homework.vyTrack.Verifications.VyTrackVerifications;

import com.cybertek.tests.tasks.Sergey.Pages.DashboardPage;
import com.cybertek.tests.tasks.Sergey.Pages.LoginPage;
import com.cybertek.tests.tasks.Sergey.Verfications.VyTrackVerifications;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
//cybertek.tests.Sergey.Pages.Loginpage;
//
//cybertek.homework.vyTrack.Pages.LoginPage;
//
//com.cybertek.homework.vyTrack.Pages.DashboardPage;

public class OdometerTests {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUrl();
        loginPage.login();

        DashboardPage page = new DashboardPage(driver);
        page.goToOdometerPage();

        VyTrackVerifications verification = new VyTrackVerifications(driver);
        verification.verifyVehicleOdometerPageIsDisplayed();
    }

}