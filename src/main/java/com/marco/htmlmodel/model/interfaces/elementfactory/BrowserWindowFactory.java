package com.marco.htmlmodel.model.interfaces.elementfactory;

import com.marco.htmlmodel.model.interfaces.element.BrowserWindow;

public interface BrowserWindowFactory<T extends BrowserWindow> {
    T createBrowserWindow(String url);
}
