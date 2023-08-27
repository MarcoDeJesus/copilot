package com.marco.htmlmodel.model.factory;

import com.marco.htmlmodel.model.element.Button;
import com.marco.htmlmodel.model.interfaces.factory.HtmlElementFactory;

public class ButtonFactory implements HtmlElementFactory<Button>{
    
    @Override
    public Button createHtmlElement(String content){
        return new Button(content);
    }
}
