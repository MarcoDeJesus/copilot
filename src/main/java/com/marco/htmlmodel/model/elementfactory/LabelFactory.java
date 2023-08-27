package com.marco.htmlmodel.model.elementfactory;

import com.marco.htmlmodel.model.element.Label;
import com.marco.htmlmodel.model.interfaces.elementfactory.HtmlElementFactory;

public class LabelFactory implements HtmlElementFactory<Label>{

    @Override
    public Label addContentBetweenTags(String content) {
        return new Label(content);
    }

    @Override
    public Label createHtmlElement(String locatorType, String locator) {
        return null;
    }
    
}
