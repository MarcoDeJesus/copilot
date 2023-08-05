package com.marco.automation.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FirefoxConfiguration implements DriverConfiguration{

    private static final String SRC_MAIN_RESOURCES_WEBDRIVER_GECKODRIVER = "src/main/resources/webdriver/geckodriver";
    private static final String WEBDRIVER_GECKO_DRIVER = "webdriver.gecko.driver";

    @Override
    public WebDriver getDriver() {
        log.info("Setting up Firefox driver");
        System.setProperty(WEBDRIVER_GECKO_DRIVER, SRC_MAIN_RESOURCES_WEBDRIVER_GECKODRIVER);

        ProfilesIni profile = new ProfilesIni();
        
        FirefoxProfile firefoxProfile = profile.getProfile("default");
        firefoxProfile.setPreference("browser.active_color", "#EE0000");

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setHeadless(false);
        firefoxOptions.setProfile(firefoxProfile);

        log.info("Firefox driver setup completed");
        return new FirefoxDriver(firefoxOptions);
    }
    
}
