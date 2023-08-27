package com.marco.htmlmodel.model.element;

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
    
}
