package com.marco.htmlmodel.factory;

public class Element <T> {
    private T localtor;

    public Element(){
        
    }

    public Element(T locator){
        this.localtor = locator;
    }

    public T getLocaltor(){
        return this.localtor;
    }
}
