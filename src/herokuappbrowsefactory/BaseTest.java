package herokuappbrowsefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public void openBrowser(String baseurl){
        ChromeOptions options = new ChromeOptions(); //setting webdriver
        driver = new ChromeDriver(options);
        driver.get(baseurl);//lunch the url
        driver.manage().window().maximize();//maximize browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//timeout for browser

    }
    public void closeBrowser()
    {
      driver.quit();
    }

}
