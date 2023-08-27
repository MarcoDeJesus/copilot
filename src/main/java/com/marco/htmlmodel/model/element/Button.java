package com.marco.htmlmodel.model.element;

import java.util.List;

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
