package com.amazon.pom;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

    @FindBy(xpath = "//span[@data-a-class='quantity'][2]")
    private WebElement selectingProductReduction;

    @FindBy(xpath = "//span[@id='sc-buy-box-ptc-button']")
    private WebElement chekingBasketButton;

    private ShoppingCartPage(){
        super();

        PageFactory.initElements(driver, this);
    }

    public static ShoppingCartPage getInstance(){
        if(shoppingCartPage==null){
            shoppingCartPage=new ShoppingCartPage();
        }
        return shoppingCartPage;
    }

    public static ShoppingCartPage getShoppingCartPage() {
        return shoppingCartPage;
    }

    public void clickProceedToRetailCheckoutButton(){
        proceedToRetailCheckoutButton.click();
    }

    public void clickHomePageRefund(){
        homePageRefund.click();
    }

    public void clickSubmitHomePageRefund(){
        submitHomePageRefund.click();
    }

    public void clickProductReduction(){
        productReduction.click();
    }

    public void selectingProductReduction(){
        selectingProductReduction.click();
    }

    public void chekingBasketButton(){
        chekingBasketButton.click();
    }



}
