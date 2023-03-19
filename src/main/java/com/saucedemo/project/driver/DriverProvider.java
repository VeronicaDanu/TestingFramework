package com.saucedemo.project.driver;

import com.saucedemo.project.utils.ConfigReader;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.saucedemo.project.driver.DriverOptionsProvider.getChromeOptions;

public class DriverProvider {

    static ConfigReader configReader = ConfigFactory.create(ConfigReader.class);

    private static WebDriver createChromeDriver() {
        System.setProperty("webdriver.chrome.driver", configReader.getChromeDriver());
        return new ChromeDriver(getChromeOptions());
    }

    public static WebDriver getWebDriver(DriverType driverType) {
        switch (driverType){
            case CHROME:
                return createChromeDriver();
            default:
                return createChromeDriver();
        }
    }
}
