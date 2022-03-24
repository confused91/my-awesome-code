package classtraining.designpatterns.factory_method.example.factory;

import classtraining.designpatterns.factory_method.example.buttons.Button;
import classtraining.designpatterns.factory_method.example.buttons.WindowsButton;


/**
 * EN: Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
