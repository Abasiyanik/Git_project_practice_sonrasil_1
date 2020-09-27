package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_CybertekForgotPassword {
    public static void main(String[] args) {
//        TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
//        1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");

//        2. Go to
        driver.get("http://practice.cybertekschool.com/forgot_password");

//        3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)

//       a. “Home” link
//        WebElement searchBox=driver.findElement(By.xpath("//a[@class='nav-link']"));//class secilir
        WebElement searchBox=driver.findElement(By.xpath("//a[.='Home']"));// text secilir from//<a class="nav-link" href="/">Home</a>

        System.out.println(searchBox.getText());



//        b. “Forgot password” header
// ==================arasigdaki ikisidr forgor passwordu bulur
        WebElement searchBox1=driver.findElement(By.xpath("//h2[.='Forgot Password']"));// text secilir from//<a class="nav-link" href="/">Home</a>
        System.out.println(searchBox1.getText());

        WebElement searchBox3=driver.findElement(By.xpath("//div[@class='example']/h2"));//class secilir ve child h2ye gider
        System.out.println(searchBox3.getText());



//        c. “E-mail” text //<label for="email">E-mail</label>
//===============================================
        WebElement searchBox4=driver.findElement(By.xpath("//label[.='E-mail']"));// text secilir from//<a class="nav-link" href="/">Home</a>
//        WebElement searchBox4=driver.findElement(By.xpath("//label[@for='E-mail']"));// text secilir from//<a class="nav-link" href="/">Home</a>
        System.out.println(searchBox4.getText());

        WebElement searchBox5=driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/label"));//class secilir ve child h2ye gider
        System.out.println(searchBox5.getText());

        //hocanin cozumu
        WebElement emailText=driver.findElement(By.xpath("//label[@for='email']")); //


//
//        d. E-mail input box
//        <input type="text" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required="">

        WebElement emailInput =driver.findElement(By.xpath("//input[@name='email']")); //
//
//
//        e. “Retrieve password” button
        //<button id="form_submit" class="radius" type="submit"><i class="icon-2x icon-signin">Retrieve password</i></button>
// class , type ve text are targers
        WebElement passBtn  =driver.findElement(By.cssSelector("button.radius")); //
        //button#form_submit
        //button[id='form_submit']
        //button{class='radius']


//        f. “Powered by Cybertek School” text
        //<a target="_blank" href="https://cybertekschool.com/">Cybertek School</a>
        WebElement linkText  =driver.findElement(By.xpath("//a[.='Cybertek School']")); //
        // //a[.='Cybertek School']
        WebElement powerbyDiv  =driver.findElement(By.xpath("//div[@style='text-align: center;']")); //
        System.out.println("powerbyDiv = " + powerbyDiv.getText());


//        4. Verify all WebElements are displayed.
//                Better if you do with both XPATH and javax.swing.text.html.CSS selector for practice purposes.

        // driver.close();


    }
}
