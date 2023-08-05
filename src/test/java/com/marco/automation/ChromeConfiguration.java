package com.marco.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeConfiguration implements DriverConfiguration{

    @Override
    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/webdriver/chromedriver");
        return new ChromeDriver();
    }
    
}
