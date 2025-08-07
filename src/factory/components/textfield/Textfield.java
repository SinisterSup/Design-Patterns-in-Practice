package factory.components.textfield;

public interface Textfield {
    void render();
    void onTextChange(String text);
    void onFocus();
    void onBlur();
    String getLabel();
    void setLabel(String label);
    String getColor();
    void setColor(String color);
    String getType();
    String getText();
    void setText(String text);
    String getPlaceholder();
    void setPlaceholder(String placeholder);
    boolean isReadOnly();
    void setReadOnly(boolean readOnly);
}
