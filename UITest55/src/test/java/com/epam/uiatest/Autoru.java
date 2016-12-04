package com.epam.uiatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by Vladimir_Provornov on 06-Oct-16.
 */
public class Autoru {

//    @Test
    @Test(dataProviderClass = DProvider.class, dataProvider = "correctData")
    public void autoru(boolean bool, String login1, String pass1){
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

//      Maximise browser window
        driver.manage().window().maximize();

//      get desired site URL
        driver.get("https://auto.ru");

//      try-catch to avoid exceptions and unexpected test break
        try {
//          get Mouse and Keyboard
            driver.getMouse();
//            driver.getKeyboard();

//          Handle and switch to browser window
            String windowHandler = driver.getWindowHandle();
            driver.switchTo().window(windowHandler);

//          Find


            WebElement element = driver.findElement(By.className("nav__item"));
            element.click();
            element.findElement(By.className("search-form__alien"));
            element.findElement(By.linkText("С пробегом"));
            element.click();





//
//            Checkbox water = new Checkbox(driver,"Water");
//            water.check();
//            Checkbox earth = new Checkbox(driver,"Earth");
//            earth.check();
//            Checkbox wind = new Checkbox(driver,"Wind");
//            wind.check();
//            Checkbox fire = new Checkbox(driver,"Fire");
//            fire.check();
//            Radio gold = new Radio(driver,"Gold");
//            gold.check();
//            Thread.sleep(1000);
//            Radio silver = new Radio(driver,"Silver");
//            silver.check();
//            Thread.sleep(1000);
//            Radio bronze = new Radio(driver,"Bronze");
//            bronze.check();
//            Thread.sleep(1000);
//            Radio selen = new Radio(driver,"Selen");
//            selen.check();




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
