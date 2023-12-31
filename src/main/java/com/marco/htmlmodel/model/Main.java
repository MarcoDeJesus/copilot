package com.marco.htmlmodel.model;

import com.marco.htmlmodel.model.element.Button;
import com.marco.htmlmodel.model.element.Label;
import com.marco.htmlmodel.model.elementfactory.ButtonFactory;
import com.marco.htmlmodel.model.elementfactory.LabelFactory;
import com.marco.htmlmodel.model.interfaces.element.HtmlElement;
import com.marco.htmlmodel.model.interfaces.elementfactory.HtmlElementFactory;

public class Main {
    public static void main(String[] args) {
        HtmlElementFactory<Label> labelFactory = new LabelFactory();
        HtmlElementFactory<Button> buttonFactory = new ButtonFactory();

        HtmlElement usernameHtml = labelFactory.addContentBetweenTags("username");
        HtmlElement passwordHtml = labelFactory.addContentBetweenTags("password");
        HtmlElement buttonHtml = buttonFactory.addContentBetweenTags("login");

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
