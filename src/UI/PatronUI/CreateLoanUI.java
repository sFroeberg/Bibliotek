/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PatronUI;

import UI.CardLayoutMain;
import UI.UI;
import entities.Item;
import entities.ItemLoan;
import entities.ItemLoanPK;
import entities.Loan;
import entities.Patron;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.RollbackException;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Felix
 */
public class CreateLoanUI extends UI {
    private ArrayList<Item> itemsToLoad;
    
    public CreateLoanUI(CardLayoutMain cardLayoutMain) {
        super(cardLayoutMain);
        initComponents();
        initJlist();
        itemsToLoad = new ArrayList<>();
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
        jLabel2 = new javax.swing.JLabel();
        itemBarCodeField = new javax.swing.JTextField();
        addItemBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsList = new javax.swing.JList();
        createLoanBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        itmSrchBtn = new javax.swing.JButton();
        logInBtn = new javax.swing.JButton();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("New loan");

        jLabel2.setText("Barcode");

        addItemBtn.setText("Add");
        addItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemBtnActionPerformed(evt);
            }
        });

        itemsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemsListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemsList);

        createLoanBtn.setText("Create loan");
        createLoanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLoanBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Items to loan (double click to remove item)");

        itmSrchBtn.setText("Item search");
        itmSrchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSrchBtnActionPerformed(evt);
            }
        });

        logInBtn.setText("Log in");
        logInBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                logInBtnComponentShown(evt);
            }
        });
        logInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(itemBarCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addItemBtn)
                            .addComponent(createLoanBtn)
                            .addComponent(itmSrchBtn)
                            .addComponent(logInBtn))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(itemBarCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addItemBtn)
                        .addGap(18, 18, 18)
                        .addComponent(createLoanBtn)
                        .addGap(18, 18, 18)
                        .addComponent(itmSrchBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(logInBtn)
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void initJlist(){
        model = new DefaultListModel<>();
        itemsList.setModel(model);
    }
    private void createLoanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createLoanBtnActionPerformed
        if(model.getSize() == 0){
            UI.showErrorDialog("There is nothing in the loan list");
            return;
        }
        ArrayList<Item> itemsToLoan = new ArrayList<Item>();
        int i = 0;
        while(i < model.getSize()){
            itemsToLoan.add(model.getElementAt(i));
            i++;
        }
        
        
        //Check patron max loans
        int patronMaxLoans = this.getCardLayoutMain().getPatronLoggedIn().getPatronTypeId().getMaxLoans();
        int patronCurrentLoans = this.getCardLayoutMain().getPatronLoggedIn().getLoansNotReturned();
        int patronLoansLeft = patronMaxLoans - patronCurrentLoans;
        int toBeLended = itemsToLoan.size();

        if(toBeLended > patronLoansLeft){
            UI.showErrorDialog("Too many items to loan. You already have " + patronCurrentLoans + " loans. You can have a maximum of " + patronMaxLoans + " loans");
            return;
        }
        
        
        Loan loan = new Loan();
        loan.setPatronId(this.getCardLayoutMain().getPatronLoggedIn());
        loan.setCreated(new Date());

        try{
            //Save to database
            //Loan
            this.getCardLayoutMain().getEntityManager().getTransaction().begin();
            this.getCardLayoutMain().getEntityManager().persist(loan);
            this.getCardLayoutMain().getEntityManager().getTransaction().commit();
        }catch (RollbackException | IllegalStateException e){
            UI.showErrorDialog("Could not save loan to database. You might have to log in first.");
            return;
        }
        
        //Set itemloans in database
        ArrayList<ItemLoan> itemLoans = new ArrayList<ItemLoan>();
        for(Item current : itemsToLoan){
            if(current.isOnLoan()){
                UI.showErrorDialog(current.getTitle()+" is alreay on loan. Remove it");
                return;
            }else if(!current.isLendable()){
                UI.showErrorDialog(current.getTitle()+" is not lendable");
                return;
            }
            else{
                ItemLoan itemLoan = new ItemLoan();
                ItemLoanPK itemLoanPK = new ItemLoanPK(current.getBarcode(),loan.getLoanId());
                itemLoan.setItemLoanPK(itemLoanPK);
                itemLoan.setItem(current);
                itemLoan.setLoan(loan);
                this.getCardLayoutMain().getEntityManager().persist(itemLoan);
                itemLoans.add(itemLoan);
            }
        }
        
        try{
            //Save to database
            //ItemLoans
            this.getCardLayoutMain().getEntityManager().getTransaction().begin();
            loan.setItemLoanCollection(itemLoans);
            this.getCardLayoutMain().getEntityManager().getTransaction().commit();
        }catch (RollbackException | IllegalStateException e){
            UI.showErrorDialog("Could not save loan to database");
            return;
        }
        //Print receipt
        String receipt = "";
            
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date newDate = new Date();

        receipt += "Name: "+ this.getCardLayoutMain().getPatronLoggedIn().getFullName()+"\n";
        receipt += "Loan date: "+ format.format(newDate)+"\n\n";
        for(ItemLoan current : itemLoans){
            receipt += current.getItem().getTitle()+"\n";
            receipt += "Barcode: "+current.getItem().getBarcode()+"\n";
            
            //Check if book or dvd and calculate return date as appropriate
            if(current.getItem().getBook() == null){
                LocalDate returnDate = LocalDate.now().plusDays(7);
                Date finalDate = Date.from(returnDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
                
                receipt += "To be returned: "+format.format(finalDate)+" (7 days)";
            }else{
                int maxLoanDays = current.getItem().getBook().getBookTypeId().getLoanDays();
                LocalDate returnDate = LocalDate.now().plusDays(maxLoanDays);
                Date finalDate = Date.from(returnDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
                
                receipt += "To be returned: "+format.format(finalDate)+" ("+maxLoanDays+" days)";
            }
            receipt += "\n\n";
        }

        UI.showInfoDialog("Loan saved!\n\nThis is your receipt:\n"+receipt);
        this.switchToCard(PatronOverviewUI.class);

    }//GEN-LAST:event_createLoanBtnActionPerformed

    private void addItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemBtnActionPerformed
        List<Item> itemToAdd = this.getCardLayoutMain().getEntityManager().createNamedQuery("Item.findByBarcode").
                setParameter("barcode", itemBarCodeField.getText()).
                getResultList();
        if(!itemToAdd.isEmpty()){
            Item item = itemToAdd.get(0);
            if(item.isOnLoan()){
                UI.showErrorDialog("This is item is alreay on loan");
            }else if(!item.isLendable()){
                UI.showErrorDialog("This is item is not lendable");
            }else{
                model.addElement(item);
            }
            
        }else{
            UI.showErrorDialog("There is no item with that barcode");
        }
    }//GEN-LAST:event_addItemBtnActionPerformed

    private void itemsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsListMouseClicked
        //Remove element when double clicked on
        JList list = (JList)evt.getSource();
        if (evt.getClickCount() == 2) {
            int index = list.locationToIndex(evt.getPoint());
            model.removeElementAt(index);
        }
    }//GEN-LAST:event_itemsListMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        EntityManager em = this.getCardLayoutMain().getEntityManager();
        em.clear();
        //Clear Jlist on show
        model.removeAllElements();
        
        //Add preloaded items
        for(Item current : this.getItemsToLoad()){
            model.addElement(current);
        }
        //Clear the list after loading it
        this.clearItemsToLoad();
        Patron loggedIn = this.getCardLayoutMain().getPatronLoggedIn();
        if(loggedIn == null){
            logInBtn.setVisible(true);
        }else{
            logInBtn.setVisible(false);
        }
        
    }//GEN-LAST:event_formComponentShown

    private void itmSrchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSrchBtnActionPerformed
        switchToCard(ItemSearchUI.class);
    }//GEN-LAST:event_itmSrchBtnActionPerformed

    private void logInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed
        switchToCard(LoginUI.class);
    }//GEN-LAST:event_logInBtnActionPerformed

    private void logInBtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_logInBtnComponentShown
        Patron loggedIn = this.getCardLayoutMain().getPatronLoggedIn();
        if(loggedIn == null){
            logInBtn.setVisible(false);
        }else{
            logInBtn.setVisible(true);
        }
    }//GEN-LAST:event_logInBtnComponentShown

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        
    }//GEN-LAST:event_formComponentHidden
    
    public ArrayList<Item> getItemsToLoad() {
        return itemsToLoad;
    }

    public void addItemsToLoad(Item item) {
        this.itemsToLoad.add(item);
    }
    public void clearItemsToLoad() {
        this.itemsToLoad.clear();
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemBtn;
    private javax.swing.JButton createLoanBtn;
    private javax.swing.JTextField itemBarCodeField;
    private javax.swing.JList itemsList;
    private javax.swing.JButton itmSrchBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logInBtn;
    // End of variables declaration//GEN-END:variables
    DefaultListModel<Item> model = new DefaultListModel<>();
}