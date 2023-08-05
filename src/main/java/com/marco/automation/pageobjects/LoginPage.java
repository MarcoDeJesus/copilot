package com.marco.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.marco.automation.common.BasePage;

import lombok.extern.slf4j.Slf4j;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

    public void login(String username, String password){
        log.info("Logging in with username: " + username + " and password: " + password);

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

        log.info("Login completed");
    }

    public String getPageTitle(){
        log.info("Getting page title");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs("Swag Labs"));

        log.info("Page title: " + driver.getTitle());
        return driver.getTitle();
    }
}
