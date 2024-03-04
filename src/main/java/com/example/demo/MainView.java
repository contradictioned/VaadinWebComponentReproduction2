package com.example.demo;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.History;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        // Use TextField for standard text input
        TextField textField = new TextField("Your name");

        UI.getCurrent().getPage().getHistory().setHistoryStateChangeHandler(new History.HistoryStateChangeHandler() {
            @Override
            public void onHistoryStateChange(History.HistoryStateChangeEvent event) {
                System.out.println("HISTORY HAS CHANGED");
            }
        });

        // Button click listeners can be defined as lambda expressions
        GreetService greetService = new GreetService();
        Button button = new Button("Say hello", e ->  {
            add(new Paragraph(greetService.greet(textField.getValue())));

            UI.getCurrent().getPage().getHistory().pushState(null, "xyz");
        });

        // Theme variants give you predefined extra styles for components.
        // Example: Primary button is more prominent look.
        button.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        // You can specify keyboard shortcuts for buttons.
        // Example: Pressing enter in this view clicks the Button.
        button.addClickShortcut(Key.ENTER);

        // Use custom CSS classes to apply styling. This is defined in shared-styles.css.
        addClassName("centered-content");

        add(textField, button);
    }
}
