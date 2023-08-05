package com.marco.automation.configuration;

import org.openqa.selenium.WebDriver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WebDriverManager {
    private static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<WebDriver>();
    private static WebDriverConfiguration currentWebDriverConfiguration;

    public static WebDriver getDriver(WebDriverConfiguration webDriverConfiguration) {
        currentWebDriverConfiguration = webDriverConfiguration;

        setWebDriverToCurrentThreadIfNull();

        log.info("Getting driver from current thread: " + webDriverThreadLocal.get());
        return webDriverThreadLocal.get();
    }

    private static void setWebDriverToCurrentThreadIfNull() {
        if (webDriverThreadLocal.get() == null) {

            WebDriver driver = getDriverInstance();

            log.info("Setting up driver to current thread.");
            webDriverThreadLocal.set(driver);
        }
    }

    private static WebDriver getDriverInstance() {
        if (!(currentWebDriverConfiguration instanceof WebDriverConfiguration)) {
            log.error("Invalid WebDriverConfiguration: " + currentWebDriverConfiguration);
            throw new IllegalArgumentException("Invalid WebDriverConfiguration: " + currentWebDriverConfiguration);
        }

        return currentWebDriverConfiguration.getDriver();
    }

    public static void quitDriver() {
        log.info("Closing Chrome driver");
        webDriverThreadLocal.get().quit();
        webDriverThreadLocal.remove();
    }
}
