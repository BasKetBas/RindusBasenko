package com.amazon.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends BasePage {

    private static ResultPage resultPage;

    @FindBy(xpath = "//div[@data-component-type='s-search-result'][1]")
    private WebElement selectedProduct;

    @FindBy(xpath = "//select[@id='quantity']")
    private WebElement amountOfProduct;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    private WebElement basketAdditionButton;

    @FindBy(xpath = "//span[@id='nav-cart-count']")
    private WebElement shoppingCartButton;

    @FindBy(xpath = "//select[@id='quantity'][1]")
    private WebElement amountSelectedProduct;

    private ResultPage(){
        super();

        PageFactory.initElements(driver, this);
    }
    public static ResultPage getInstance(){
        if(resultPage==null){
            resultPage=new ResultPage();
        }
        return resultPage;
    }
    public static ResultPage getResultPage() {
        return resultPage;
    }


    public void choosingOfProduct(){
        selectedProduct.click();
    }

    public void choosingAmountOfProduct(){
        amountOfProduct.click();

    }

    public void clickAmountSelectedProduct(){
        amountSelectedProduct.click();
    }

    public void clickBasketAdditionButton(){
        basketAdditionButton.click();
    }

    public void clickShoppingCartButton(){
        shoppingCartButton.click();
    }

}
