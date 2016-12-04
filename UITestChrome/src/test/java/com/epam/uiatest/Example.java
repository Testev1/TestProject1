package com.epam.uiatest;

import com.epam.web.matcher.junit.Assert;
import epam.controls.Checkbox;
import epam.controls.Radio;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by Vladimir_Provornov on 10-Oct-16.
 */
public class Example  {

//    TestBase driver = new TestBase();

    @Test (dataProviderClass = DProvider.class, dataProvider = "correctData")

    public void test(String login1, String pass1){

        System.setProperty("webdriver.chrome.driver", "/Projectsi/ChromeDriver.exe");
        ChromeDriver driver = new ChromeDriver();
 /*       String url = "https://www.whatsmyua.com/";
        driver.get(url);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(url, currentUrl);
        driver.findElement(By.xpath("").getText);
*/

//      Maximise browser window
        driver.manage().window().maximize();

        //           `get desired site URL
        driver.get("https://jdi-framework.github.io/tests");

//      try-catch to avoid exceptions and unexpected test break
        try {
//          get Mouse and Keyboard
            driver.getMouse();
            driver.getKeyboard();

//          Handle and switch to browser window
            String windowHandler = driver.getWindowHandle();
            driver.switchTo().window(windowHandler);

//          Find authorization form handler and click on it to open login form
            WebElement element = driver.findElement(By.className("profile-photo"));

            element.click();

//          Find and fill Login form
            WebElement login = driver.findElement(By.id("Login"));
            login.sendKeys(login1);

//          Find and fill Password form
            WebElement pass = driver.findElement(By.id("Password"));
            pass.sendKeys(pass1);

//          Find and press Enter button
            WebElement enter = driver.findElement(By.xpath("//button[@class='uui-button dark-blue btn-login']"));
            enter.click();


            Assert.assertTrue(driver.findElement(By.cssSelector(".logout")).isEnabled());
            driver.navigate().to("https://jdi-framework.github.io/tests/page8.htm");

            Thread.sleep(1000);


            Checkbox water = new Checkbox(driver,"Water");
            water.check();
            Checkbox earth = new Checkbox(driver,"Earth");
            earth.check();
            Checkbox wind = new Checkbox(driver,"Wind");
            wind.check();
            Checkbox fire = new Checkbox(driver,"Fire");
            fire.check();
            Radio gold = new Radio(driver,"Gold");
            gold.check();
            Thread.sleep(1000);
            Radio silver = new Radio(driver,"Silver");
            silver.check();
            Thread.sleep(1000);
            Radio bronze = new Radio(driver,"Bronze");
            bronze.check();
            Thread.sleep(1000);
            Radio selen = new Radio(driver,"Selen");
            selen.check();


//            WebDriverWait wait = new WebDriverWait(firefox, 10000);
//            element = wait.until(ExpectedConditions.elementToBeClickable(By.id("id")));


        }
        catch (Exception e){

        }
/*
        driver.close();
        firefox.quit();
*/

    }


}


