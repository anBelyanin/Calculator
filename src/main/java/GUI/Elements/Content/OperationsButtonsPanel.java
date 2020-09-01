package GUI.Classes.Elements.Content;

import GUI.Classes.Elements.Fields.InputField;
import Interfaces.GuiElement;

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

    private double result = 0;

    private OperationsButtonsPanel() {
        this.setLayout(new GridLayout(1, 4));
        initializeButtons();
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
                try {
                    result += Double.parseDouble(InputField.getInputField().getText());
                    InputField.getInputField().setText(result + "");
                }
                catch (NumberFormatException e){
                    InputField.getInputField().setText("Illegal number!");
                }
            }
        });
        operationsButtonsGroup.add(plusButton);
        minusButton = new JButton("-");
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    result -= Double.parseDouble(InputField.getInputField().getText());
                    InputField.getInputField().setText(result + "");
                }
                catch (NumberFormatException e){
                    InputField.getInputField().setText("Illegal number!");
                }
            }
        });
        operationsButtonsGroup.add(minusButton);
        multiplicationButton = new JButton("*");
        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    result *= Double.parseDouble(InputField.getInputField().getText());
                    InputField.getInputField().setText(result + "");
                }
                catch (NumberFormatException e){
                    InputField.getInputField().setText("Illegal number!");
                }
            }
        });
        operationsButtonsGroup.add(multiplicationButton);
        divisionButton = new JButton("/");
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if(InputField.getInputField().getText().equals("") || InputField.getInputField().getText().equals("0")) throw new IllegalArgumentException();
                    result /= Double.parseDouble(InputField.getInputField().getText());
                    InputField.getInputField().setText(result + "");
                }
                catch (NumberFormatException e){
                    InputField.getInputField().setText("Illegal number!");
                }
                catch (IllegalArgumentException e) {
                    InputField.getInputField().setText("Division by zero is impossible!");
                }
            }
        });
        operationsButtonsGroup.add(divisionButton);
        equalsButton = new JButton("=");
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    result *= Double.parseDouble(InputField.getInputField().getText());
                    InputField.getInputField().setText(result + "");
                }
                catch (NumberFormatException e){
                    InputField.getInputField().setText("Illegal number!");
                }
            }
        });
    }

    public static OperationsButtonsPanel getOperationsButtonsPanel() {

        if(operationsButtonsPanel == null) operationsButtonsPanel = new OperationsButtonsPanel();

        return operationsButtonsPanel;
    }

}
