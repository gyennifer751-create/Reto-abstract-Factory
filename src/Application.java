package src;

import src.interfaces.Button;
import src.interfaces.Checkbox;
import src.interfaces.UIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    // La App no sabe si la fábrica es de Win o Mac. 
    // Solo sabe que es una "UIFactory".
    public Application(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.render();
    }
}
