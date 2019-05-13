package UI;

import java.awt.*;
import javax.swing.*;
 
public class CardLayoutMain {
    JPanel cards; //a panel that uses CardLayout
     
    public void addComponentToPane(Container pane) { 
        //Create the "cards".
        JPanel loginCard = new LoginUI(this);
         
        JPanel registerCard = new RegisterPatronUI(this);
         
        //Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        cards.add(loginCard, "loginCard");
        cards.add(registerCard, "registerCard");

        pane.add(cards, BorderLayout.CENTER);
    }
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Bibliotek system");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        //Create and set up the content pane.
        CardLayoutMain demo = new CardLayoutMain();
        demo.addComponentToPane(frame.getContentPane());
         
        //Display the window.
        frame.pack();
        //Sets the frame in center of screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
     
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
         
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}