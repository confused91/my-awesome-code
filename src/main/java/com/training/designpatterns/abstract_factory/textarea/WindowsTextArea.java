package com.training.designpatterns.abstract_factory.textarea;

public class WindowsTextArea implements TextArea {
    @Override
    public void paint() {
        System.out.println("You have created Windows Text Area");
    }
}
