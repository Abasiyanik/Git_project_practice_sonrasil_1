package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Checkbox_Paractice {
    public static void main(String[] args) {
//        Practice: Cybertek Checkboxes
//        1. Go to http://practice.cybertekschool.com/checkboxes

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");

//        2. Confirm checkbox #1 is NOT selected by default
        WebElement checkBox1=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        boolean checkbox1=checkBox1.isSelected();
        System.out.println("Checkbox1 is selected:"+checkbox1);
//        3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkBox2=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
        boolean checkbox2=checkBox2.isSelected();
        System.out.println("Checkbox2 is selected:"+checkbox2);
//
        System.out.println("================================================================");
//        4. Click checkbox #1 to select it.
        checkBox1.click();
//        5. Click checkbox #2 to deselect it.
        checkBox2.click();
//        6. Confirm checkbox #1 is SELECTED.
        WebElement checkBox3=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        boolean checkbox3=checkBox3.isSelected();
        System.out.println("Checkbox1 is selected:"+checkbox3);

//        7. Confirm checkbox #2 is NOT selected.
        WebElement checkBox4=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
       // WebElement checkBox4=driver.findElement(By.cssSelector("input[type='checkbox']>\"checkbox 2\""));//css ile aynisi yaoildi
        boolean checkbox4=checkBox4.isSelected();
        System.out.println("Checkbox2 is selected:"+checkbox4);
//        String adim="FATIH";
//        String [] ad= adim.split("");
//        System.out.println(Arrays.toString(ad));
        driver.close();
    }
}
