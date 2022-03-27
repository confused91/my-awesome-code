package classtraining.designpatterns.abstract_factory;


import classtraining.designpatterns.abstract_factory.app.Application;
import classtraining.designpatterns.abstract_factory.factories.GUIFactory;
import classtraining.designpatterns.abstract_factory.factories.MacOSFactory;
import classtraining.designpatterns.abstract_factory.factories.WindowsFactory;

/**
 * EN: Demo class. Everything comes together here.
 */
public class Demo {

    /**
     * EN: Application picks the factory type and creates it in run time
     * (usually at initialization stage), depending on the configuration or
     * environment variables.
     */
    private static Application configureApplication() {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
