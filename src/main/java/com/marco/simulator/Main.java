package com.marco.simulator;

import com.marco.htmlmodel.model.element.Button;
import com.marco.htmlmodel.model.element.Label;
import com.marco.htmlmodel.model.element.Window;
import com.marco.htmlmodel.model.elementfactory.ButtonFactory;
import com.marco.htmlmodel.model.elementfactory.LabelFactory;
import com.marco.htmlmodel.model.interfaces.element.HtmlElement;
import com.marco.htmlmodel.model.interfaces.elementfactory.HtmlElementFactory;
import com.marco.htmlmodel.model.interfaces.elementfactory.BrowserWindowFactory;
import com.marco.htmlmodel.model.elementfactory.BrowserFactory;

public class Main {
    public static void main(String[] args) {

        BrowserWindowFactory<Window> windowFactory = new BrowserFactory();
        HtmlElementFactory<Label> labelFactory = new LabelFactory();
        HtmlElementFactory<Button> buttonFactory = new ButtonFactory();

        Window window = windowFactory.createBrowserWindow("https://www.saucedemo.com/");

        //displayHtmlElement(window);

        HtmlElement usernameHtml = labelFactory.createHtmlElement("cssSelector", "#user-name");
        HtmlElement passwordHtml = labelFactory.createHtmlElement("xpath", "//*[@id=\"password\"]");
        HtmlElement buttonHtml = buttonFactory.createHtmlElement("xpaht", "//*[@id=\"login-button\"]");
    }

    public static void displayHtmlElement(HtmlElement htmlElement) {
        System.out.println(htmlElement.getElementType() + ":");
        System.out.println("<" + htmlElement.getTag() + ">" + htmlElement.getContent() + "</" + htmlElement.getTag() + ">");
        if (htmlElement instanceof Button) {
            Button button = (Button) htmlElement;
            button.click();
        }
        System.out.println();
    }
}
