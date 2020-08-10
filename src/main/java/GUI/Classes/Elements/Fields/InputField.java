package GUI.Classes.Elements.Fields;

import GUI.Interfaces.GuiElement;

import javax.swing.*;
import java.awt.*;

public class InputField extends JTextField implements GuiElement {

    private static InputField inputField;

    private InputField() {
        this.setColumns(20);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setVisible(true);
    }

    public static InputField getInputField() {

        if (inputField == null) inputField = new InputField();

        return inputField;
    }
}
