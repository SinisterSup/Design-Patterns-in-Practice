package factory;

import factory.abstractfactory.UIFactory;
import factory.components.button.Button;
import factory.components.checkbox.Checkbox;
import factory.components.menu.Menu;
import factory.components.textfield.Textfield;

public class Client {
    public static void main(String[] args) {
        // Example Demonstration of Factory Design Pattern
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.CreateUIFactory(Platform.IOS);

        // Create UI components using the factory
        uiFactory.createButton("Submit", "blue", "primary").render();
        uiFactory.createTextField("Enter Name", "gray", "default").render();
        Textfield textField = uiFactory.createTextField("Search", "white", "default");
        textField.setPlaceholder("Type here...");
        textField.onTextChange("Hello World");
        textField.render();
        uiFactory.createCheckBox("Accept Terms", "green", "default").render();
        uiFactory.createDropdown("Select Option", "white", "default").render();
        uiFactory.createMenu("Main Menu", "black", "default").render();
        Menu menu = uiFactory.createMenu("Settings", "white", "default");
        menu.onItemSelect("Profile");
        menu.removeMenuItem("Notifications");

//        uiFactory = flutter.CreateUIFactory(Platform.WINDOWS);
//        uiFactory.createButton("Submit", "blue", "primary").render();
//        uiFactory.createTextField("Enter Name", "gray", "default").render();
//        uiFactory.createCheckBox("Accept Terms", "green", "default").render();
//        uiFactory.createDropdown("Select Option", "white", "default").render();
//        uiFactory.createMenu("Main Menu", "black", "default").render();

        // You can switch to another platform by changing the factory
        uiFactory = flutter.CreateUIFactory(Platform.ANDROID);
        uiFactory.createButton("Submit", "blue", "primary").render();
        uiFactory.createTextField("Enter Name", "gray", "default").render();
        uiFactory.createCheckBox("Accept Terms", "green", "default").render();
        uiFactory.createDropdown("Select Option", "white", "default").render();
        uiFactory.createMenu("Main Menu", "black", "default").render();

        Button button = uiFactory.createButton("Click Me", "red", "secondary");
        button.getColor();
        button.getLabel();

        Checkbox checkbox = uiFactory.createCheckBox("Agree", "blue", "default");
        checkbox.getColor();
        checkbox.getLabel();
        checkbox.onCheck();
        checkbox.onUncheck();
        System.out.println(checkbox.isChecked());


        // You can continue to create more components as needed
        // ...
        // Note: The actual implementations of the components (like AndroidButton, IOSButton, etc.)
        // should be defined in their respective packages, and they should implement the
        // methods defined in the Button, Checkbox, etc. interfaces.
        // This is just a demonstration of how to use the factory pattern to create UI components.
        // The factory pattern allows for easy extension and modification of the UI components
        // without changing the client code, adhering to the Open/Closed & Dependency Inversion Principles.
        // This makes the code more maintainable and scalable, as new UI components can be added
        // without affecting the existing codebase.
        // The factory pattern also promotes code reusability, as the same factory can be used
        // to create different types of UI components based on the platform, reducing code duplication.
        // Overall, the factory pattern is a powerful design pattern that helps in creating
        // flexible and maintainable code, especially in scenarios where multiple implementations
        // of a component are needed based on different conditions, such as platform-specific UI components.

    }
}
