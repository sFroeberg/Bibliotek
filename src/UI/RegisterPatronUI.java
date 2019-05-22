package UI;

import entities.Patron;
import entities.PatronType;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.RollbackException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import utils.RegexUtil;

public class RegisterPatronUI extends UI {
    /**
     * Creates new form RegisterPatronUI
     */
    public RegisterPatronUI(CardLayoutMain cardLayoutMain) {
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

        registerFirstNameField = new javax.swing.JTextField();
        registerEmailField = new javax.swing.JTextField();
        registerDobField = new javax.swing.JTextField();
        registerTelField = new javax.swing.JTextField();
        registerLastNameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        registerCancelButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        patronTypeChooser = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 400));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        registerDobField.setText("yyyy-mm-dd");

        jLabel1.setLabelFor(registerFirstNameField);
        jLabel1.setText("Firstname");

        jLabel2.setLabelFor(registerEmailField);
        jLabel2.setText("E-mail");

        jLabel3.setLabelFor(registerDobField);
        jLabel3.setText("Birthday");

        jLabel4.setLabelFor(registerLastNameField);
        jLabel4.setText("Lastname");

        jLabel5.setLabelFor(registerTelField);
        jLabel5.setText("Telephone");

        jLabel6.setText("Password");

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        registerCancelButton.setText("Cancel");
        registerCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerCancelButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Confirm password");

        patronTypeChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patronTypeChooserActionPerformed(evt);
            }
        });

        jLabel8.setText("Role");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Register new patron");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(registerFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registerDobField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(registerButton)
                                    .addComponent(registerEmailField)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(registerCancelButton)
                                    .addComponent(jLabel7)
                                    .addComponent(patronTypeChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(registerLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(registerTelField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel9)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerTelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerDobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patronTypeChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerCancelButton)
                    .addComponent(registerButton))
                .addContainerGap(144, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerCancelButtonActionPerformed
        this.switchToCard(EmployeeStartUI.class);
    }//GEN-LAST:event_registerCancelButtonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //JPanel shown
        
        //Reset all fields (except dob)
        Component[] components = this.getComponents();
        for(Component currentComp : components){
            if(currentComp instanceof JTextField){
                JTextField field;
                field = (JTextField) currentComp;
                if(currentComp == registerDobField){
                    field.setText("yyyy-mm-dd");
                }else{
                    field.setText("");
                }
            }     
        }
        //Setup all PatronTypes in comboBox
        List<PatronType> patronTypes = this.getCardLayoutMain().getEntityManager().createNamedQuery("PatronType.findAll")
                .getResultList();
        patronTypeChooser.removeAllItems();
        for(PatronType current : patronTypes){
            patronTypeChooser.addItem(current);
        }
    }//GEN-LAST:event_formComponentShown

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        //Check password match and is longer than 5 TODO: Use regexutil
        if(jPasswordField1.getPassword() != jPasswordField2.getPassword() && jPasswordField1.getPassword().length < 6){
            UI.showErrorDialog("Password does not match or is less then 6 characters");
        }else if(!RegexUtil.isValidEmail(registerEmailField.getText())){
            UI.showErrorDialog("Wrong email format");
        }else if(!RegexUtil.isValidFirstOrLastname(registerFirstNameField.getText()) || !RegexUtil.isValidFirstOrLastname(registerLastNameField.getText())){
            UI.showErrorDialog("Wrong firstname or lastname format");
        }else if(!RegexUtil.isValidTelnr(registerTelField.getText())){
            UI.showErrorDialog("Wrong telephone format");
        }else{
            Patron newPatron = new Patron();
            newPatron.setFirstName(registerFirstNameField.getText());
            newPatron.setLastName(registerLastNameField.getText());
            newPatron.setEmail(registerEmailField.getText());
            newPatron.setTelnr(registerTelField.getText());
            newPatron.setPassword(new String(jPasswordField1.getPassword()));
            
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date newDate;
            try {
                newDate = format.parse(registerDobField.getText());
            } catch (ParseException ex) {
                UI.showErrorDialog("Wrong birthday format");
                return;
            }
            newPatron.setDob(newDate);
            newPatron.setCreated(new Date());
            newPatron.setPatronTypeId((PatronType) patronTypeChooser.getSelectedItem());
            try{
                //Save to database
                this.getCardLayoutMain().getEntityManager().getTransaction().begin();
                this.getCardLayoutMain().getEntityManager().persist(newPatron);
                this.getCardLayoutMain().getEntityManager().getTransaction().commit();
                UI.showInfoDialog("Patron saved!");
                this.switchToCard(EmployeeStartUI.class);
            }catch (RollbackException | IllegalStateException e){
                UI.showErrorDialog("Could not save patron to database");
            }
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void patronTypeChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patronTypeChooserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patronTypeChooserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JComboBox patronTypeChooser;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton registerCancelButton;
    private javax.swing.JTextField registerDobField;
    private javax.swing.JTextField registerEmailField;
    private javax.swing.JTextField registerFirstNameField;
    private javax.swing.JTextField registerLastNameField;
    private javax.swing.JTextField registerTelField;
    // End of variables declaration//GEN-END:variables
}
