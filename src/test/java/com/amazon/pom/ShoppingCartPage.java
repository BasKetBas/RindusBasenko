package com.amazon.pom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class ShoppingCartPage extends BasePage {

    private static ShoppingCartPage shoppingCartPage;


    @FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
    private WebElement proceedToRetailCheckoutButton;

    @FindBy(xpath = "//div[@id='banner-image']")
    private WebElement homePageRefund;

    @FindBy(xpath = "//a[@id='a-autoid-1-announce']")
    private WebElement submitHomePageRefund;

    @FindBy(xpath = "//span[@data-a-class='quantity']")
    private WebElement productReduction;

    @FindBy(xpath = "//select[@id='quantity']")
    private WebElement selectingProductReduction;

    @FindBy(xpath = "//span[@id='sc-buy-box-ptc-button']")
    private WebElement checkingBasketButton;

    @FindBy(xpath = "//span[@id='nav-cart-count']")
    private WebElement numberOfOrders;

    @FindBy(xpath = "//span[@id='sc-subtotal-amount-buybox']")
    private WebElement subtotal;

    @FindBy(xpath = "//div[@class='sc-item-price-block']")
    private WebElement costOfOneItem;

    private ShoppingCartPage() {
        super();

        PageFactory.initElements(driver, this);
    }

    public static ShoppingCartPage getInstance() {
        if (shoppingCartPage == null) {
            shoppingCartPage = new ShoppingCartPage();
        }
        return shoppingCartPage;
    }

    public static ShoppingCartPage getShoppingCartPage() {
        return shoppingCartPage;
    }

//    public void clickProceedToRetailCheckoutButton(){
//        waiter.until(ExpectedConditions.visibilityOf(proceedToRetailCheckoutButton));
//        proceedToRetailCheckoutButton.click();
//    }
//
//    public void clickHomePageRefund(){
//        waiter.until(ExpectedConditions.visibilityOf(homePageRefund));
//        homePageRefund.click();
//    }
//
//    public void clickSubmitHomePageRefund(){
//        waiter.until(ExpectedConditions.visibilityOf(submitHomePageRefund));
//        submitHomePageRefund.click();
//    }

    public void clickProductReduction() {
        waiter.until(ExpectedConditions.visibilityOf(productReduction));
        productReduction.click();
    }

    public int selectingProductReduction() {
        int index = 1;
        waiter.until(ExpectedConditions.visibilityOf(selectingProductReduction));
        Select select = new Select(selectingProductReduction);
        select.selectByIndex(index);
        return index;
    }

    public void chekingBasketButton() {
        waiter.until(ExpectedConditions.visibilityOf(checkingBasketButton));
        checkingBasketButton.click();
    }

    public String getNumberOfProductBasketButton() {
        waiter.until(ExpectedConditions.visibilityOf(numberOfOrders));
        return numberOfOrders.getText();
    }

    public String getSubtotal() {
        waiter.until(ExpectedConditions.visibilityOf(subtotal));
        return subtotal.getText();
    }

    public String getCostOfOneItem() {
        waiter.until(ExpectedConditions.visibilityOf(costOfOneItem));
        return costOfOneItem.getText();

    }


}
