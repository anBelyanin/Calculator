package GUI.Classes.Elements.Content;

import GUI.Classes.Elements.Fields.InputField;
import Interfaces.GuiElement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionButtonsPanel extends JPanel implements GuiElement {

    private static ActionButtonsPanel actionButtonsPanel;

    private static ButtonGroup actionButtonsGroup;

    private static JButton backSpaceButton;
    private static JButton deleteButton;

    private ActionButtonsPanel() {
        initializeButtons();
        this.setLayout(new GridLayout(2, 1));
        this.add(backSpaceButton);
        this.add(deleteButton);
    }

    public static ActionButtonsPanel getActionButtonsPanel() {

        if(actionButtonsPanel == null) actionButtonsPanel = new ActionButtonsPanel();

        return actionButtonsPanel;
    }

    private void initializeButtons() {
        actionButtonsGroup = new ButtonGroup();
        backSpaceButton = new JButton("BS");
        backSpaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(InputField.getInputField().getText().length() > 0) {
                    InputField.getInputField().setText(InputField.getInputField().getText().substring(0, InputField.getInputField().getText().length() - 1));
                }
            }
        });
        actionButtonsGroup.add(backSpaceButton);
        deleteButton = new JButton("C");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                InputField.getInputField().setText("");
            }
        });
        actionButtonsGroup.add(deleteButton);
    }
}
