package com.marco.automation.common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.marco.automation.configuration.WebDriverManager;
import com.marco.automation.configuration.ChromeDriverconfiguration;

public class BaseTest {

    protected WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        this.driver = WebDriverManager.getDriver(new ChromeDriverconfiguration());
    }

    @AfterSuite
    public void afterSuite() {
        WebDriverManager.quitDriver();
    }
}
