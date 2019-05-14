package UI;

import java.awt.CardLayout;
import javax.swing.JPanel;

public abstract class  UI extends javax.swing.JPanel {
    private CardLayoutMain cardLayoutMain;
    public UI(CardLayoutMain cardLayoutMain){
        this.cardLayoutMain = cardLayoutMain;
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
