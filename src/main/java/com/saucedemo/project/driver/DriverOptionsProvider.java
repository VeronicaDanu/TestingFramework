package com.saucedemo.project.driver;

import com.saucedemo.project.utils.ConfigReader;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariOptions;

public class DriverOptionsProvider {

    static ConfigReader configReader = ConfigFactory.create(ConfigReader.class);


    public static ChromeOptions getChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--remote-allow-origins=*");
        if (configReader.isHeadless()) {
            chromeOptions.addArguments("--headless");
        }
        return chromeOptions;
    }

    public static SafariOptions getSafariOptions() {
        SafariOptions options = new SafariOptions();
//      ADD OPTIONS FOR FUTURE
        return options;
    }
}
