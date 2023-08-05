package com.marco.automation.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WebDriverManager {

    private static final String SRC_MAIN_RESOURCES_WEBDRIVER_CHROMEDRIVER = "src/main/resources/webdriver/chromedriver";
    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    private static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        log.info("Setting up Chrome driver");  

        if (webDriverThreadLocal.get() == null) {

            System.setProperty(WEBDRIVER_CHROME_DRIVER, SRC_MAIN_RESOURCES_WEBDRIVER_CHROMEDRIVER);
            
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("incognito");
            
            log.info("Chrome driver setup completed");
            WebDriver driver = new ChromeDriver(chromeOptions);

            webDriverThreadLocal.set(driver);
        }

        return webDriverThreadLocal.get();
    }

    public static void quitDriver() {
        log.info("Closing Chrome driver");
        webDriverThreadLocal.get().quit();
        webDriverThreadLocal.remove();
    }
    
}
