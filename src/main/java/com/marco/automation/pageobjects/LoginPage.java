package com.marco.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.marco.automation.common.BasePage;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginPage extends BasePage{

    @FindBy(how = How.ID, using = "user-name")
    private WebElement usernameField;

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordField;

    @FindBy(how = How.ID, using = "login-button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver){
        super(driver, "https://www.saucedemo.com/");
        log.info("Initializing LoginPage");
    }

    public HomePage login(String username, String password){
        log.info("Logging in with username: " + username + " and password: " + password);

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

        log.info("Login completed");
        return new HomePage(driver, "https://www.saucedemo.com/inventory.html");
    }
}
