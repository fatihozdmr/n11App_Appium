package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.N11Pages;
import util.DriverFactory;

public class N11StepDefinitions {
    N11Pages n11Pages = new N11Pages(DriverFactory.getDriver());

    @When("User taps on Kategoriler")
    public void userTapsOnCategories() {
        n11Pages.tapsToCategories();
    }

    @And("User taps Elektronik on the categories")
    public void userTapsElectronically() {
        n11Pages.tapsToElectronically();
    }

    @And("User taps Telefon & Aksesuarları on the electronically")
    public void userTapsOnPhonesAndAccessories() {
        n11Pages.tapsToPhonesAndAccessories();
    }

    @And("User taps Cep Telefonu on Phones and Accessories")
    public void userTapsCellPhone() {
        n11Pages.tapsToCellPhone();
    }

    @And("User taps to Filtrele")
    public void userTapsToFilter() throws InterruptedException {
        Thread.sleep(3000);
        n11Pages.tapsToFilter();
    }

    @And("User is filtering")
    public void userIsFiltering() {
        n11Pages.applyFiltering();
    }

    @And("User taps to Sonuçları Göster on the filter")
    public void userTapsToShowResults() {
        n11Pages.tapsToShowResults();
    }

    @And("User adds product to Sepetim")
    public void userAddsProductToCart() {
        n11Pages.addsToCart();
    }

    @And("User taps Sepetim")
    public void userTapsMyCart() {
        n11Pages.tapsToMyCart();
    }

    @Then("Product added to cart")
    public void productAddedToCart() {
        n11Pages.checkToCart();
    }
}
