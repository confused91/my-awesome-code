package com.epam.classtraining.designpatterns.abstract_factory.factories;

import com.epam.classtraining.designpatterns.abstract_factory.buttons.Button;
import com.epam.classtraining.designpatterns.abstract_factory.checkboxes.Checkbox;
import com.epam.classtraining.designpatterns.abstract_factory.textarea.TextArea;

/**
 * EN: Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
    TextArea createTextArea();
}
