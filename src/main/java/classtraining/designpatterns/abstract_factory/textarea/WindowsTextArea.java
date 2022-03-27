package classtraining.designpatterns.abstract_factory.textarea;

import javax.sound.midi.SysexMessage;

public class WindowsTextArea implements TextArea{
    @Override
    public void paint() {
        System.out.println("You have created Windows Text Area");
    }
}
