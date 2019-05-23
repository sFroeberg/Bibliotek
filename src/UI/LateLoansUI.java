/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import entities.Item;
import entities.ItemLoan;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.persistence.EntityManager;
import javax.swing.DefaultListModel;

/**
 *
 * @author Felix
 */
public class LateLoansUI extends UI {

    /**
     * Creates new form LateLoansUI
     */
    public LateLoansUI(CardLayoutMain cardLayoutMain) {
        super(cardLayoutMain);
        initComponents();
        initJlist();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        lateLoansList = new javax.swing.JList();

        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Late loans");

        jScrollPane1.setViewportView(lateLoansList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        EntityManager em = this.getCardLayoutMain().getEntityManager();
        List<ItemLoan> loansNotReturned = em.createNamedQuery("ItemLoan.findAllNotReturned").
                getResultList();
        for(ItemLoan current : loansNotReturned){
            
            //calc loan days
            int loanMaxDays;
            if(current.getItem().getBook() == null){
                loanMaxDays = 7;
            }else{
                loanMaxDays = current.getItem().getBook().getBookTypeId().getLoanDays();
            }
            
            //Calculate return date
            Date created = current.getLoan().getCreated();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            LocalDate returnDate = LocalDate.parse(format.format(created)).plusDays(loanMaxDays);
            Date finalDate = Date.from(returnDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            
            //If return date is before = it is late
            Date now = new Date();
            if(finalDate.before(now)){
                String listStr = "";
                listStr += "Title: "+current.getItem().getTitle()+"  ";
                listStr += "Patron: "+current.getLoan().getPatronId().getFullName()+"  ";
                //Calc how many days late
                long diff = now.getTime() - finalDate.getTime();
                listStr += "Days late: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
                model.addElement(listStr);
            }
            
        }
    }//GEN-LAST:event_formComponentShown
    private void initJlist(){
        model = new DefaultListModel<>();
        lateLoansList.setModel(model);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lateLoansList;
    // End of variables declaration//GEN-END:variables
    DefaultListModel<String> model = new DefaultListModel<>();
}
