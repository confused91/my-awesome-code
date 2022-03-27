package com.epam.classtraining.designpatterns.factory_method.example.factory;

import com.epam.classtraining.designpatterns.factory_method.example.buttons.Button;
import com.epam.classtraining.designpatterns.factory_method.example.buttons.HtmlButton;

/**
 * EN: HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
