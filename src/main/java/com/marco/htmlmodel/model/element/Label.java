package com.marco.htmlmodel.model.element;

import java.util.List;

import com.marco.htmlmodel.model.interfaces.element.HtmlElement;
import com.marco.htmlmodel.model.interfaces.element.TextElement;

public class Label implements HtmlElement, TextElement{

    private String content;

    public Label(String content) {
        this.content = content;
    }

    @Override
    public String getElementType() {
        return "label text type.";
    }

    @Override
    public String getTag() {
        return "h1";
    }

    @Override
    public String getContent() {
        return content;
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
