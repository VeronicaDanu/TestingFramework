package com.saucedemo.project.driver;

import org.openqa.selenium.chrome.ChromeOptions;

public class DriverOptionsProvider {

    public static ChromeOptions getChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--remote-allow-origins=*");
//      chromeOptions.addArguments("--headless");
        return chromeOptions;
    }
}
