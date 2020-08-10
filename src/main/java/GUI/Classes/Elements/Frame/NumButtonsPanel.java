package GUI.Classes.Elements.Frame;

import GUI.Interfaces.GuiElement;

import javax.swing.*;

public class NumButtonsPanel extends JPanel implements GuiElement {

    private static NumButtonsPanel numButtonsPanel;

    private NumButtonsPanel() {
        super();
    }

    public static NumButtonsPanel getNumButtonsPanel() {

        if (numButtonsPanel == null) numButtonsPanel = new NumButtonsPanel();

        return numButtonsPanel;
    }
}
