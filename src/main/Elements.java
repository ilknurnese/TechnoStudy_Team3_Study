package main;

import Utility.BaseDriver;
import org.openqa.selenium.WebDriver;
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
    
}
