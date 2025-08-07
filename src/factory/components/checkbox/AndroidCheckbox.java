package factory.components.checkbox;

public class AndroidCheckbox implements Checkbox {
    private String label;
    private String color;
    private String type;
    private boolean checked;

    public AndroidCheckbox(String label, String color, String type) {
        this.label = label;
        this.color = color;
        this.type = type;
        this.checked = false;
    }

    @Override
    public void render() {
        System.out.println("Rendering Android Checkbox with label: " + label + ", color: " + color + ", type: " + type + ", checked: " + checked);
    }

    @Override
    public void onCheck() {
        this.checked = true;
        System.out.println("Android Checkbox checked!");
    }

    @Override
    public void onUncheck() {
        this.checked = false;
        System.out.println("Android Checkbox unchecked!");
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
    public boolean isChecked() {
        return checked;
    }

    @Override
    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
