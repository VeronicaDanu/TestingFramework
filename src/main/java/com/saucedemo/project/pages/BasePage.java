package com.saucedemo.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;
//    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
//        wait = new WebDriverWait(driver, ConfigReader.getTimeout());
        PageFactory.initElements(driver, this);
    }
}
