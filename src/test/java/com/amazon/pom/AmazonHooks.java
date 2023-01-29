package com.amazon.pom;


import io.cucumber.java.Before;

public class AmazonHooks {

    private static HomeAmazonPage homeAmazonPage;
    private static ShoppingCartPage shoppingCartPage;

    private static Authorization authorization;

    @Before(order = 1)
    public void initialization() {
        homeAmazonPage = HomeAmazonPage.getInstance();
        homeAmazonPage.openPage("https://www.amazon.es/");
        homeAmazonPage.clickAcceptCookiesButton();


    }

    @Before(order = 2)
    public void authorization() {
//        authorization = Authorization.getInstance();
//        authorization.pressAuthorizationButton();
//        authorization.fillAuthorizationField("+34633919463");
//        authorization.clickContinueButton();
//        authorization.inputPasswordField("Ivanka2022");
//        authorization.clickSignInSubmitButton();

    }
}
