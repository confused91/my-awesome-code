package classtraining.designpatterns;

/**
 * EN: All products families have the same varieties (MacOS/Windows).
 *
 * This is a variant of a checkbox.

 */
public class MacOSCheckbox implements classtraining.designpatterns.Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
