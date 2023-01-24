package testsuitenopcommerce;

import nopcommercebrowsefactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";//base url

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() { //register
        driver.findElement(By.linkText("Register")).click();
        WebElement textRegister = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        textRegister.getText();
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() { //radio button
        driver.findElement(By.linkText("Register")).click();
        WebElement textRegister = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        textRegister.getText();

        WebElement radioButtonMale = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement radioButtonFemale = driver.findElement(By.xpath("//input[@id='gender-female']"));
        String GenderToBeSelected = "Male";
        if (GenderToBeSelected.equalsIgnoreCase("male")) { //if else condition
            radioButtonMale.click();
        } else if (GenderToBeSelected.equalsIgnoreCase("female")) {
            radioButtonFemale.click();
        }

        WebElement Firstname = driver.findElement(By.id("FirstName"));//firstname
        Firstname.sendKeys("gita");

        WebElement Lastname = driver.findElement(By.id("LastName"));//lastname
        Lastname.sendKeys("patel");

        WebElement Emailaddress = driver.findElement(By.id("Email"));//email
        Emailaddress.sendKeys("gita@gmail.com");//send key email
        WebElement password = driver.findElement(By.id("Password"));//password
        password.sendKeys("123456");//send password
        WebElement confirmpassword = driver.findElement(By.id("Password"));//confirmpassword
        confirmpassword.sendKeys("123456");
        WebElement RegisterButton = driver.findElement(By.id("register-button"));
        RegisterButton.click();

        // WebElement YourRegisterCompleted=driver.findElement(By.className("result"));
        //YourRegisterCompleted.getText();
        //commentout registration completed  Last twoline because not giving the get message.


    }
    @After

    public void tearDown() {
        driver.quit();
    }
}