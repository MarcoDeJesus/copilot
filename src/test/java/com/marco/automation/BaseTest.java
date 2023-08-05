package com.marco.automation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    public WebDriver driver;
    
    @BeforeSuite
    public void beforeSuite(){
        this.driver = BasePage.getDriver(new ChromeConfiguration());
    }

    @AfterSuite
    public void afterSuite(){
        driver.quit();
    }
}
