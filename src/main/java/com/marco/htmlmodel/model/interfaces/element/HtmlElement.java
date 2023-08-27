package com.marco.htmlmodel.model.interfaces.element;

import java.util.List;

public interface HtmlElement {
    String getTag();
    String getContent();
    String getElementType();
    HtmlElement getParentNode();
    List<HtmlElement> getChildNodes();
}
