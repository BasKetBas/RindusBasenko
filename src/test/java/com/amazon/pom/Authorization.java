package com.amazon.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Authorization extends BasePage{

    private static Authorization authorization;

    @FindBy(xpath = "//div[@class='nav-line-1-container']")
    private WebElement authorizationButton;

    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement authorizationField;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement inputPasswordField;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    private WebElement signInSubmitButton;

    private Authorization(){
        super();

        PageFactory.initElements(driver, this);
    }

    public static Authorization getInstance(){
        if(authorization==null){
            authorization=new Authorization();
        }
        return authorization;
    }

    public static Authorization getAuthorization() {
        return authorization;
    }

    public void fillAuthorizationField(String numberPhoneOfAccount){
        waiter.until(ExpectedConditions.visibilityOf(authorizationField));
        authorizationField.sendKeys(numberPhoneOfAccount);
    }

    public void pressAuthorizationButton(){
        authorizationButton.click();
    }

    public void clickContinueButton(){
        continueButton.click();
    }

    public void inputPasswordField(String password){
        inputPasswordField.sendKeys(password);
    }

    public void clickSignInSubmitButton(){
        signInSubmitButton.click();
    }


}
