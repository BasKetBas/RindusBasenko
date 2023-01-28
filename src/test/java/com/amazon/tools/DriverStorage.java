package com.amazon.tools;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverStorage {
    private WebDriver driver;
    private WebDriverWait webDriverWait;


    private static DriverStorage driverStorage;


    private DriverStorage() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static DriverStorage getInstance() {
        if (driverStorage == null) {
            driverStorage = new DriverStorage();
        }

        return driverStorage;
    }


    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWebDriverWait() {
        return webDriverWait;
    }
}
