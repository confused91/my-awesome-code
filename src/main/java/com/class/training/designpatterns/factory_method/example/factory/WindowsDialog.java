package com.epam.classtraining.designpatterns.factory_method.example.factory;

import com.epam.classtraining.designpatterns.factory_method.example.buttons.Button;
import com.epam.classtraining.designpatterns.factory_method.example.buttons.WindowsButton;


/**
 * EN: Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
