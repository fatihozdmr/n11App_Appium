package util;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ElementHelper {
    AppiumDriver driver;
    WebDriverWait wait;
    Actions actions;

    public ElementHelper(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.actions = new Actions(driver);
    }

    public WebElement presenceElement(By key) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }

    public WebElement findElement(By key) {
        WebElement webElement = presenceElement(key);
        return webElement;
    }

    public void click(By key) {
        findElement(key).click();
    }

    public void sendKeys(By key, String text) {
        findElement(key).sendKeys(text);
    }

    public void checkVisibility(By key) {
        wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }
}
