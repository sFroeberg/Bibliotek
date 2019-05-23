/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import entities.ItemLoan;
import entities.Loan;
import entities.Patron;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Sebastian
 */
public class ItemReturnUI extends UI {

    /**
     * Creates new form ItemReturnUI
     */
    public ItemReturnUI(CardLayoutMain cardLayoutMain) {
        super(cardLayoutMain);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        loanList = new javax.swing.JList<>();
        returnBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        returnList = new javax.swing.JList<>();
        patronLoanTxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Current loans");

        jScrollPane1.setViewportView(loanList);

        returnBtn.setText("Return selected item");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        returnList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(returnList);

        patronLoanTxt.setText("Patron loans");

        jLabel2.setText("Returned items");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(returnBtn)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(patronLoanTxt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(patronLoanTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(returnBtn)
                        .addGap(165, 165, 165))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        Patron loggedIn = this.getCardLayoutMain().getPatronLoggedIn();
        patronLoanTxt.setText(loggedIn.getFullName()+" current loans.");
        
        EntityManager em = this.getCardLayoutMain().getEntityManager();
        DefaultListModel model = new DefaultListModel();
        loanList.setModel(model);

        List<Loan> patronLoans = (List)this.getCardLayoutMain().getPatronLoggedIn().getLoanCollection();
        for(Loan current: patronLoans){
            for(ItemLoan curr: current.getItemLoanCollection()){
                if(curr.getReturned() == null){
                    model.addElement(curr.getItem().getTitle());
                }
            }
        }
    }//GEN-LAST:event_formComponentShown
    DefaultListModel model2 = new DefaultListModel();
    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        model2.addElement(loanList.getSelectedValue());
        returnList.setModel(model2);

    }//GEN-LAST:event_returnBtnActionPerformed

    private void returnListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnListMouseClicked
        JList list = (JList)evt.getSource();
        if (evt.getClickCount() == 2) {
            int index = list.locationToIndex(evt.getPoint());
            model2.removeElementAt(index);
        }
    }//GEN-LAST:event_returnListMouseClicked

    
      

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> loanList;
    private javax.swing.JLabel patronLoanTxt;
    private javax.swing.JButton returnBtn;
    private javax.swing.JList<String> returnList;
    // End of variables declaration//GEN-END:variables
}
