package main;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Proje_TechnoStudy extends BaseDriver {
    Elements el=new Elements();

    @Test
    public void Test_US_1(){

        Elements elements=new Elements();

        for (int i = 0; i < elements.coursesList.size(); i++) {
            wait.until(ExpectedConditions.elementToBeClickable(elements.courses)).click();
            wait.until(ExpectedConditions.elementToBeClickable(elements.coursesList.get(i))).click();
            Assert.assertTrue(elements.coursesList.get(i).isEnabled(),"Kurs bulunamadı");
        }

    }

    @Test
    public void Test_US_2(){
        Elements elements=new Elements();
        wait.until(ExpectedConditions.elementToBeClickable(elements.campusLogin)).click();
        Assert.assertTrue(elements.loginButton.isDisplayed());
    }

}
