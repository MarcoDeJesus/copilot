package com.marco.htmlmodel.model.element;

import com.marco.htmlmodel.model.interfaces.element.HtmlElement;
import com.marco.htmlmodel.model.interfaces.element.InputElement;
import com.marco.htmlmodel.model.interfaces.element.TextElement;

public class Button implements HtmlElement, TextElement, InputElement{

    private String content;

    public Button(String content){
        this.content = content;
    }

    @Override
    public String getElementType() {
        return "input type.";
    }

    @Override
    public String getTag() {
        return "input";
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void inputText(){
        System.out.println("sending text.");
    }

    @Override
    public void click() {
        System.out.println("Clicking...");
    }
    
}
