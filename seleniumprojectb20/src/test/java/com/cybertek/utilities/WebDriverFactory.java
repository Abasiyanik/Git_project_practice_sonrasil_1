package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;

/* TASK: NEW METHOD CREATION
   Method name: getDriver
   Static method
   Accepts string argument: browserType --> will determine what browser opens
       -> if "chrome" opens chrome browser
       -> if "firefox" opens firefox browser
   return type: WebDriver

    */
public class WebDriverFactory {

   public static WebDriver getDriver(String browserType){

       if (browserType.equalsIgnoreCase("chrome")){
           //System.setProperty("webdriver.chrome.driver", "path");

           WebDriverManager.chromedriver().setup();
           return new ChromeDriver();

       }else if (browserType.equalsIgnoreCase("firefox")){
           WebDriverManager.firefoxdriver().setup();
           return new FirefoxDriver();
       }else{
           System.out.println("Given browser does not exist. Driver = null!");
           return null;
       }

   }
    public static String toString(char[] a)  {
        String string = new String(a);
        return string;
    }
    //simoly convert char to a string. do not forgert String is a custom class
    public static  String [] convertletter (String password){
        //produce two char arrays from the key word
        char [] str=password.toCharArray();
        char[] container=password.toCharArray();
        //make one array list and a string ready
        ArrayList<String> negCred=new ArrayList<>();
        String container1="";
        for (int i=0; i<=container.length-1; i++ ){
            //ocnvert only the sepecific letter; if it is capital it makes it small; if it is lower case it makes it upper case
            if (container[i]>='a' && container[i]<='z'){
                container[i]= (char) (container[i]-32);
            }
            else if(container[i]>='A' && container[i]<='Z') {container[i] = (char) (container[i] + 32); }
            //if it is not letter, skip the step
            else {continue;}
            container1=toString(container);
            negCred.add(container1);
            container[i]=str[i];
        }

        String [] convertletter=negCred.toArray(new String[0]);

        return convertletter;
    }
    //this custom class which produce a variation of string. in each iteration it changes the letter case: capital or small. The return is array

}
