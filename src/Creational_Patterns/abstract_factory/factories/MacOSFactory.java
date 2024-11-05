package abstract_factory.factories;

import abstract_factory.buttons.Button;
import abstract_factory.buttons.MacOSButton;
import abstract_factory.checkboxes.Checkbox;
import abstract_factory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
