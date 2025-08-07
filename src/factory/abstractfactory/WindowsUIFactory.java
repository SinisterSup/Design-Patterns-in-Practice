package factory.abstractfactory;

import factory.components.button.Button;
import factory.components.button.WindowsButton;
import factory.components.checkbox.Checkbox;
import factory.components.checkbox.WindowsCheckbox;
import factory.components.dropdown.Dropdown;
import factory.components.dropdown.WindowsDropdown;
import factory.components.menu.Menu;
import factory.components.menu.WindowsMenu;
import factory.components.textfield.Textfield;
import factory.components.textfield.WindowsTextfield;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton(String label, String color, String type) {
        return new WindowsButton(label, color, type);
    }

    @Override
    public Textfield createTextField(String label, String color, String type) {
        return new WindowsTextfield(label, color, type);
    }

    @Override
    public Checkbox createCheckBox(String label, String color, String type) {
        return new WindowsCheckbox(label, color, type);
    }

    @Override
    public Dropdown createDropdown(String label, String color, String type) {
        return new WindowsDropdown(label, color, type);
    }

    @Override
    public Menu createMenu(String label, String color, String type) {
        return new WindowsMenu(label, color, type);
    }
}
