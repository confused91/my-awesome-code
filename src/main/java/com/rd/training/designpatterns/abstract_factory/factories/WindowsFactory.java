package com.rd.training.designpatterns.abstract_factory.factories;


import com.rd.training.designpatterns.abstract_factory.checkboxes.Checkbox;
import com.rd.training.designpatterns.abstract_factory.checkboxes.WindowsCheckbox;
import com.rd.training.designpatterns.abstract_factory.buttons.Button;
import com.rd.training.designpatterns.abstract_factory.buttons.WindowsButton;
import com.rd.training.designpatterns.abstract_factory.textarea.TextArea;
import com.rd.training.designpatterns.abstract_factory.textarea.WindowsTextArea;

/**
 * EN: Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.

 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public TextArea createTextArea() {
        return new WindowsTextArea();
    }
}
