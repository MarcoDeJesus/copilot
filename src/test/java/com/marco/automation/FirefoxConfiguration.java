package com.marco.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxConfiguration implements DriverConfiguration{

    @Override
    public WebDriver getDriver() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/webdriver/geckodriver");
        return new FirefoxDriver();
    }
    
}
