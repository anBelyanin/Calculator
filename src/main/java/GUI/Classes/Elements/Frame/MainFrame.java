package GUI.Classes.Elements.Frame;

import GUI.Interfaces.GuiElement;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements GuiElement {

    private static MainFrame mainFrame;

    private MainFrame() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(MainContentPanel.getMainContentPanel());
        this.setSize(300, 600);
        this.setVisible(true);
    }

    private MainFrame(String title) {
        this.setTitle(title);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(MainContentPanel.getMainContentPanel());
        this.setSize(300, 600);
        this.setVisible(true);
    }

    public static MainFrame getMainFrame() {

        if (mainFrame == null) mainFrame = new MainFrame();

        return mainFrame;
    }

    public static MainFrame getMainFrame(String title) {

        if(mainFrame == null) mainFrame = new MainFrame(title);

        return mainFrame;
    }
}
