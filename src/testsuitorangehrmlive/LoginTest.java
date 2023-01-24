package testsuitorangehrmlive;

import orangehrmlivebrowserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl =" https://opensource-demo.orangehrmlive.com/";
    @Before
    public void SetUp(){
        openBrowser(baseurl);
    }
   @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){//valid inputs
       WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
       username.sendKeys("Admin");//username sendkeys

       WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
       password.sendKeys("admin123");//password sendkeys

       WebElement loginClick=driver.findElement(By.xpath("//button[@type='submit']"));
       loginClick.click();//click on login
   }
//welcome message not coming

}

