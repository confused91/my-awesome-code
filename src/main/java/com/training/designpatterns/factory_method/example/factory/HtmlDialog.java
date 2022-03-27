package com.training.designpatterns.factory_method.example.factory;

import com.training.designpatterns.factory_method.example.buttons.Button;
import com.training.designpatterns.factory_method.example.buttons.HtmlButton;

/**
 * EN: HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
