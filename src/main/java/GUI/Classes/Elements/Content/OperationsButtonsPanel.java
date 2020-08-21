package GUI.Classes.Elements.Content;

import GUI.Classes.Elements.Fields.InputField;
import GUI.Interfaces.GuiElement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationsButtonsPanel extends JPanel implements GuiElement {
    private static OperationsButtonsPanel operationsButtonsPanel;

    private static ButtonGroup operationsButtonsGroup;

    private static JButton plusButton;
    private static JButton minusButton;
    private static JButton multiplicationButton;
    private static JButton divisionButton;
    private static JButton equalsButton;

    private long firstVariable;
    private long secondVariable;

    private OperationsButtonsPanel() {
        this.setLayout(new GridLayout(1, 4));
        this.add(plusButton);
        this.add(minusButton);
        this.add(multiplicationButton);
        this.add(divisionButton);
        this.add(equalsButton);
    }

    private void initializeButtons() {
        operationsButtonsGroup = new ButtonGroup();
        plusButton = new JButton("+");
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstVariable = Long.parseLong(InputField.getInputField().getText());
            }
        });
    }

    public static OperationsButtonsPanel getOperationsButtonsPanel() {

        if(operationsButtonsPanel == null) operationsButtonsPanel = new OperationsButtonsPanel();

        return operationsButtonsPanel;
    }

}
