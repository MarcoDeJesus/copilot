package com.marco.htmlmodel.factory;

public class LabelElementFactory implements ElementFactory<Label>{

    @Override
    public Label createElement(String content) {
        return new Label();
    }
    
}
