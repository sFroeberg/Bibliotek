package UI;

import entities.Patron;
import java.text.SimpleDateFormat;
import javax.persistence.RollbackException;
import javax.swing.JOptionPane;
import utils.RegexUtil;

public class PatronOverviewUI extends UI {
    /**
     * Creates new form PatronOverviewUI
     */
    public PatronOverviewUI(CardLayoutMain cardLayoutMain) {
        super(cardLayoutMain);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        overviewFirstname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        overviewLastname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        overviewEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        overviewTele = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        overviewDob = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        overviewFullName = new javax.swing.JLabel();
        overviewChangeButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Förnamn");

        overviewFirstname.setEnabled(false);

        jLabel2.setText("Efternamn");

        overviewLastname.setEnabled(false);
        overviewLastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                overviewLastnameKeyPressed(evt);
            }
        });

        jLabel3.setText("Email");

        overviewEmail.setEnabled(false);

        jLabel4.setText("Telefon");

        overviewTele.setEnabled(false);

        jLabel5.setText("Födelsedag");

        overviewDob.setEnabled(false);

        jLabel6.setText("Lån");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList2);

        jLabel7.setText("Reservationer");

        overviewFullName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        overviewChangeButton.setText("Ändra uppgifter");
        overviewChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overviewChangeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(overviewFullName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(overviewChangeButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(overviewTele)
                            .addComponent(overviewEmail)
                            .addComponent(overviewLastname)
                            .addComponent(overviewFirstname, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(overviewDob))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(overviewFullName)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(overviewFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(overviewLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(overviewEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(overviewTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(overviewDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(overviewChangeButton)
                .addContainerGap(122, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        Patron loggedIn = this.getCardLayoutMain().getLoggedIn();
        //Avsluta om inte inloggad
        if(loggedIn == null){
            UI.showErrorDialog("Inte inloggad. Programmet avslutas");
            System.exit(0);
        }
        
        //Populate data into textfields
        overviewFullName.setText(loggedIn.getFullName());
        
        overviewFirstname.setText(loggedIn.getFirstName());
        overviewLastname.setText(loggedIn.getLastName());
        overviewEmail.setText(loggedIn.getEmail());
        overviewTele.setText(loggedIn.getTelnr());
        //Format dob
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        overviewDob.setText(format.format(loggedIn.getDob()));
        
        
        
        
        
    }//GEN-LAST:event_formComponentShown

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        
    }//GEN-LAST:event_formComponentHidden

    private void overviewLastnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_overviewLastnameKeyPressed
       
    }//GEN-LAST:event_overviewLastnameKeyPressed

    private void overviewChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overviewChangeButtonActionPerformed
        if(overviewChangeButton.getText().equals("Ändra uppgifter")){
            overviewChangeButton.setText("Spara uppgifter");
            
            //Enable editing when button pushed
            overviewFirstname.setEnabled(true);
            overviewLastname.setEnabled(true);
            overviewEmail.setEnabled(true);
            overviewTele.setEnabled(true);
            //TODO: Fixed edit date
            //overviewDob.setEnabled(true);
        }else{
            //Save uppgifter when button clicked
            if(!RegexUtil.isValidEmail(overviewEmail.getText())){
                UI.showErrorDialog("Felaktigt format på mail adress");
            }else if(!RegexUtil.isValidFirstOrLastname(overviewFirstname.getText()) || !RegexUtil.isValidFirstOrLastname(overviewLastname.getText())){
                UI.showErrorDialog("Felaktigt format på förnamn eller efternamn");
            }else if(!RegexUtil.isValidTelnr(overviewTele.getText())){
                UI.showErrorDialog("Felaktigt format på telefonnummer");
            }else{
                Patron loggedIn = this.getCardLayoutMain().getLoggedIn();
                overviewChangeButton.setText("Ändra uppgifter");
                //TODO: Save patron
                this.getCardLayoutMain().getEntityManager().getTransaction().begin();
                overviewFirstname.setEnabled(false);
                loggedIn.setFirstName(overviewFirstname.getText());

                overviewLastname.setEnabled(false);
                loggedIn.setLastName(overviewLastname.getText());

                overviewEmail.setEnabled(false);
                loggedIn.setEmail(overviewEmail.getText());

                overviewTele.setEnabled(false);
                loggedIn.setTelnr(overviewTele.getText());

                //overviewDob.setEnabled(false);
                //loggedIn.setDob(overviewFirstname.getText());

                try {
                    this.getCardLayoutMain().getEntityManager().getTransaction().commit();
                }catch (RollbackException e){
                    UI.showErrorDialog("Kunde inte spara uppgifter i databasen");
                }
            }
        }
    }//GEN-LAST:event_overviewChangeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton overviewChangeButton;
    private javax.swing.JTextField overviewDob;
    private javax.swing.JTextField overviewEmail;
    private javax.swing.JTextField overviewFirstname;
    private javax.swing.JLabel overviewFullName;
    private javax.swing.JTextField overviewLastname;
    private javax.swing.JTextField overviewTele;
    // End of variables declaration//GEN-END:variables
}
