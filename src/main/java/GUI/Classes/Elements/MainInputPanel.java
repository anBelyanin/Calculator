package GUI.Classes.Elements;

import GUI.Interfaces.GuiElement;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel implements GuiElement {
    private static JPanel mainPanel;
    private static MainPanel instance;

    private MainPanel() {
        this.run();
    }

    public static MainPanel getInstance() {

        if (instance == null) instance = new MainPanel();

        return instance;
    }

    @Override
    public void run() {
        mainPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    }
}
