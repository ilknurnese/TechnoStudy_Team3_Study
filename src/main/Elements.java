package main;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements {

    public Elements(){

        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "(//*[text()='Kurslar'])[1]")
    public WebElement courses;
    
    @FindBy(xpath="//*[text()='SDET-Yazılım Test Uzmanı']")
     public WebElement sdet;

    @FindBy(css="[class='t978__link-inner t978__link-inner_left']")
    public List<WebElement> coursesList;

    @FindBy(xpath = "(//a[@data-buttonfieldset='button2'])[1]")
    public WebElement campusLogin;

    @FindBy(css = "[class='mdc-button__label']")
    public WebElement loginButton;
}
