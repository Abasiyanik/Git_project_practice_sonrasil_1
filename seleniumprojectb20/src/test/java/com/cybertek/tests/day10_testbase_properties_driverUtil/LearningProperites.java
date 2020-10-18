package com.cybertek.tests.day10_testbase_properties_driverUtil;

import org.testng.annotations.Test;

public class LearningProperites {//extends TestBase {

    @Test
    public void java_properties_test(){
//bu ikisi sistem ozelliklerini verir. biri operation systemi gosterir
        System.out.println("System.getProperty(\"os.name\")="+System.getProperty("os.name"));//windoes 10
        System.out.println("System.getProperty(\"user.name\")="+System.getProperty("user.name"));//abasi
        System.out.println("System.getProperty(\"user.dir\")="+System.getProperty("user.dir"));//dircetory is shown





    }

}

