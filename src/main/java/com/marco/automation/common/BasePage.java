package com.marco.automation.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import lombok.extern.slf4j.Slf4j;

//TODO: Implement Docker
//TODO: Implement SauceLabs.
//TODO: Implement BrowserStack.
//TODO: Implement ExtentReports
//TODO: Implement TestNG Listeners
//TODO: Implement TestNG Retry
//TODO: Implement TestNG DataProvider
//TODO: Implement TestNG Parallel
//TODO: Implement TestNG Groups
//TODO: Implement TestNG Suites
//TODO: Implement TestNG Parameters
//TODO: Implement TestNG Factory
//TODO: Properties file
//TODO: Update TestNG version with a Java Runtime that builds with 55 instead of 52
//TODO: Implement Cucumber
//TODO: Do Unit Tests
//TODO: Segregate the clases to model html elements using Reflection
//TODO: Implement Grafana
//TODO: Implement InfluxDB
//TODO: Implement Jenkins
//TODO: Implement Selenium Grid
//TODO: Implement Selenium Grid with Docker
//TODO: Implement Selenium Grid with Docker and Jenkins
//TODO: Implement Selenium Grid with Docker and Jenkins and Grafana
//TODO: Implement Selenium Grid with Docker and Jenkins and Grafana and InfluxDB
//TODO: Implement Selenium Grid with Docker and Jenkins and Grafana and InfluxDB and Cucumber
//TODO: Implement Selenium Grid with Docker and Jenkins and Grafana and InfluxDB and Cucumber and TestNG
//TODO: Implement Dependency Injection for modularization
//TODO: Implement Test Coverage for unit testing.
//TODO: Implement Test Coverage for End to End.
//TODO: Extend the BasePage to have a BasePage for Mobile.
//TODO: Extend the framework to do mobile, web and api test automation. 
//TODO: Implement a framework to do performance testing.
//TODO: Update to Appium instead of Selenium. 
//TODO: Train a model to do visual testing.
//TODO: Implement a framework to do visual testing.
//TODO: Train a model to do voice testing.
//TODO: Train a model to autofix the code.
//TODO: Train model to autofix locators. 
//TODO: Mix project with Turing bots.
//TODO: Implement a framework to do security testing.
//TODO: Implement a framework to do accessibility testing.
//TODO: Implement a framework to do data driven testing.
//TODO: Implement a framework to do data driven testing with a database.
//TODO: Move to Spring Boot project.
//TODO: Make use of RabbitMQ for test automation.
//TODO: Make use of Kafka for test automation.


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
