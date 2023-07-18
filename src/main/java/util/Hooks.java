package util;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.*;
import org.testng.Reporter;

import java.util.Properties;

public class Hooks {
    AppiumDriver driver;
    Properties properties;

    @Before
    public void before() throws InterruptedException {
        String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        properties = ConfigReader.initializeProperties();
        driver = DriverFactory.initializeDriver(browser);
        Thread.sleep(3000);
    }

    @After
    public void after() {
        driver.quit();
    }
}
