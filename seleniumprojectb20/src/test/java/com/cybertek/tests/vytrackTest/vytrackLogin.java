package com.cybertek.tests.vytrackTest;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class vytrackLogin {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://app.vytrack.com/user/login");
        String username="user165";
        String password="UserUser123";
        WebElement searchbox=driver.findElement(By.name("_username"));
        searchbox.sendKeys(username+Keys.TAB+password+ Keys.ENTER);
        //produce data for false credntials
        String [] usernameArr=WebDriverFactory.convertletter(username);
       // System.out.println(Arrays.toString(usernameArr));

        String [] passwordArr=WebDriverFactory.convertletter(password);
        //System.out.println(Arrays.toString(passwordArr));
        Thread.sleep(5000);
        String actualTitle=driver.getTitle();
        String expectedTitle="Dashboard";
       // System.out.println("act"+ actualTitle+"exp"+expectedTitle);
        System.out.println("==========================================");
        System.out.println(" POSITIVE CREDENTIAL REPORT");
        System.out.print("ActualTitle: "+ "\""+actualTitle+"\""+" and username/password: "+username+"/"+password+" ");
       // WebDriveFactory.ifStatementVerification(actualTitle,expectedTitle,"positive credential");
        //driver.get("https://app.vytrack.com/user/logout");

        System.out.println("==========================================");
        System.out.println(" NEGATIVE CREDENTIAL REPORT");
        driver.get("https://app.vytrack.com/user/logout");
        String conc; ////*[@id="login-form"]/fieldset/div[1]/div
        String actualTitle1;
        String expectedTitle1;
      for (String un: usernameArr){
          for(String pw:passwordArr){
              WebElement searchbox1=driver.findElement(By.name("_username"));
              searchbox1.clear();
              searchbox1.sendKeys(un);
              Thread.sleep(300);
              WebElement searchbox2=driver.findElement(By.name("_password"));
              searchbox2.clear();
              searchbox2.sendKeys(pw+ Keys.ENTER);
              //WebElement searchbox3=driver.findElement(By.cssSelector("/html/body/div[1]/div/div/div/div[1]/form/fieldset/div[1]"));
              actualTitle1=driver.getTitle();
              expectedTitle1="Login";
              //actualTitle1=searchbox3.getText();
              //expectedTitle1="Invalid user name or password";
              System.out.print("ActualTitle: "+ "\""+actualTitle1+"\""+" and username/password: ");

            conc=un+"/"+pw+" negative credetial ";
       //     WebDriveFactory.ifStatementVerification(actualTitle1,expectedTitle1,conc);
            driver.get("https://app.vytrack.com/user/logout");

          }
          driver.manage().deleteAllCookies();


          //WebDriver driver2= WebDriveFactory.getDriver("chrome");
          // driver.get("https://app.vytrack.com/user/login");
          //driver.navigate().refresh();
          //driver.navigate().refresh();

      }

        driver.close();
    }}










