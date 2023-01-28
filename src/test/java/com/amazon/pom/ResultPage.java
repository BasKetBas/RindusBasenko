package com.amazon.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ResultPage extends BasePage {

    private static ResultPage resultPage;

    @FindBy(xpath = "//div[@data-component-type='s-search-result']")
    private WebElement selectedProduct;

    @FindBy(xpath = "//select[@id='quantity']")
    private WebElement amountOfProduct;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    private WebElement basketAdditionButton;

    @FindBy(xpath = "//span[@id='nav-cart-count']")
    private WebElement shoppingCartButton;

    @FindBy(xpath = "//select[@id='quantity']")
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
        waiter.until(ExpectedConditions.visibilityOf(selectedProduct));
        selectedProduct.click();
    }

    public void choosingAmountOfProduct(){
        waiter.until(ExpectedConditions.visibilityOf(amountOfProduct));
        amountOfProduct.click();

    }

    public int clickAmountSelectedProduct(){
        int index=1;
        waiter.
                until(ExpectedConditions.elementToBeClickable(amountSelectedProduct));
        Select select=new Select(amountSelectedProduct);
        select.selectByIndex(index);
        return index;

    }

    public void clickBasketAdditionButton(){
        waiter.until(ExpectedConditions.visibilityOf(basketAdditionButton));
        basketAdditionButton.click();
    }

    public void clickShoppingCartButton(){
        waiter.until(ExpectedConditions.visibilityOf(shoppingCartButton));
        shoppingCartButton.click();
    }

}
