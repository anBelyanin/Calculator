package GUI.Elements.Content;

import GUI.Elements.Fields.InputField;
import GUI.Interfaces.GuiElement;
import Logic.Controllers.Calculating.CalculatingController;
import Logic.Enums.CalculatingOperations;
import Logic.Exceptions.DivisionByZeroException;

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
                if (CalculatingController.getCalculatingOperation() != null) {
                   InputField.getInputField().setText(CalculatingController.calculate() + "");
                }
                CalculatingController.setCalculatingOperation(CalculatingOperations.PLUS);
                CalculatingController.setValue(Double.parseDouble(InputField.getInputField().getText()));
                InputField.getInputField().setText("");
            }
        });
        operationsButtonsGroup.add(plusButton);
        minusButton = new JButton("-");
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (CalculatingController.getCalculatingOperation() != null) {
                    InputField.getInputField().setText(CalculatingController.calculate() + "");
                }
                CalculatingController.setCalculatingOperation(CalculatingOperations.MINUS);
                CalculatingController.setValue(Double.parseDouble(InputField.getInputField().getText()));
                InputField.getInputField().setText("");
            }
        });
        operationsButtonsGroup.add(minusButton);
        multiplicationButton = new JButton("*");
        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (CalculatingController.getCalculatingOperation() != null) {
                    InputField.getInputField().setText(CalculatingController.calculate() + "");
                }
                CalculatingController.setCalculatingOperation(CalculatingOperations.MULTIPLICATION);
                CalculatingController.setValue(Double.parseDouble(InputField.getInputField().getText()));
                InputField.getInputField().setText("");
            }
        });
        operationsButtonsGroup.add(multiplicationButton);
        divisionButton = new JButton("/");
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (CalculatingController.getCalculatingOperation() != null) {
                    InputField.getInputField().setText(CalculatingController.calculate() + "");
                }
                CalculatingController.setCalculatingOperation(CalculatingOperations.DIVISION);
                CalculatingController.setValue(Double.parseDouble(InputField.getInputField().getText()));
                InputField.getInputField().setText("");
            }
        });
        operationsButtonsGroup.add(divisionButton);
        equalsButton = new JButton("=");
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                InputField.getInputField().setText(CalculatingController.calculate() + "");
                CalculatingController.setValue(0);
                CalculatingController.setCalculatingOperation(null);
            }
        });
    }

    public static OperationsButtonsPanel getOperationsButtonsPanel() {

        if(operationsButtonsPanel == null) operationsButtonsPanel = new OperationsButtonsPanel();

        return operationsButtonsPanel;
    }

}
