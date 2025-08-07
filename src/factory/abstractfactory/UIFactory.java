package factory.abstractfactory;
import factory.components.button.Button;
import factory.components.checkbox.Checkbox;
import factory.components.dropdown.Dropdown;
import factory.components.menu.Menu;
import factory.components.textfield.Textfield;

public interface UIFactory {
    Button createButton(String label, String color, String type);
    Textfield createTextField(String label, String color, String type);
    Checkbox createCheckBox(String label, String color, String type);
    Dropdown createDropdown(String label, String color, String type);
    Menu createMenu(String label, String color, String type);
}
