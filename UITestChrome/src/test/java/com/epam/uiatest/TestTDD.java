package com.epam.uiatest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import epam.controls.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

//
//

//Rebuild in JDI

//
//
/**
 * Created by Vladimir_Provornov on 24-Oct-16.
 */
public class TestTDD extends TestBase {

    private static ChromeDriver driver;
    @BeforeSuite
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Projectsi/ChromeDriver.exe");
        driver = new ChromeDriver();
        //      Maximise browser window
        driver.manage().window().maximize();
        //           `get desired site URL
    }
    @Test
    @Given("I am on login page")

    public void onLoginPage(){
        try {
            driver.get("https://jdi-framework.github.io/tests");
            String windowHandler = driver.getWindowHandle();
            driver.switchTo().window(windowHandler);
            //          get Mouse and Keyboard
            driver.getMouse();
            driver.getKeyboard();
        }
        catch (Exception e){

        }
    }

    @Test(dataProviderClass = DProvider.class, dataProvider = "correctData")
    @When("I login as (.*)/(.*)/(.*)")
    public void login(String userName, String password, String fullName) {
        try {
//          Find authorization form handler and click on it to open login form
            WebElement element = driver.findElement(By.className("profile-photo"));

            element.click();

//          Find and fill Login form
            WebElement login = driver.findElement(By.id("Login"));
            login.sendKeys(userName);

//          Find and fill Password form
            WebElement pass = driver.findElement(By.id("Password"));
            pass.sendKeys(password);

//          Find and press Enter button
            WebElement enter = driver.findElement(By.xpath("//button[@class='uui-button dark-blue btn-login']"));
            enter.click();


            System.out.println(userName + "; " + password + "; " + fullName);
        }
         catch (Exception e){

        }

/*
        menu.get.openProfile()
            .login.setText(userName)
            .password.setText(password)
            .enter.click();
        verify(profile.get().userName.getName(), fullName);
*/
    }

    @Then("^Admin page opens$")
        public void adminPageOpens(){
        Assert.assertTrue(true);
    }
}

