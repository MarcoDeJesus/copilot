package com.marco.htmlmodel.factory;

public interface ElementFactory <T> {
    T createElement(String locator);
}
