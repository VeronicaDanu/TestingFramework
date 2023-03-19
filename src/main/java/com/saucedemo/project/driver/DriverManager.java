package com.saucedemo.project.driver;

import com.saucedemo.project.utils.ConfigReader;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;

import static com.saucedemo.project.driver.DriverProvider.getWebDriver;

public class DriverManager {

    static ConfigReader configReader = ConfigFactory.create(ConfigReader.class);

    private final WebDriver driver;
    private static DriverManager driverManagerInstance;

    private DriverManager() {
        this.driver = getWebDriver(configReader.getBrowser());
    }

    public static DriverManager getInstance() {
        if (driverManagerInstance == null) {
            driverManagerInstance = new DriverManager();
        }
        return driverManagerInstance;
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
