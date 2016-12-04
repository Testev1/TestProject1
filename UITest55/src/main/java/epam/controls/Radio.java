package epam.controls;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Vladimir_Provornov on 17-Oct-16.
 */
public class  Radio extends Element {


    public Radio(WebDriver driver, String text)
    {
        super(driver, By.xpath("//label[contains(., '" + text + "')]/input"));
    }

    public boolean isChecked()
    {
        return getElement().isSelected();
    }

    public void check(){
        if (!isChecked()) getElement().click();
        }

    public void uncheck()
    {
        if (isChecked()) getElement().click();
    }
}

