package src.factories;

import src.interfaces.UIFactory;
import src.interfaces.Button;
import src.interfaces.Checkbox;
import src.products.MacButton;
import src.products.MacCheckbox;

public class MacFactory implements UIFactory {

    @Override
    public Button createButton() {
        // Reto: El usuario debe instanciar el botón de Mac aquí
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        // Reto: El usuario debe instanciar el checkbox de Mac aquí
        return new MacCheckbox();
    }
}
