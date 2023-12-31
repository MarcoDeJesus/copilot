package com.marco.htmlmodel.model.interfaces.elementfactory;

import com.marco.htmlmodel.model.interfaces.element.HtmlElement;

public interface HtmlElementFactory<T extends HtmlElement> {
    T addContentBetweenTags(String content);
    T createHtmlElement(String locatorType, String locator);
}
