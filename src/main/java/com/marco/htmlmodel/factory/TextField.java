package com.marco.htmlmodel.factory;

public class TextField extends Element implements ITextField{

    public TextField(){

    }
    
    public void enterText(String string) {
    }

    public String getText() {
        return null;
    }

    @Override
    public String toString(){
        return "Text Field";
    }
}
