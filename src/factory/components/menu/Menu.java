package factory.components.menu;

import java.util.List;

public interface Menu {
    void render();
    void onItemSelect(String item);
    String getLabel();
    void setLabel(String label);
    String getColor();
    void setColor(String color);
    String getType();
    List<String> getMenuItems();
    void setMenuItems(List<String> items);
    void addMenuItem(String item);
    void removeMenuItem(String item);
}
