package com.epam.classtraining.designpatterns.abstract_factory.textarea;

public class MacTextArea implements com.epam.classtraining.designpatterns.abstract_factory.textarea.TextArea {
    @Override
    public void paint() {
        System.out.println("You have created Mac Text Area.");
    }
}
