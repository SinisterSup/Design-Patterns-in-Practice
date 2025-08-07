package factory.components.dropdown;

import java.util.List;

public interface Dropdown {
    void render();
    void onSelect(String value);
    String getLabel();
    void setLabel(String label);
    String getColor();
    void setColor(String color);
    String getType();
    List<String> getOptions();
    void setOptions(List<String> options);
    String getSelectedValue();
    void setSelectedValue(String value);
}
