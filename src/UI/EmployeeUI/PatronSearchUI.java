/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.EmployeeUI;

import UI.CardLayoutMain;
import UI.UI;
import entities.Item;
import entities.Patron;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author Felix
 */
public class PatronSearchUI extends UI {

    /**
     * Creates new form PatronSearchUI
     */
    public PatronSearchUI(CardLayoutMain cardLayoutMain) {
        super(cardLayoutMain);
        initComponents();
        initJList();
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
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        birthdayField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultList = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Patron search");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Firstname");

        jLabel3.setText("Lastname");

        jLabel4.setText("Email");

        jLabel5.setText("Birthday (yyyy-mm-dd)");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        resultList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(resultList);

        jLabel6.setText("Result (double click to open patron)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(firstNameField)
                                .addComponent(lastNameField)
                                .addComponent(emailField)
                                .addComponent(birthdayField))
                            .addComponent(searchBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(birthdayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void initJList(){
        model = new DefaultListModel<>();
        resultList.setModel(model);
    }
    
    
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.switchToCard(EmployeeStartUI.class);
    }//GEN-LAST:event_backBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        model.removeAllElements();
        HashMap<String, String> params = new HashMap<String, String>();
        
        if(!firstNameField.getText().equals("")){
            params.put("firstName", firstNameField.getText());
        }
        
        if(!lastNameField.getText().equals("")){
            params.put("lastName", lastNameField.getText());
        }
        
        if(!emailField.getText().equals("")){
            params.put("email", emailField.getText());
        }
        
        if(!birthdayField.getText().equals("")){
            params.put("dob", birthdayField.getText());
        }
        
        EntityManager em = this.getCardLayoutMain().getEntityManager();
        String queryStr = "";
        for (String key : params.keySet()) {
            queryStr += "p."+key+" = :"+key+" AND ";
        }
        //Remove last AND
        queryStr = queryStr.substring(0, queryStr.length() - 4);
        
        Query query = em.createQuery("SELECT p FROM Patron p WHERE "+queryStr);
        
        //Set all params
        for (HashMap.Entry<String, String> entry : params.entrySet()) {
            if(entry.getKey().equals("dob")){
                //Create Date from dob field
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date newDate;
                try {
                    newDate = format.parse(entry.getValue());
                } catch (ParseException ex) {
                    UI.showErrorDialog("Wrong birthday format");
                    return;
                }
                query.setParameter("dob", newDate);
            }else{
                query.setParameter(entry.getKey(), entry.getValue());
            }
            
        }
        
        List<Patron> patrons = query.getResultList();
        
        if(!patrons.isEmpty()){
            for(Patron current : patrons){
                model.addElement(current);
            }
        }else{
            UI.showInfoDialog("No patrons found");
        }
        
    }//GEN-LAST:event_searchBtnActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        EntityManager em = this.getCardLayoutMain().getEntityManager();
        em.clear();
        //Reset JList
        model.removeAllElements();
        
        //Reset all fields
        Component[] components = this.getComponents();
        for(Component currentComp : components){
            if(currentComp instanceof JTextField){
                JTextField field;
                field = (JTextField) currentComp;
                field.setText("");
            }     
        }
    }//GEN-LAST:event_formComponentShown

    private void resultListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultListMouseClicked
        //Remove element when double clicked on
        JList list = (JList)evt.getSource();
        if (evt.getClickCount() == 2) {
            int index = list.locationToIndex(evt.getPoint());
            ArrayList<UI> cards = this.getCardLayoutMain().getUIlist();
            for(UI current : cards){
                if(current instanceof PatronAdminUI){
                    ((PatronAdminUI) current).setPatron(model.getElementAt(index));
                    this.switchToCard(PatronAdminUI.class);
                }
            }
        }
    }//GEN-LAST:event_resultListMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField birthdayField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JList resultList;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
    DefaultListModel<Patron> model = new DefaultListModel<>();
}