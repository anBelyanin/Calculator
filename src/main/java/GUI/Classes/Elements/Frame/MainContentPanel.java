package GUI.Classes.Elements.Frame;

import GUI.Classes.Elements.Fields.InputField;
import GUI.Interfaces.GuiElement;

import javax.swing.*;

public class MainContentPanel extends JPanel implements GuiElement {

    private static MainContentPanel mainContentPanel;

    private MainContentPanel() {
        this.add(InputField.getInputField());
        this.add(NumButtonsPanel.getNumButtonsPanel());
        this.setVisible(true);
    }

    public static MainContentPanel getMainContentPanel() {

        if (mainContentPanel == null) mainContentPanel = new MainContentPanel();

        return mainContentPanel;
    }
}
