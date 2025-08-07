package factory.components.checkbox;

public interface Checkbox {
    void render();
    void onCheck();
    void onUncheck();
    String getLabel();
    void setLabel(String label);
    String getColor();
    void setColor(String color);
    String getType();
    boolean isChecked();
    void setChecked(boolean checked);
}
