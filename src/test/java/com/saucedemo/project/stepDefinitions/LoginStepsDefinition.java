package com.saucedemo.project.stepDefinitions;

import com.saucedemo.project.driver.DriverManager;
import com.saucedemo.project.pages.LoginPage;
import com.saucedemo.project.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.aeonbits.owner.ConfigFactory;

public class LoginStepsDefinition {

    static ConfigReader configReader = ConfigFactory.create(ConfigReader.class);
    LoginPage loginPage = new LoginPage(DriverManager.getInstance().getDriver());

    @Given("Open page")
    public void open_page() {
        DriverManager.getInstance().getDriver().navigate().to(configReader.getBaseUrl());
    }

    @When("Enter credentials")
    public void credentials() {
        loginPage.usernameInput.sendKeys("standard_user");
        loginPage.passwordInput.sendKeys("secret_sauce");
        loginPage.submitButton.click();
    }
}
