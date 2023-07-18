package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.util.List;

public class N11Pages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    By categoriesBtn = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategoriler\")");
    By filter = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/listingFilterCountTV\")");
    By brand = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Marka\")");
    By apple = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Apple\")");
    By applyBtn = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/tv_name\")");
    By storage = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Dahili Hafıza\")");
    By selectStorage = MobileBy.AndroidUIAutomator("new UiSelector().text(\"256 GB\")");
    By model = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Model\")");
    By selectModel = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Iphone 14 Pro\")");
    By showResult = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/giybiFilterShowResultsBTN\")");
    By addsToCart = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivAddToBasket\")");
    By myCart = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/navigation_basket\")");
    By checkToCart = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/basketItemProductLayoutRoot\")");

    public N11Pages(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void tapsToCategories() {
        driver.findElement(categoriesBtn).click();
    }

    public void tapsToElectronically() {
        List<WebElement> listOfElement = driver.findElements(MobileBy
                .AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        listOfElement.get(1).click();
    }

    public void tapsToPhonesAndAccessories() {
        List<WebElement> listOfElement = driver.findElements(MobileBy
                .AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        listOfElement.get(0).click();
    }

    public void tapsToCellPhone() {
        List<WebElement> listOfElement = driver.findElements(MobileBy
                .AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        listOfElement.get(0).click();
    }

    public void tapsToFilter() {
        driver.findElement(filter).click();
    }

    public void applyFiltering() {
        driver.findElement(brand).click();
        driver.findElement(apple).click();
        driver.findElement(applyBtn).click();
        driver.findElement(storage).click();
        driver.findElement(selectStorage).click();
        driver.findElement(applyBtn).click();
        driver.findElement(model).click();
        driver.findElement(selectModel).click();
        driver.findElement(applyBtn).click();
    }

    public void tapsToShowResults() {
        driver.findElement(showResult).click();
    }

    public void addsToCart() {
        driver.findElement(addsToCart).click();
    }

    public void tapsToMyCart() {
        driver.findElement(myCart).click();
    }

    public void checkToCart() {
        elementHelper.checkVisibility(checkToCart);
    }
}
