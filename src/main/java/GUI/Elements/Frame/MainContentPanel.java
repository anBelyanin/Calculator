package GUI.Classes.Elements.Frame;

import GUI.Classes.Elements.Content.ActionButtonsPanel;
import GUI.Classes.Elements.Content.OperationsButtonsPanel;
import GUI.Classes.Elements.Fields.InputField;
import Interfaces.GuiElement;
import GUI.Classes.Elements.Content.NumButtonsPanel;

import javax.swing.*;

public class MainContentPanel extends JPanel implements GuiElement {

    private static MainContentPanel mainContentPanel;

    private MainContentPanel() {
        this.add(InputField.getInputField());
        this.add(NumButtonsPanel.getNumButtonsPanel());
        this.add(ActionButtonsPanel.getActionButtonsPanel());
        this.add(OperationsButtonsPanel.getOperationsButtonsPanel());
        this.setVisible(true);
    }

    public static MainContentPanel getMainContentPanel() {

        if (mainContentPanel == null) mainContentPanel = new MainContentPanel();

        return mainContentPanel;
    }
}
