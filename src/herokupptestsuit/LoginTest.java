package herokupptestsuit;

import herokuappbrowsefactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setUp(){
        openBrowser(baseurl);
    }
    @Test
    public void userShouldLoginSuccessFullyWithValidCredentials(){
        WebElement username= driver.findElement(By.id("username"));//username
        username.sendKeys("tomsmith");//send username
        WebElement password=driver.findElement(By.id("password"));//password
        password.sendKeys("SuperSecretPassword");//send password
        WebElement loginButton=driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginButton.click();//click on login

    }
    @Test
    public void verifyTheUsernameErrorMessage(){
        WebElement username= driver.findElement(By.id("username"));//username
        username.sendKeys("tomsmith1");//sendusername
        WebElement password=driver.findElement(By.id("password"));//password
        password.sendKeys("SuperSecretPassword!");//password sendkey
        WebElement loginButton=driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginButton.click();//click on link
        WebElement errorMsg=driver.findElement(By.id("flash"));//errormessage
         errorMsg.getText();
    }
    @Test
     public void verifyPasswordErrorMessage(){
        WebElement username= driver.findElement(By.id("username"));//username
        username.sendKeys("tomsmith");
        WebElement password=driver.findElement(By.id("password"));//password
        password.sendKeys("SuperSecretPassword");//send password
        WebElement loginButton= driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginButton.click();
        WebElement errorMsg=driver.findElement(By.id("flash"));
        errorMsg.getText();


        }


    public void tearDown()
    {
        driver.quit();
    }


    }
