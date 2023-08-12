package com.marco.automation.pageobjects;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.marco.automation.common.BasePage;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HomePage extends BasePage{

    @FindBy(how = How.ID, using = "react-burger-menu-btn")
    private WebElement menuButton;

    @FindBy(how = How.ID, using = "logout_sidebar_link")
    private WebElement logoutButton;

    public HomePage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
        log.info("Initializing HomePage");
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
     
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(logoutButton));

        Actions action = new Actions(driver);
        action.moveToElement(logoutButton).click().perform();

        log.info("Logout completed");
        return new LoginPage(driver);
    }
}
