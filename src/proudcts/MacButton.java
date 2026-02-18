package src.products;
import src.interfaces.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        // TODO: Implementar renderizado estilo Mac (ej. bordes redondeados)
        System.out.println("Renderizando un botón estilo MacOS.");
    }
}
