package com.amazon.pom;

import com.amazon.tools.DriverStorage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait waiter;

    public BasePage() {

        this.driver = DriverStorage.getInstance().getDriver();
        this.waiter = DriverStorage.getInstance().getWebDriverWait();


    }


    public void openPage(String page) {
        this.driver.get(page);
    }

    public void close() {
        this.driver.quit();
    }

}

