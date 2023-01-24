package testsuitenopcommerce;

import nopcommercebrowsefactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openBrowser(baseurl);
    }
    @Test
            public void login(){
        WebElement loginInLink= driver.findElement(By.className("ico-login"));//loginlink
        loginInLink.click();
        WebElement welcomeMsg=driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualText= welcomeMsg.getText();//welcome message text
        String expectedText="Welcome, Please Sign In!";
        Assert.assertEquals(expectedText,actualText);
    }
    @Test//valid inputs
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        WebElement loginInLink= driver.findElement(By.className("ico-login"));//login link
        loginInLink.click();

        WebElement emailIdField= driver.findElement(By.className("email"));//emailfield
        emailIdField.sendKeys("romance@gmail.com");//send emailfield

        WebElement passwordField=driver.findElement(By.id("Password"));//passwordfield
        passwordField.sendKeys("999999");//send key to password

        WebElement loginButton=driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        loginButton.click();//login button click

        WebElement logOutLink=driver.findElement(By.className("ico-logout"));
        String actualText= logOutLink.getText();
        String expectedText="Log out";
        Assert.assertEquals(expectedText,actualText);//result in expected and actual result

    }
    @Test
    public void userShouldVerifyTheErrorMessage(){//check error messages
        WebElement loginInLink= driver.findElement(By.className("ico-login"));
        loginInLink.click();

        WebElement emailIdField= driver.findElement(By.id("Email"));//email
        emailIdField.sendKeys("romance@gmail.com");//sendkey email

        WebElement passwordField=driver.findElement(By.name("Password"));
        passwordField.sendKeys("999999");//send key password

        WebElement loginButton=driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        loginButton.click();//login button click

        //verify error
        WebElement errorMessage= driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        errorMessage.getText();



    }
    @After
    public void tearDown()
    {
        driver.quit();
    }
}