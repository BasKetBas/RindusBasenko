package com.amazon.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomeAmazonPage extends BasePage{

    private static HomeAmazonPage homeAmazonPage;


    @FindBy(xpath = "//input[@id='sp-cc-accept']")
    private WebElement acceptCookiesButton;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement searchField;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElement searchButton;

    private HomeAmazonPage(){
        super();

        PageFactory.initElements(driver, this);
    }
    public static HomeAmazonPage getInstance(){
        if(homeAmazonPage==null){
            homeAmazonPage=new HomeAmazonPage();
        }
        return homeAmazonPage;
    }

    public static HomeAmazonPage getHomeAmazonPage() {
        return homeAmazonPage;
    }

    public void clickAcceptCookiesButton(){
        waiter.until(ExpectedConditions.visibilityOf(acceptCookiesButton));
        acceptCookiesButton.click();
    }

    public  void searchNameOfProduct(String nameOfProduct){
        waiter.until(ExpectedConditions.visibilityOf(searchField));
        searchField.sendKeys(nameOfProduct);
    }

    public void clickSearchButton(){
        waiter.until(ExpectedConditions.visibilityOf(searchButton));
        searchButton.click();
    }


}
