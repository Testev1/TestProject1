package com.epam.controls;

import com.epam.elements.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Vladimir_Provornov on 17-Oct-16.
 */
public class Checkbox extends Element {


    public Checkbox(WebDriver driver, By locator){
        super(driver, locator);
    }

    public boolean isChecked()
    {
        return getElement().isSelected();
    }

    public void check(){
        if (!isChecked()) {
            getElement().click();
        }

    }
}
