package testsuitenopcommerce;

import nopcommercebrowsefactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
   //checking all tab functionality
    public void usershouldNavigateTopComputerPageSuccessfully() {
        driver.findElement(By.linkText("Computers")).click();//tab for computers
        //driver.findElement((By.linkText("Computers"))
        WebElement textComputers = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        textComputers.getText();
    }

    @Test
    public void usershouldNavigateToElectronicsPageSuccessfully() {//tab for electronics
        driver.findElement(By.linkText("Electronics")).click();
        WebElement textElectronics = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        textElectronics.getText();

    }

    @Test
    public void usershouldNavigateToApparelPageSuccessfully() {//tab for Apperel
        driver.findElement(By.linkText("Apparel")).click();
        WebElement textApparel = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        textApparel.getText();
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {//tab for digitaldownloadspage
        driver.findElement(By.linkText("Digital downloads")).click();
        WebElement textDigitaldownloads = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        textDigitaldownloads.getText();
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {//books link test
        driver.findElement(By.linkText("Books")).click();
        WebElement textBooks = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        textBooks.getText();
    }

    @Test
    public void userShouldNavigateTJewelryPageSuccessfully() {//jwellery link test
        driver.findElement(By.linkText("Jewelry")).click();
        WebElement textJewelry = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        textJewelry.getText();
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {//giftcard link test
        driver.findElement(By.linkText("Gift Cards")).click();
        WebElement textGiftCards = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        textGiftCards.getText();

    }
    @After
    public void tearDown(){
        driver.quit();//close browser
}
}