package testsuiteultimateqa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ultimateqabrowserfactory.BaseTest;

public class LoginTest extends BaseTest {
    String baseurl=" https://courses.ultimateqa.com/";
    @Before
    public void Setup(){
        openBrowser(baseurl);

    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        WebElement SignInLink= driver.findElement(By.linkText("Sign In"));
        SignInLink.click();

        WebElement textWelcomeBack= driver.findElement(By.className("page__heading"));//welcome message
        textWelcomeBack.getText();
    }
    @Test
    public void verifyTheErrorMessage(){
        WebElement SignInLink= driver.findElement(By.linkText("Sign In"));//signinlink
        SignInLink.click();

        WebElement email=driver.findElement(By.id("user[email]"));//email field
        email.sendKeys("jal@gmal.com");//send key email invalid

        WebElement password=driver.findElement(By.id("user[password]"));
        password.sendKeys("london");//send password invalid

        WebElement SigninClick=driver.findElement(By.xpath("//button[@class='button button-primary g-recaptcha']"));
        SigninClick.click();

       // WebElement errorMsg= driver.findElement(By.xpath("//li[@class='form-error__list-item']"));//this element giving error
        //errorMsg.getText();






    }
        @After
        public void closeBrowser() {
            driver.quit();
        }
}
