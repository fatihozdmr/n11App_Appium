package util;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    static AppiumDriver driver;
    static Properties properties;
    static DesiredCapabilities cap;

    public static AppiumDriver initializeDriver(String browser) {
        properties = ConfigReader.getProperties();
        cap = new DesiredCapabilities();
        if (browser.equals("Android")) {
            cap.setCapability("platformName", "Android");
            cap.setCapability("udid", "emulator-5554");
            cap.setCapability("appPackage", "com.dmall.mfandroid");
            cap.setCapability("appActivity", "com.dmall.mfandroid.activity.base.NewSplash");

        } else if (browser.equals("IOS")) {
            cap.setCapability("platformName", "IOS");
            cap.setCapability("udid", "");
            cap.setCapability("appPackage", "");
            cap.setCapability("appActivity", "");
        }
        try {
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        int imWait = Integer.parseInt("0", 10);
        driver.manage().timeouts().implicitlyWait(imWait, TimeUnit.SECONDS);
        return getDriver();
    }

    public static AppiumDriver getDriver() {
        return driver;
    }
}
