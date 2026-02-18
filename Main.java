package src;

import src.factories.MacFactory;
import src.factories.WinFactory;
import src.interfaces.UIFactory;

public class Main {

    /**
     * Este es el punto de entrada. Aquí es donde se decide qué 
     * familia de objetos se va a utilizar en toda la ejecución.
     */
    public static void main(String[] args) {
        Application app = configureApplication();
        
        // El cliente (app) ejecuta la lógica sin saber 
        // qué tipo de botones o checkboxes está usando.
        app.paint();
    }

    /**
     * Método de configuración: Detecta el sistema operativo y 
     * crea la fábrica concreta correspondiente.
     */
    private static Application configureApplication() {
        Application app;
        UIFactory factory;

        // Detectamos el SO del sistema actual
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            // Por defecto, usamos Windows si no es Mac
            factory = new WinFactory();
        }

        // Inyectamos la fábrica en la aplicación
        app = new Application(factory);
        return app;
    }
}
