package testsuitorangehrmlive;

import orangehrmlivebrowserfactory.BaseTest;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    public void SetUp() {
        openBrowser(baseurl);

    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        WebElement forgotpassword = driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']]"));
        forgotpassword.click();//i tried 5 times but still giving error in console for line 19.


    }


    }



