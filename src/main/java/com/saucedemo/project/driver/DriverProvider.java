package com.saucedemo.project.driver;

import com.saucedemo.project.utils.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import static com.saucedemo.project.driver.DriverOptionsProvider.getChromeOptions;
import static com.saucedemo.project.driver.DriverOptionsProvider.getSafariOptions;

public class DriverProvider {

    static ConfigReader configReader = ConfigFactory.create(ConfigReader.class);

    private static WebDriver createChromeDriver() {
//        System.setProperty("webdriver.chrome.driver", configReader.getChromeDriver());
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(getChromeOptions());
    }

    private static WebDriver createSafariDriver() {
        WebDriverManager.safaridriver().setup();
        return new SafariDriver(getSafariOptions());
    }

    public static WebDriver getWebDriver(DriverType driverType) {
        switch (driverType){
            case CHROME:
                return createChromeDriver();
            case SAFARI:
                return createSafariDriver();
            default:
                return createChromeDriver();
        }
    }
}
