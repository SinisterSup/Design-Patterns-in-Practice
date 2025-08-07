package factory.abstractfactory;

import factory.components.button.Button;
import factory.components.button.IOSButton;
import factory.components.checkbox.Checkbox;
import factory.components.checkbox.IOSCheckbox;
import factory.components.dropdown.Dropdown;
import factory.components.dropdown.IOSDropdown;
import factory.components.menu.IOSMenu;
import factory.components.menu.Menu;
import factory.components.textfield.IOSTextfield;
import factory.components.textfield.Textfield;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton(String label, String color, String type) {
        return new IOSButton(label, color, type);
    }

    @Override
    public Textfield createTextField(String label, String color, String type) {
        return new IOSTextfield(label, color, type);
    }

    @Override
    public Checkbox createCheckBox(String label, String color, String type) {
        return new IOSCheckbox(label, color, type);
    }

    @Override
    public Dropdown createDropdown(String label, String color, String type) {
        return new IOSDropdown(label, color, type);
    }

    @Override
    public Menu createMenu(String label, String color, String type) {
        return new IOSMenu(label, color, type);
    }
}
