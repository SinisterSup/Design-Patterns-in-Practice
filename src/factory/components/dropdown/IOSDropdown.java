package factory.components.dropdown;

import java.util.List;

public class IOSDropdown implements Dropdown {
    private String label;
    private String color;
    private String type;
    private List<String> options;
    private String selectedValue;

    public IOSDropdown(String label, String color, String type) {
        this.label = label;
        this.color = color;
        this.type = type;
    }

    @Override
    public void render() {
        System.out.println("Rendering iOS Dropdown with label: " + label + ", color: " + color + ", type: " + type);
    }

    @Override
    public void onSelect(String value) {
        this.selectedValue = value;
        System.out.println("iOS Dropdown selected: " + value);
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
    public List<String> getOptions() {
        return options;
    }

    @Override
    public void setOptions(List<String> options) {
        this.options = options;
    }

    @Override
    public String getSelectedValue() {
        return selectedValue;
    }

    @Override
    public void setSelectedValue(String value) {
        this.selectedValue = value;
    }
}
