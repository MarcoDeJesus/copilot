package com.marco.htmlmodel.model.elementfactory;

import com.marco.htmlmodel.model.element.Button;
import com.marco.htmlmodel.model.interfaces.elementfactory.HtmlElementFactory;

public class ButtonFactory implements HtmlElementFactory<Button>{
    
    @Override
    public Button createHtmlElement(String content){
        return new Button(content);
    }
}
