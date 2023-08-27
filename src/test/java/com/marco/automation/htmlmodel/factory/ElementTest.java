package com.marco.automation.htmlmodel.factory;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.marco.htmlmodel.factory.Element;
import com.marco.htmlmodel.factory.ElementFactory;
import com.marco.htmlmodel.factory.Label;
import com.marco.htmlmodel.factory.LabelElementFactory;

public class ElementTest {

    @Test
    public void testHTMLElementFactory(){
        ElementFactory<Label> htmlElementFactory = new LabelElementFactory();
        Element<Label> htmlElement =  new Element<>(htmlElementFactory.createElement("Test HTML Content"));

        Assert.assertEquals(htmlElement.getLocaltor().toString(), "Html element");
    }
    
}
