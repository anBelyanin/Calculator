package GUI.Classes.Elements.Frame;

import GUI.Classes.Elements.Fields.InputField;
import GUI.Interfaces.GuiElement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumButtonsPanel extends JPanel implements GuiElement {

    private static NumButtonsPanel numButtonsPanel;

    private static ButtonGroup numButtonsGroup;

    private static JButton num1Button;
    private static JButton num2Button;
    private static JButton num3Button;
    private static JButton num4Button;
    private static JButton num5Button;
    private static JButton num6Button;
    private static JButton num7Button;
    private static JButton num8Button;
    private static JButton num9Button;
    private static JButton num0Button;

    private NumButtonsPanel() {
        initializeButtons();
        this.setLayout(new GridLayout(4, 3));
        this.add(num1Button);
        this.add(num2Button);
        this.add(num3Button);
        this.add(num4Button);
        this.add(num5Button);
        this.add(num6Button);
        this.add(num7Button);
        this.add(num8Button);
        this.add(num9Button);
        this.add(num0Button);
    }

    public static NumButtonsPanel getNumButtonsPanel() {

        if (numButtonsPanel == null) numButtonsPanel = new NumButtonsPanel();

        return numButtonsPanel;
    }

    private static void initializeButtons() {
        numButtonsGroup = new ButtonGroup();
        num1Button = new JButton("1");
        num1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                InputField.getInputField().setText(InputField.getInputField().getText() + "1");
            }
        });
        numButtonsGroup.add(num1Button);
        num2Button = new JButton("2");
        num2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                InputField.getInputField().setText(InputField.getInputField().getText() + "2");
            }
        });
        numButtonsGroup.add(num2Button);
        num3Button = new JButton("3");
        num3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                InputField.getInputField().setText(InputField.getInputField().getText() + "3");
            }
        });
        numButtonsGroup.add(num3Button);
        num4Button = new JButton("4");
        num4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                InputField.getInputField().setText(InputField.getInputField().getText() + "4");
            }
        });
        numButtonsGroup.add(num4Button);
        num5Button = new JButton("5");
        num5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                InputField.getInputField().setText(InputField.getInputField().getText() + "5");
            }
        });
        numButtonsGroup.add(num5Button);
        num6Button = new JButton("6");
        num6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                InputField.getInputField().setText(InputField.getInputField().getText() + "6");
            }
        });
        numButtonsGroup.add(num6Button);
        num7Button = new JButton("7");
        num7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                InputField.getInputField().setText(InputField.getInputField().getText() + "7");
            }
        });
        numButtonsGroup.add(num7Button);
        num8Button = new JButton("8");
        num8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                InputField.getInputField().setText(InputField.getInputField().getText() + "8");
            }
        });
        numButtonsGroup.add(num8Button);
        num9Button = new JButton("9");
        num9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                InputField.getInputField().setText(InputField.getInputField().getText() + "9");
            }
        });
        numButtonsGroup.add(num9Button);
        num0Button = new JButton("0");
        num0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                InputField.getInputField().setText(InputField.getInputField().getText() + "0");
            }
        });
        numButtonsGroup.add(num0Button);
    }
}
