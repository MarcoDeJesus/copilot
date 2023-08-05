package com.marco.automation.common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.marco.automation.configuration.WebDriverManager;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BaseTest {

    protected WebDriver driver;
    
    @BeforeSuite
    public void beforeSuite(){
        log.info("Initializing driver");
        this.driver = WebDriverManager.getDriver();
    }

    @AfterSuite
    public void afterSuite(){
        log.info("Closing driver");
        WebDriverManager.quitDriver();
    }
}
