
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.*;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BaseTest {
    public static WebDriver driver;
    public static TrackerPage trackerPage;


    @Before
    public static void setUp()  {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
        trackerPage=new TrackerPage(driver);
    }

    public static void waitForPageLoad(){
        driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.SECONDS);
    }

    public static void waitFor(long millisec) throws InterruptedException {
        Thread.sleep(millisec);
    }

    @After
    public static void tearDown()
    {
//        byte[] screenShotByte=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//        scenario.embed(screenShotByte,"image/png");

        driver.close();
    }

}
