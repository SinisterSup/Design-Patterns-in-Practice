package factory.components.button;

public class IOSButton implements Button {
    private String label;
    private String color;
    private String type;

    public IOSButton(String label, String color, String type) {
        this.label = label;
        this.color = color;
        this.type = type;
    }

    @Override
    public void render() {
        System.out.println("Rendering iOS Button with label: " + label + ", color: " + color + ", type: " + type);
    }

    @Override
    public void onClick() {
        System.out.println("iOS Button clicked!");
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
}
