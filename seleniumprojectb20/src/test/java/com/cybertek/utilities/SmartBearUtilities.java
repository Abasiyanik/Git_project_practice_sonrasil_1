package com.cybertek.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SmartBearUtilities {

    //Mini-Task:
    //#1- Create a new class called : SmartBearUtilities
    //#2- Create a static method called loginToSmartBear
    //#3- This method simply logs in to SmartBear when you call it.
    //#4- Accepts WebDriver type as parameter
    public static void loginToSmartBear(WebDriver driver) {
        //3. Enter username: “Tester”

        WebElement usernameInput = driver.findElement(By.id("ctl00_MainContent_username"));
        usernameInput.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement passwordInput = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordInput.sendKeys("test");

        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
    }

    /*
   @Param: Method takes WebDriver object and String(name).
   • Method should verify if given name exists in orders.
   • This method should simply accepts a name(String), and assert whether
   given name is in the list or not.
   • Create a new TestNG test to test if the method is working as expected.
    */
    public static void verifyOrder(WebDriver driver, String name) {
        //Created a locator that only returns the names of the costumer from all of the rows
        //Created a list and stored the cells that has costumer name information into it.
        List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));// findeElements tum rcolumnd daki
        //isimlerin hepsini lir ve biz verir
        // eger bir tablo varsa sadece //tr/td[2] yeterli olacakti
        //List<WebElement> namesList = driver.findElements(By.xpath("//tr/td[2]"));// would be enough

        for (WebElement each : namesList) {// iter yaz ENTER  foreach loop olusur
            if (each.getText().equals(name));
            Assert.assertTrue(true); // burada bize bir bolean value olarak verir.

            //Assert.assertTrue(each.getText().equals(name)); // yukaridaki yerine bu da olur ama zaten if conditionda bu belritildigi icin gerek yok



            return;//BREAK OLSA SECED IF DEN CIKARDI AMA RETURN ILE TUM SISTEM DURUR DOLAYISIYLA ARKADAN GELEN HATA BILDIRIMI OLMAZ
            // yani eger isim varsa verification olur ve sistem cikar
            //isim yoks asagidaki yere gicer

        }

        Assert.fail("Name does not exist in the list!");


    }
    /*
    • Create a method named printNamesAndCities in SmartBearUtils class.
    • Method takes WebDriver object.
    • This method should simply print all the names in the List of All Orders.
    • Create a new TestNG test to test if the method is working as expected.
    • Output should be like:
    • Name1: name , City1: city
    • Name2: name , City2: city
     */
    public static void printNamesAndCities(WebDriver driver){

        //locating all the names from all the rows and storing in a list of web element
        List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

        //we need to locate all the cities from all the rows
        List<WebElement> citiesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[7]"));

        for (int i = 0; i < namesList.size() ; i++) {

            System.out.println("Name"+ (i+1) +": " + namesList.get(i).getText() + ", City"+ (i+1) +": " + citiesList.get(i).getText());

        }

    }
}