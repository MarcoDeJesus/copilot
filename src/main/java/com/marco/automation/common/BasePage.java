package com.marco.automation.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.util.function.Function;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BasePage {

    private String baseUrl;
    protected WebDriver driver;

    public BasePage(WebDriver driver, String baseUrl) {
        this.driver = driver;
        this.baseUrl = baseUrl;

        driverSetup();
    }

    private void driverSetup() {
        log.info("Setting up driver");

        PageFactory.initElements(driver, this);
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    
        this.driver.get(baseUrl);

        log.info("Driver setup completed");
    }
}
