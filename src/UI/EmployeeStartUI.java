/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import entities.Employee;

/**
 *
 * @author Felix
 */
public class EmployeeStartUI extends UI {

    /**
     * Creates new form EmployeeStartUI
     */
    public EmployeeStartUI(CardLayoutMain cardLayoutMain) {
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

        employeeName = new javax.swing.JLabel();
        newPatronBtn = new javax.swing.JButton();
        empLogoutBtn = new javax.swing.JButton();
        addBookBtn = new javax.swing.JButton();
        addDvdBtn = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        employeeName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        employeeName.setText("Namn Namnsson");

        newPatronBtn.setText("Register new patron");
        newPatronBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPatronBtnActionPerformed(evt);
            }
        });

        empLogoutBtn.setText("Logout");
        empLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empLogoutBtnActionPerformed(evt);
            }
        });

        addBookBtn.setText("Add new book");
        addBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookBtnActionPerformed(evt);
            }
        });

        addDvdBtn.setText("Add new DVD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(newPatronBtn)
                .addGap(18, 18, 18)
                .addComponent(addBookBtn)
                .addGap(18, 18, 18)
                .addComponent(addDvdBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(employeeName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(empLogoutBtn)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeName)
                    .addComponent(empLogoutBtn))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPatronBtn)
                    .addComponent(addBookBtn)
                    .addComponent(addDvdBtn))
                .addContainerGap(315, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        Employee employee = this.getCardLayoutMain().getEmpLoggedIn();
        if(employee == null){
            UI.showErrorDialog("Not logged in!");
            System.exit(0);
        }
        
        employeeName.setText(employee.getFullName());
    }//GEN-LAST:event_formComponentShown

    private void newPatronBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPatronBtnActionPerformed
        this.switchToCard(RegisterPatronUI.class);
    }//GEN-LAST:event_newPatronBtnActionPerformed

    private void empLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empLogoutBtnActionPerformed
        this.getCardLayoutMain().setEmpLoggedIn(null);
        this.switchToCard(StartPageUI.class);
    }//GEN-LAST:event_empLogoutBtnActionPerformed

    private void addBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookBtnActionPerformed
        this.switchToCard(AddBookUI.class);
    }//GEN-LAST:event_addBookBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookBtn;
    private javax.swing.JButton addDvdBtn;
    private javax.swing.JButton empLogoutBtn;
    private javax.swing.JLabel employeeName;
    private javax.swing.JButton newPatronBtn;
    // End of variables declaration//GEN-END:variables
}
