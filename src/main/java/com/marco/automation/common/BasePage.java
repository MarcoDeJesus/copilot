package com.marco.automation.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BasePage {

    private String baseUrl;
    protected WebDriver driver;

    public BasePage(WebDriver driver, String baseUrl) {
        this.driver = driver;
        this.baseUrl = baseUrl;

        driverSetup();
    }

    private void driverSetup() {
        log.info("Setting up driver");

        //TODO: Research on have implicit wait.
        PageFactory.initElements(driver, this);
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    
        this.driver.get(baseUrl);

        log.info("Driver setup completed");
    }
}
