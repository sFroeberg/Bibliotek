package UI.PatronUI;

import UI.CardLayoutMain;
import UI.EmployeeUI.EmployeeStartUI;
import UI.UI;
import entities.Actor;
import entities.Dvd;
import entities.Employee;
import entities.Patron;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JPanel;

public class LoginUI extends UI {
    /**
     * Creates new form LoginUI
     */
    public LoginUI(CardLayoutMain cardLayoutMain) {
        super(cardLayoutMain);
        initComponents();
        initButtonGroup();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        loginEmailField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        loginPasswordField = new javax.swing.JPasswordField();
        loginCancelButton = new javax.swing.JButton();
        patronBtn = new javax.swing.JRadioButton();
        employeeBtn = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jLabel1.setLabelFor(loginEmailField);
        jLabel1.setText("E-mail");
        jLabel1.setToolTipText("");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setLabelFor(loginPasswordField);
        jLabel2.setText("Password");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        loginCancelButton.setText("Cancel");
        loginCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginCancelButtonActionPerformed(evt);
            }
        });

        patronBtn.setSelected(true);
        patronBtn.setText("Patron");

        employeeBtn.setText("Employee");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(loginPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(loginEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(loginButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(loginCancelButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeBtn)
                            .addComponent(patronBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patronBtn))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(employeeBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(loginCancelButton))
                .addContainerGap(172, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void initButtonGroup(){
        buttonGroup1.add(patronBtn);
        buttonGroup1.add(employeeBtn);
    }
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        if(patronBtn.isSelected()){
            String password = new String(loginPasswordField.getPassword());
            List<Patron> loginPatron = this.getCardLayoutMain().getEntityManager().createNamedQuery("Patron.findByEmailAndPassword").
                    setParameter("email", loginEmailField.getText()).
                    setParameter("password", password).
                    getResultList();
            if(loginPatron.size() == 1){
                this.getCardLayoutMain().setPatronLoggedIn(loginPatron.get(0));
                this.switchToCard(PatronOverviewUI.class);
            }else{
                UI.showInfoDialog("Wrong email or password");
            }
        }else if(employeeBtn.isSelected()){
            String password = new String(loginPasswordField.getPassword());
            List<Employee> loginEmp = this.getCardLayoutMain().getEntityManager().createNamedQuery("Employee.findByEmailAndPassword").
                    setParameter("email", loginEmailField.getText()).
                    setParameter("password", password).
                    getResultList();
            if(loginEmp.size() == 1){
                this.getCardLayoutMain().setEmpLoggedIn(loginEmp.get(0));
                this.switchToCard(EmployeeStartUI.class);
            }else{
                UI.showInfoDialog("Wrong email or password");
            }
        }
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        //Remove data from textfields when hidden
        loginEmailField.setText("");
        loginPasswordField.setText("");
    }//GEN-LAST:event_formComponentHidden

    private void loginCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginCancelButtonActionPerformed
        this.switchToCard(StartPageUI.class);
    }//GEN-LAST:event_loginCancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton employeeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton loginCancelButton;
    private javax.swing.JTextField loginEmailField;
    private javax.swing.JPasswordField loginPasswordField;
    private javax.swing.JRadioButton patronBtn;
    // End of variables declaration//GEN-END:variables
}
