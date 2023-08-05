package com.marco.automation.common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.marco.automation.configuration.ChromeConfiguration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BaseTest {

    public WebDriver driver;
    
    @BeforeSuite
    public void beforeSuite(){
        log.info("Initializing driver");
        this.driver = BasePage.getDriverInstance(new ChromeConfiguration());
    }

    @AfterSuite
    public void afterSuite(){
        log.info("Closing driver");
        driver.quit();
    }
}
