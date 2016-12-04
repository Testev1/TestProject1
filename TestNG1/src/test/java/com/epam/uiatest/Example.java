package com.epam.uiatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by Vladimir_Provornov on 10-Oct-16.
 */
public class Example {


    @Test

    public void test(){

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

        // get desired site URL
        driver.get("https://auto.ru");

//      try-catch to avoid exceptions and unexpected test break
        try {
//          get Mouse and Keyboard
            driver.getMouse();
            driver.getKeyboard();

//          Handle and switch to browser window
            String windowHandler = driver.getWindowHandle();
            driver.switchTo().window(windowHandler);


            WebElement element = driver.findElement(By.className("button button_js_inited button_theme_islands button_size_l button_type_button select__button"));
//            WebElement element2 = driver.findElement(By.xpath("//label[contains(., 'Да')]/input"));
            element.click();
//            Checkbox water = new Checkbox(driver,"button button_js_inited button_theme_islands button_size_l button_type_button select__button");
//            water.check();

        }
        catch (Exception e){

        }
/*
        driver.close();
        firefox.quit();
*/

    }


}


