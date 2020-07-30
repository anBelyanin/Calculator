package GUI.Classes;

import GUI.Interfaces.GuiElement;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends Thread implements GuiElement {
    private static JFrame mainFrame;
    private static JLabel mainFrameLabel;
    private static MainFrame instance;

    private MainFrame() {
        this.start();
        try{
            this.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

    }

    public static MainFrame getInstance() {

        if(instance == null) instance = new MainFrame();

        return instance;
    }

    public void run() {
        mainFrame = new JFrame("Calculator`s main frame");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrameLabel = new JLabel("Calculator");
        mainFrame.getContentPane().add(mainFrameLabel);
        mainFrame.setPreferredSize(new Dimension(300, 600));
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
