package epam.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Vladimir_Provornov on 17-Oct-16.
 */
public class Element {

    private String _id;
    private By _locator;
    private WebElement _elmnt;
    private WebDriver _driver;


    public WebElement getElement(){
        if (_elmnt ==null){
            _elmnt = _driver.findElement(_locator);
        }
        return _elmnt;
    }

    public Element(WebDriver driver, By locator) {
        _driver = driver;
        _locator = locator;
    }
}
// +radiobuttons