package com.marco.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.marco.automation.common.BasePage;

import lombok.extern.slf4j.Slf4j;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;
import java.util.function.Function;

@Slf4j
public class LoginPage extends BasePage{

    @FindBy(how = How.ID, using = "user-name")
    private WebElement usernameField;

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordField;

    @FindBy(how = How.ID, using = "login-button")
    private WebElement loginButton;

    @FindBy(how = How.ID, using = "react-burger-menu-btn")
    private WebElement menuButton;

    @FindBy(how = How.ID, using = "logout_sidebar_link")
    private WebElement logoutButton;

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

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(30))
        .pollingEvery(Duration.ofSeconds(5))
        .ignoring(NoSuchElementException.class);

        WebElement pageTitle = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.className("app_logo"));
            }
        });

        log.info("Page title: " + pageTitle.getText());
        return pageTitle.getText();
    }

    public LoginPage logout(){
        log.info("Logging out");
        menuButton.click();
     
        Actions action = new Actions(driver);
        action.moveToElement(logoutButton).click().perform();

        log.info("Logout completed");
        return new LoginPage(driver);
    }
}
