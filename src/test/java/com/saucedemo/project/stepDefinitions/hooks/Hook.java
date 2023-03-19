package com.saucedemo.project.stepDefinitions.hooks;

import com.saucedemo.project.driver.DriverManager;
import io.cucumber.java.After;

public class Hook {

    @After
    public void closeDriver() {
        DriverManager.getInstance().quitDriver();
    }
}
