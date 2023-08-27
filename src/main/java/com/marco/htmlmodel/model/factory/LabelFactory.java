package com.marco.htmlmodel.model.factory;

import com.marco.htmlmodel.model.element.Label;
import com.marco.htmlmodel.model.interfaces.factory.HtmlElementFactory;

public class LabelFactory implements HtmlElementFactory<Label>{

    @Override
    public Label createHtmlElement(String content) {
        return new Label(content);
    }
    
}
