package com.marco.htmlmodel.model.elementfactory;

import com.marco.htmlmodel.model.element.Window;
import com.marco.htmlmodel.model.interfaces.elementfactory.HtmlElementFactory;

public class WindowFactory implements HtmlElementFactory<Window> {

    @Override
    public Window addContentBetweenTags(String content) {
        return new Window(content);
    }

    @Override
    public Window createHtmlElement(String locatorType, String locator) {
        return null;
    }
    
}
