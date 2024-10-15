package main;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Proje_TechnoStudy extends BaseDriver {
    Elements el=new Elements();

    @Test
    public void Test_US_1(){

        Elements elements=new Elements();

        wait.until(ExpectedConditions.elementToBeClickable(elements.courses)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.sdet)).click();

    }

}
