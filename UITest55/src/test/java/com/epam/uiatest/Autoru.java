package com.epam.uiatest;

import com.epam.web.matcher.junit.Assert;
import epam.controls.Checkbox;
import epam.controls.Radio;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by Vladimir_Provornov on 06-Oct-16.
 */
public class Example {

//    @Test
    @Test(dataProviderClass = DProvider.class, dataProvider = "correctData")
    public void test(boolean bool, String login1, String pass1){
//        public void test(){
        System.setProperty("webdriver.gecko.driver", "/Projectsi/geckodriver.exe");
//        FirefoxProfile firefoxprofile = new FirefoxProfile();
//        firefoxprofile.setPreference("general.useragent.override", "Mozilla/5.0 (iPad; CPU OS 6_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10A5355d Safari/8536.25");
//        DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
//        firefox.get("http://whatsmyua.com");
//        cap.setBrowserName(" Test Browser Name");
//        System.out.println(firefox.findElement(By.id("ua-link")).getText());

//      Define capabilities to change User Agent
//        DesiredCapabilities capability = DesiredCapabilities.firefox();
//        capability.setBrowserName("Safari");

//        firefox.get("http://whatsmyua.com");

//      Launch Firefox
        FirefoxDriver driver = new FirefoxDriver();

//      get desired site URL
        driver.get("https://jdi-framework.github.io/tests");

//      Maximise browser window
        driver.manage().window().maximize();

//      try-catch to avoid exceptions and unexpected test break
        try {
//          get Mouse and Keyboard
            driver.getMouse();
//            driver.getKeyboard();

//          Handle and switch to browser window
            String windowHandler = driver.getWindowHandle();
            driver.switchTo().window(windowHandler);

//          Find authorization form handler and click on it to open login form
            WebElement element = driver.findElement(By.className("profile-photo"));
            element.click();

//          Find and fill Login form
            WebElement login = driver.findElement(By.id("Login"));
            login.sendKeys(login1);
//            login.sendKeys("epam");

//          Find and fill Password form
            WebElement pass = driver.findElement(By.id("Password"));
            pass.sendKeys(pass1);
//            pass.sendKeys("1234");

//          Find and press Enter button
            WebElement enter = driver.findElement(By.xpath("//button[@class='uui-button dark-blue btn-login']"));
            enter.click();

//            WebDriverWait wait = new WebDriverWait(firefox, 10000);
//            element = wait.until(ExpectedConditions.elementToBeClickable(By.id("id")));


            Assert.assertTrue(driver.findElement(By.cssSelector(".logout")).isEnabled());
            driver.navigate().to("/tests/page8.htm");

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




        }
        catch (Exception e){

        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
 //       driver.close();
 //       driver.quit();


    }
}
