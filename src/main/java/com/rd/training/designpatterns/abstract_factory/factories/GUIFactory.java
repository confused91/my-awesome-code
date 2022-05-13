package com.rd.training.designpatterns.abstract_factory.factories;

import com.rd.training.designpatterns.abstract_factory.checkboxes.Checkbox;
import com.rd.training.designpatterns.abstract_factory.buttons.Button;
import com.rd.training.designpatterns.abstract_factory.textarea.TextArea;

/**
 * EN: Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
    TextArea createTextArea();
}
