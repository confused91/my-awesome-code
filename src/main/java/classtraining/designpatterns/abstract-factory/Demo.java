package classtraining.designpatterns;

/**
 * EN: Demo class. Everything comes together here.
 *
 * RU: Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {

    /**
     * EN: Application picks the factory type and creates it in run time
     * (usually at initialization stage), depending on the configuration or
     * environment variables.
     *
     * RU: Приложение выбирает тип и создаёт конкретные фабрики динамически
     * исходя из конфигурации или окружения.
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
