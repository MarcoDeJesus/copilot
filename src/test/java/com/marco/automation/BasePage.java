package com.marco.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected String baseUrl;
    protected WebDriver driver;

    public BasePage(WebDriver driver, String baseUrl){
        this.driver = driver;
        this.baseUrl = baseUrl;
        this.driver.get(baseUrl);
        PageFactory.initElements(driver, this);
    }
    
    public WebDriver createDriverInstance(){
        driver = getDriver(new ChromeConfiguration());
        driver.manage().window().maximize();

        return driver;
    }

    public void close(){
        driver.close();
        driver.quit();
    }

    protected static WebDriver getDriver(DriverConfiguration driverConfiguration) {

        if (!(driverConfiguration instanceof DriverConfiguration)) {
            throw new IllegalArgumentException("Invalid DriverConfiguration: " + driverConfiguration);
        }

        return driverConfiguration.getDriver();
    }

}
