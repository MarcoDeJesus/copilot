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

        if(usernameHtml instanceof Label){
            Label usernameLabel = (Label) usernameHtml;

            System.out.println(usernameLabel.getElementType() + ":");
            System.out.println("<" + usernameHtml.getTag() + ">"
                + usernameLabel.getContent() 
                + "</" + usernameHtml.getTag() + ">");
            System.out.println();
        }

        if(passwordHtml instanceof Label){
            Label passwordLabel = (Label) passwordHtml;

            System.out.println(passwordLabel.getElementType() + ":");
            System.out.println("<" + passwordHtml.getTag() + ">"
                + passwordLabel.getContent() 
                + "</" + passwordHtml.getTag() + ">");
            System.out.println();
        }

        if(buttonHtml instanceof Button){
            Button loginButton = (Button) buttonHtml;

            System.out.println(loginButton.getElementType() + ":");
            System.out.println("<" + buttonHtml.getTag() + ">"
                + loginButton.getContent() 
                + "</" + buttonHtml.getTag() + ">");
            System.out.println();
        }
    }
}
