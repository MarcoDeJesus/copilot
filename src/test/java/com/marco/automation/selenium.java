package com.marco.automation;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium {
    
    @Test
    public void test() {
                // Set the path to the geckodriver executable
        System.setProperty("webdriver.gecko.driver", "src/main/resources/webdriver/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");  

        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginButton.click();

        // Wait for the page to load and validate the title
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs("Swag Las")); 

        // Close the browser
        driver.quit();
    }
    
}
