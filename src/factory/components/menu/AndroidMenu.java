package factory.components.menu;

import java.util.ArrayList;
import java.util.List;

public class AndroidMenu implements Menu {
    private String label;
    private String color;
    private String type;
    private List<String> menuItems;

    public AndroidMenu(String label, String color, String type) {
        this.label = label;
        this.color = color;
        this.type = type;
        this.menuItems = new ArrayList<>();
    }

    @Override
    public void render() {
        System.out.println("Rendering Android Menu with label: " + label + ", color: " + color + ", type: " + type);
    }

    @Override
    public void onItemSelect(String item) {
        System.out.println("Android Menu item selected: " + item);
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public List<String> getMenuItems() {
        return menuItems;
    }

    @Override
    public void setMenuItems(List<String> items) {
        this.menuItems = items;
    }

    @Override
    public void addMenuItem(String item) {
        this.menuItems.add(item);
    }

    @Override
    public void removeMenuItem(String item) {
        this.menuItems.remove(item);
    }
}
