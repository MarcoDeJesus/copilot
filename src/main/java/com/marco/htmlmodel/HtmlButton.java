package com.marco.htmlmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HtmlButton extends HtmlElement{
        
    WebDriver driver;
    WebElement element;
    String locator;

    public HtmlButton(By by, String locator){
        element = this.driver.findElement(By.id(locator));
    }

    public String getText(){
        return element.getText();
    }

    public HtmlElement getParentNode(){
        return null;
    }

    public List<HtmlElement> getChildNodes(){
        return null;
    }
}
