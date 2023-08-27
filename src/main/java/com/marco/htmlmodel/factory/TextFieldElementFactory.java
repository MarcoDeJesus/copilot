package com.marco.htmlmodel.factory;

public class TextFieldElementFactory implements ElementFactory<TextField>{

    @Override
    public TextField createElement(String locator) {
        return new TextField();
    }
    
}
