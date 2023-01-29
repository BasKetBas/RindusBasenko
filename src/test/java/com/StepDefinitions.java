package com;

import com.amazon.pom.*;
import com.amazon.tools.DriverStorage;
import io.cucumber.java.en.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.support.ui.Select;

public class StepDefinitions {
    private HomeAmazonPage homeAmazonPage = HomeAmazonPage.getInstance();
    private ShoppingCartPage shoppingCartPage = ShoppingCartPage.getInstance();
    private ResultPage resultPage = ResultPage.getInstance();

    private Authorization authorization = Authorization.getInstance();
    private DriverStorage driverStorage = DriverStorage.getInstance();
    private NotificationPage notificationPage = NotificationPage.getInstance();


    @Given("main page is open")
    public void openMainPage() {
        Assertions.assertThat(driverStorage.getDriver().getTitle()).isEqualTo("Amazon.es: compra online de electrónica, libros, deporte, hogar, moda y mucho más.");
    }

    @When("filling search field {string}")
    public void fillingSearchField(String arg0) {
        homeAmazonPage.searchNameOfProduct(arg0);
    }

    @And("press search button")
    public void pressSearchButton() {
        homeAmazonPage.clickSearchButton();
    }

    @Then("result page will open")
    public void onAPageWithListOfMenSHats() {
    }

    @When("chose first hat")
    public void choseFirstHat() {
        resultPage.choosingOfProduct();
    }

    @And("press chosen hat")
    public void pressChosenHat() {
        resultPage.choosingAmountOfProduct();
        resultPage.clickAmountSelectedProduct();
    }

    @Then("on a page with describing the selected hat")
    public void onAPageWithDescribingTheSelectedHat() {
        resultPage.clickBasketAdditionButton();
        resultPage.clickShoppingCartButton();
    }

    @When("increased the number of hats to two")
    public void increasedTheNumberOfHatsToTwo() {
        resultPage.choosingAmountOfProduct();
        resultPage.clickAmountSelectedProduct();

    }

    @And("press add to basket button")
    public void pressAddToBasketButton() {
        resultPage.clickBasketAdditionButton();
    }

    @And("press process order button")
//    public void pressProcessOrderButton() {
//        shoppingCartPage.clickProceedToRetailCheckoutButton();
//    }

    @Then("added two hats")
    public void addedTwoHats() {
        Assertions.assertThat(shoppingCartPage.getNumberOfProductBasketButton()).contains("2");
    }

    @When("fill {string}")
//    public void fill(String arg0) {
//        authorization.fillAuthorizationField(arg0);
//    }

    @And("press continue button")
//    public void pressContinueButton() {
//        authorization.clickContinueButton();
//    }

    @Then("on a password page")
    public void onAPasswordPage() {
    }

    @When("fill password field {string}")
//    public void fillPasswordField(String arg0) {
//        authorization.inputPasswordField(arg0);
//    }

    @And("press login button")
    //public void pressLoginButton() {
//        authorization.clickSignInSubmitButton();
//    }

    @Then("on a process order page")
    public void onAProcessOrderPage() {
    }

    @When("press amazon area")
    //public void pressAmazonArea() {
    //   shoppingCartPage.clickHomePageRefund();
    //}

    @And("press back to cart button")
    //public void pressBackToCartButton() {
    //  shoppingCartPage.clickSubmitHomePageRefund();
    //}

    @Then("on a basket page")
    public void onABasketPage() {
    }

    @When("reduce the number of hats to one")
    public void reduceTheNumberOfHatsToOne() {
        shoppingCartPage.clickProductReduction();
        shoppingCartPage.selectingProductReduction();
    }

    @And("press checkout button")
    public void pressCheckoutButton() {
        shoppingCartPage.chekingBasketButton();
    }

    @And("number of hats one")
    public void numberOfHatsOne() {

        Assertions.assertThat(shoppingCartPage.getNumberOfProductBasketButton()).contains("1");
    }

    @And("notification page is open")
    public void notificationPageIsOpen() {
        notificationPage.pressBasketButton();

    }

    @Then("price is correctly change")
    public void priceIsCorrectlyChange() {
        double total = Double.parseDouble(shoppingCartPage.getSubtotal());
        double costItem = Double.parseDouble(shoppingCartPage.getCostOfOneItem());
        Assertions.assertThat(total).isEqualTo(costItem);

    }
}
