package UI;

import entities.Employee;
import entities.Patron;
import java.awt.*;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
 
public class CardLayoutMain {
    private JPanel cards; //a panel that uses CardLayout
    private Patron patronLoggedIn; 
    private Employee empLoggedIn;
    private EntityManager entityManager;
    /* TODO: Remove from prod
    private static CardLayoutMain cardLayoutInstance;
    */
    public CardLayoutMain(){
        super();
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "BibliotekPU" );
        this.entityManager = emfactory.createEntityManager( );
        /* TODO: Remove from prod
        CardLayoutMain.cardLayoutInstance = this;
        */
    }
    public void addComponentToPane(Container pane) { 
        //Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        
        //Add all views
        ArrayList<UI> uiClasses = new ArrayList<>();
        uiClasses.add(new StartPageUI(this));
        uiClasses.add(new AddBookUI(this));
        uiClasses.add(new CreateLoanUI(this));
        uiClasses.add(new LoginUI(this));
        uiClasses.add(new EmployeeStartUI(this));
        uiClasses.add(new ItemSearchUI(this));
        uiClasses.add(new ActorSearch(this));
        uiClasses.add(new RegisterPatronUI(this));
        uiClasses.add(new PatronOverviewUI(this));
        
        for(UI current : uiClasses){
            cards.add(current, current.getClass().getName());
        }
        pane.add(cards, BorderLayout.CENTER);
    }
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Bibliotek system");
        //Set custom icon
        ImageIcon img = new ImageIcon("resources/book-icon.png");
        frame.setIconImage(img.getImage());
        //Disable resizing
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Create and set up the content pane.
        CardLayoutMain cardLayout = new CardLayoutMain();
        cardLayout.addComponentToPane(frame.getContentPane());
         
        //Display the window.
        frame.pack();
        //Sets the frame in center of screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }

    public Patron getPatronLoggedIn() {
        return patronLoggedIn;
    }

    public void setPatronLoggedIn(Patron patronLoggedIn) {
        this.patronLoggedIn = patronLoggedIn;
    }

    public Employee getEmpLoggedIn() {
        return empLoggedIn;
    }

    public void setEmpLoggedIn(Employee empLoggedIn) {
        this.empLoggedIn = empLoggedIn;
    }
    
    /* TODO: Remove from prod
    public static CardLayoutMain getCardLayoutInstance() {
        return cardLayoutInstance;
    }
    */
    public JPanel getCards() {
        return cards;
    }
    
    public EntityManager getEntityManager() {
        return entityManager;
    }
    
    public static void main(String[] args) {
        try {
            //Set look and feel depending on OS type
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            //Cross platform
            //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
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