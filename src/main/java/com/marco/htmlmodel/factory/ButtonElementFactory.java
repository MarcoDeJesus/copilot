package com.marco.htmlmodel.factory;

public class ButtonElementFactory implements ElementFactory<Button>{

    @Override
    public Button createElement(String content) {
        return new Button();
    }
    
}
