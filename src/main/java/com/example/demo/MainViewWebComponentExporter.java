package com.example.demo;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.WebComponentExporter;
import com.vaadin.flow.component.page.History;
import com.vaadin.flow.component.webcomponent.WebComponent;

public class MainViewWebComponentExporter extends WebComponentExporter<MainView> {
    public MainViewWebComponentExporter() {
        super("main-view");
    }

    @Override
    protected void configureInstance(WebComponent<MainView> webComponent, MainView mainView) {

    }
}
