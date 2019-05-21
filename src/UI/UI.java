package UI;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public abstract class  UI extends javax.swing.JPanel {
    private CardLayoutMain cardLayoutMain;
    public UI(CardLayoutMain cardLayoutMain){
        this.cardLayoutMain = cardLayoutMain;
    }
    public static void showErrorDialog(String text){
        JOptionPane.showMessageDialog(null,text,"Error",JOptionPane.ERROR_MESSAGE);
    }
    public static void showInfoDialog(String text){
        JOptionPane.showMessageDialog(null, text,"Message",JOptionPane.INFORMATION_MESSAGE);
    }
    public CardLayoutMain getCardLayoutMain() {
        return cardLayoutMain;
    }
    //Shows a specific card
    public void switchToCard(Class paramClass){
        JPanel panel = this.getCardLayoutMain().getCards();
        CardLayout cardLayout = (CardLayout)(panel.getLayout());
        cardLayout.show(panel, paramClass.getName());
    }
}
