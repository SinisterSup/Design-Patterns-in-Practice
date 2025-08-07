package factory.abstractfactory;

import factory.components.button.AndroidButton;
import factory.components.button.Button;
import factory.components.checkbox.AndroidCheckbox;
import factory.components.checkbox.Checkbox;
import factory.components.dropdown.AndroidDropdown;
import factory.components.dropdown.Dropdown;
import factory.components.menu.AndroidMenu;
import factory.components.menu.Menu;
import factory.components.textfield.AndroidTextfield;
import factory.components.textfield.Textfield;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton(String label, String color, String type) {
        return new AndroidButton(label, color, type);
    }

    @Override
    public Textfield createTextField(String label, String color, String type) {
        return new AndroidTextfield(label, color, type);
    }

    @Override
    public Checkbox createCheckBox(String label, String color, String type) {
        return new AndroidCheckbox(label, color, type);
    }

    @Override
    public Dropdown createDropdown(String label, String color, String type) {
        return new AndroidDropdown(label, color, type);
    }

    @Override
    public Menu createMenu(String label, String color, String type) {
        return new AndroidMenu(label, color, type);
    }
}
