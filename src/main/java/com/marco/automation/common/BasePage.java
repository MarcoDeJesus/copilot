package com.marco.automation.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.marco.automation.configuration.DriverConfiguration;

public class BasePage {

    protected String baseUrl;
    protected WebDriver driver;

    public BasePage(WebDriver driver, String baseUrl){
        this.driver = driver;
        this.baseUrl = baseUrl;
        PageFactory.initElements(driver, this);
        createDriverInstance();
    }
    
    public void createDriverInstance(){
        this.driver.manage().window().maximize();
        this.driver.get(baseUrl);
    }

    protected static WebDriver getDriver(DriverConfiguration driverConfiguration) {

        if (!(driverConfiguration instanceof DriverConfiguration)) {
            throw new IllegalArgumentException("Invalid DriverConfiguration: " + driverConfiguration);
        }

        return driverConfiguration.getDriver();
    }

}
