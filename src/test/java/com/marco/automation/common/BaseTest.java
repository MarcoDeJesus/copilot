package com.marco.automation.common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.marco.automation.configuration.ChromeConfiguration;

public class BaseTest {

    public WebDriver driver;
    
    @BeforeSuite
    public void beforeSuite(){
        this.driver = BasePage.getDriverInstance(new ChromeConfiguration());
    }

    @AfterSuite
    public void afterSuite(){
        driver.quit();
    }
}
