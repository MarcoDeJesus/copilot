package com.marco.htmlmodel.model.element;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.marco.htmlmodel.model.interfaces.element.HtmlElement;
import com.marco.htmlmodel.model.interfaces.element.TextElement;
import com.marco.htmlmodel.model.interfaces.element.WindowElement;

public class Window implements HtmlElement, WindowElement, TextElement {

    private String content;

    public Window(String content){
        this.content = content;

        System.setProperty("com.driver.chromedriver", "/home/marcodejesus/Documents/Projects/Java/Co-Pilot/selenium-webdriver/webui-testautomation/src/main/resources/webdriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get(content);
    }

    @Override
    public String getTag() {
        return "No tag because it's a Window.";
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String getElementType() {
        return "Windwow type";
    }

    @Override
    public HtmlElement getParentNode() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getParentNode'");
    }

    @Override
    public List<HtmlElement> getChildNodes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChildNodes'");
    }
    
}
