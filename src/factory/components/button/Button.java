package factory.components.button;

public interface Button {
    void render();
    void onClick();
    String getLabel();
    void setLabel(String label);
    String getColor();
    void setColor(String color);
    String getType();
}
