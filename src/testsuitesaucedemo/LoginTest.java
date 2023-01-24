package testsuitesaucedemo;

import herokuappbrowsefactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl="https://www.saucedemo.com/";
    @Before
    public void setUp(){
        openBrowser(baseurl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){//valid input
        WebElement username= driver.findElement(By.id("user-name"));//username
        username.sendKeys("standard_user");//username send key
        WebElement password=driver.findElement(By.id("password"));//password
        password.sendKeys("secret_sauce");//password send key
        WebElement loginButton=driver.findElement(By.id("login-button"));
        loginButton.click();//click login
        WebElement textPRODUCTS= driver.findElement(By.xpath("//span[@class='title']"));
        textPRODUCTS.getText();//check products
    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        WebElement username= driver.findElement(By.id("user-name"));//username
        username.sendKeys("standard_user");//send key username
        WebElement password=driver.findElement(By.id("password"));//password
        password.sendKeys("secret_sauce");//send key password
        WebElement loginButton=driver.findElement(By.id("login-button"));
        loginButton.click();//click login
        WebElement productsdisplayed=driver.findElement(By.xpath("//span[@class='title']"));
        productsdisplayed.getText();

    }
    @After
    public void tearDown(){
        driver.quit();//close
    }
}
