package com.epam.uiatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

/**
 * Created by Vladimir_Provornov on 10-Oct-16.
 */
public class Example {


    @Test
    public  void test(){
        System.setProperty("webdriver.ie.driver", "C:\\Projectsi\\IEDriverServer.exe");
        WebDriver driver  = new InternetExplorerDriver();

//      get desired site URL
        driver.get("https://jdi-framework.github.io/tests");

//      Maximise browser window
//        driver.manage().window().maximize();

//      try-catch to avoid exceptions and unexpected test break
        try {

/*          Handle and switch to browser window
            String windowHandler = driver.getWindowHandle();
            driver.switchTo().window(windowHandler);
            driver.switchTo().window(driver.getWindowHandle());
*/
//          Find authorization form handler and click on it to open login form
            WebElement form = driver.findElement(By.className("profile-photo"));
            form.click();



//          Find and fill Login form
            WebElement login = driver.findElement(By.id("Login"));
            login.sendKeys("epam");

//          Find and fill Password form
            WebElement pass = driver.findElement(By.id("Password"));
            pass.sendKeys("1234");

//          Find and press Enter button
            WebElement enter = driver.findElement(By.xpath("//button[@class='uui-button dark-blue btn-login']"));
            enter.submit();

//            WebDriverWait wait = new WebDriverWait(firefox, 10000);
//            element = wait.until(ExpectedConditions.elementToBeClickable(By.id("id")));


        }
        catch (Exception e){

        }
    }
}
