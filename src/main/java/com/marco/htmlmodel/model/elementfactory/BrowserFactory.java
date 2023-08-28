package com.marco.htmlmodel.model.elementfactory;

import com.marco.htmlmodel.model.element.Window;
import com.marco.htmlmodel.model.interfaces.elementfactory.BrowserWindowFactory;

public class BrowserFactory implements BrowserWindowFactory<Window> {
    @Override
    public Window createBrowserWindow(String url) {
        return new Window(url);
    }
    
}
