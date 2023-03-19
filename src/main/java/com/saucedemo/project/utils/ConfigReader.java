package com.saucedemo.project.utils;

import com.saucedemo.project.driver.DriverType;
import org.aeonbits.owner.Config;

@Config.Sources("classpath:config.properties")
public interface ConfigReader extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    @ConverterClass(DriverTypeConvert.class)
    DriverType getBrowser();

    @Key("chromeDriver")
    String getChromeDriver();

    @Key("baseUrl")
    String getBaseUrl();

    @Key("isHeadless")
    boolean isHeadless();
}
