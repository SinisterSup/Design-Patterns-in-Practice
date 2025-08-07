package factory.components.textfield;

public class AndroidTextfield implements Textfield {
    private String label;
    private String color;
    private String type;
    private String text;
    private String placeholder;
    private boolean readOnly;

    public AndroidTextfield(String label, String color, String type) {
        this.label = label;
        this.color = color;
        this.type = type;
        this.text = "";
        this.placeholder = "";
        this.readOnly = false;
    }

    @Override
    public void render() {
        System.out.println("Rendering Android Textfield with label: " + label + ", color: " + color + ", type: " + type);
    }

    @Override
    public void onTextChange(String text) {
        this.text = text;
        System.out.println("Android Textfield text changed: " + text);
    }

    @Override
    public void onFocus() {
        System.out.println("Android Textfield focused!");
    }

    @Override
    public void onBlur() {
        System.out.println("Android Textfield blurred!");
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
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getPlaceholder() {
        return placeholder;
    }

    @Override
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    @Override
    public boolean isReadOnly() {
        return readOnly;
    }

    @Override
    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }
}
