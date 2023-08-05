package com.marco.automation.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.marco.automation.configuration.DriverConfiguration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BasePage {

    private String baseUrl;
    protected WebDriver driver;

    public BasePage(WebDriver driver, String baseUrl){
        this.driver = driver;
        this.baseUrl = baseUrl;

        driverSetup();
    }              

    private void driverSetup(){
        log.info("Setting up driver");

        PageFactory.initElements(driver, this);
        this.driver.manage().window().maximize();
        this.driver.get(baseUrl);

        log.info("Driver setup completed");
    }

    protected static WebDriver getDriverInstance(DriverConfiguration driverConfiguration) {

        if (!(driverConfiguration instanceof DriverConfiguration)) {
            log.error("Invalid DriverConfiguration: " + driverConfiguration);
            throw new IllegalArgumentException("Invalid DriverConfiguration: " + driverConfiguration);
        }

        return driverConfiguration.getDriver();
    }

}
