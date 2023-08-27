package com.marco.htmlmodel.model;

import com.marco.htmlmodel.model.element.Button;
import com.marco.htmlmodel.model.element.Label;
import com.marco.htmlmodel.model.factory.ButtonFactory;
import com.marco.htmlmodel.model.factory.LabelFactory;
import com.marco.htmlmodel.model.interfaces.element.HtmlElement;
import com.marco.htmlmodel.model.interfaces.factory.HtmlElementFactory;

public class Main {
    public static void main(String[] args) {
        HtmlElementFactory<Label> labelFactory = new LabelFactory();
        HtmlElementFactory<Button> buttonFactory = new ButtonFactory();

        HtmlElement usernameHtml = labelFactory.createHtmlElement("username");
        HtmlElement passwordHtml = labelFactory.createHtmlElement("password");
        HtmlElement buttonHtml = buttonFactory.createHtmlElement("login");

        displayHtmlElement(usernameHtml);
        displayHtmlElement(passwordHtml);
        displayHtmlElement(buttonHtml);
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
