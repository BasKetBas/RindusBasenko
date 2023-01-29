package com.amazon.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotificationPage extends BasePage {
    private static NotificationPage notificationPage;

    @FindBy(xpath = "//span[@id='nav-cart-count']")
    private WebElement basketButton;

    private NotificationPage() {
        super();

        PageFactory.initElements(driver, this);
    }

    public static NotificationPage getInstance() {
        if (notificationPage == null) {
            notificationPage = new NotificationPage();
        }
        return notificationPage;
    }

    public static NotificationPage getNotificationPage() {
        return notificationPage;
    }

    public void pressBasketButton() {
        basketButton.click();
    }

}
