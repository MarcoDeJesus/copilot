package com.marco.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {

    WebDriver driver;

    public String getPageTitle(){

        driver = getDriver(new ChromeConfiguration());
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginButton.click();

        // Wait for the page to load and validate the title
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs("Swag Labs"));

        return driver.getTitle();
    }

    public void close(){
        driver.close();
        driver.quit();
    }
    
    private WebDriver getDriver(DriverConfiguration driverConfiguration) {

        if (!(driverConfiguration instanceof DriverConfiguration)) {
            throw new IllegalArgumentException("Invalid DriverConfiguration: " + driverConfiguration);
        }

        return driverConfiguration.getDriver();
    }
}
