package com.cybertek.tests.day10_testbase_properties_driverUtil;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {


    @Test
    public void reading_from_properties_file() throws IOException {

        //STEPS:

//        1. Use a class called properites
//      we make properties object to be able to read configuration.properites file
        //import from java util

        Properties properties=new Properties();

//        2. FileInputStream: opens the file
        String path="configuration.properties";// how ot get the path => right click => copy => copy path

        FileInputStream file=new FileInputStream(path);//we need to pass the path here
        // the error above can be handled by two ways: add exception // throws FileNotFoundException


//        3. load the file
        properties.load(file);/// handle the exception

//        4. read it // properties.getProperty("key");
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
//        5. closee it
        file.close();//file closed







    }

@Test
    public void using_properties_utility_method(){

        // this will give key and return url as a sting
    System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
    System.out.println("ConfigurationReader.getProperty(\"smartbearUrl\") = " + ConfigurationReader.getProperty("smartbearUrl"));


}
    };





