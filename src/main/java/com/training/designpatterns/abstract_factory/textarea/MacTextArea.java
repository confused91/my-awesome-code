package com.training.designpatterns.abstract_factory.textarea;

public class MacTextArea implements TextArea {
    @Override
    public void paint() {
        System.out.println("You have created Mac Text Area.");
    }
}
