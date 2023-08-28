package com.marco.htmlmodel.model.element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.marco.htmlmodel.model.interfaces.element.BrowserWindow;

public class Window implements BrowserWindow {

    private String url;

    public Window(String url){
        this.url = url;

        System.setProperty("com.driver.chromedriver", "/home/marcodejesus/Documents/Projects/Java/Co-Pilot/selenium-webdriver/webui-testautomation/src/main/resources/webdriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get(url);
    }

    @Override
    public void setURL(String url) {
        this.url = url;
    }

    @Override
    public String getURL() {
        return url;
    }
    
}
