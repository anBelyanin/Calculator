package GUI.Classes.Elements;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private static MainFrame mainFrame;

    private MainFrame() {
        this.setLayout(new GridLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 600);
        this.pack();
        this.setVisible(true);
    }

    private MainFrame(String title) {
        this.setTitle(title);
        this.setLayout(new GridLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 600);
        this.pack();
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
