package com.saucedemo.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "user-name")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy (id = "login-button")
    public WebElement submitButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
