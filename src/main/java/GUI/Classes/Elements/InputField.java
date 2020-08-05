package GUI.Classes.Elements;

import GUI.Interfaces.GuiElement;

import javax.swing.*;

public class InputField extends JTextField implements GuiElement {
    private static JTextField inputField;
    private static InputField instance;

    private InputField() {
        this.run();
    }

    public static InputField getInstance() {

        if (instance == null) instance = new InputField();

        return instance;
    }

    @Override
    public void run() {
        inputField = new JTextField(30);
        inputField.setVisible(true);
    }
}
