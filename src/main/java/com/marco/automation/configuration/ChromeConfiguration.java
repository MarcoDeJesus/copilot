package com.marco.automation.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChromeConfiguration implements DriverConfiguration{

    private static final String SRC_MAIN_RESOURCES_WEBDRIVER_CHROMEDRIVER = "src/main/resources/webdriver/chromedriver";
    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";

    @Override
    public WebDriver getDriver() {
        log.info("Setting up Chrome driver");  
        System.setProperty(WEBDRIVER_CHROME_DRIVER, SRC_MAIN_RESOURCES_WEBDRIVER_CHROMEDRIVER);
        
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");
        
        log.info("Chrome driver setup completed");
        return new ChromeDriver(chromeOptions);
    }
    
}
