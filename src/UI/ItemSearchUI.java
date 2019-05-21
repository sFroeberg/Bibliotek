/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import entities.Author;
import entities.Book;
import entities.Dvd;
import entities.Item;
import entities.Patron;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextArea;

/**
 *
 * @author Sebastian
 */
public class ItemSearchUI extends UI {

    /**
     * Creates new form ItemSearchUI
     */
    public ItemSearchUI(CardLayoutMain cardLayoutMain) {
        super(cardLayoutMain);
        initComponents();
        initJlist();
    }
    private void initJlist(){
        model = new DefaultListModel<>();
        resultList.setModel(model);
    }
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        titleSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        releaseYearSearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        authorSearch = new javax.swing.JButton();
        genreSearch = new javax.swing.JButton();
        isbnSearch = new javax.swing.JButton();
        itemSelect = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        sendToLogIn = new javax.swing.JButton();
        lendItemText = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultList = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        toLoanList = new javax.swing.JList<>();
        loanAddBtn = new javax.swing.JButton();
        loanButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Title");

        titleSearch.setText("Search");
        titleSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleSearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Search for an item");

        jLabel3.setText("Results");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        releaseYearSearch.setText("Search");
        releaseYearSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                releaseYearSearchActionPerformed(evt);
            }
        });

        jLabel4.setText("Release Year");

        authorSearch.setText("Search");
        authorSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorSearchActionPerformed(evt);
            }
        });

        genreSearch.setText("Search");
        genreSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreSearchActionPerformed(evt);
            }
        });

        isbnSearch.setText("Search");
        isbnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnSearchActionPerformed(evt);
            }
        });

        itemSelect.setEditable(true);
        itemSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DVD", "Book" }));
        itemSelect.setToolTipText("");
        itemSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSelectActionPerformed(evt);
            }
        });

        jLabel5.setText("Choose item type");

        jLabel6.setText("Author / Director");

        jLabel8.setText("Genre");

        jLabel7.setText("ISBN");

        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        sendToLogIn.setText("Log in");
        sendToLogIn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                sendToLogInComponentShown(evt);
            }
        });
        sendToLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToLogInActionPerformed(evt);
            }
        });

        lendItemText.setText("Want to lend an item?");
        lendItemText.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                lendItemTextComponentShown(evt);
            }
        });

        jScrollPane2.setViewportView(resultList);

        jLabel9.setText("To loan");
        jLabel9.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel9ComponentShown(evt);
            }
        });

        toLoanList.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                toLoanListComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(toLoanList);

        loanAddBtn.setText("Add to loan");
        loanAddBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                loanAddBtnComponentShown(evt);
            }
        });
        loanAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanAddBtnActionPerformed(evt);
            }
        });

        loanButton.setText("Loan");
        loanButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                loanButtonComponentShown(evt);
            }
        });
        loanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loanButton, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(97, 97, 97)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(63, 63, 63)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel4))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGap(52, 52, 52)
                                                        .addComponent(jLabel8))
                                                    .addComponent(jLabel6))
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField4)
                                        .addComponent(jTextField3)
                                        .addComponent(jTextField2)
                                        .addComponent(jTextField1)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(titleSearch)
                                        .addComponent(releaseYearSearch)
                                        .addComponent(authorSearch)
                                        .addComponent(genreSearch)
                                        .addComponent(isbnSearch)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(itemSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(loanAddBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lendItemText)
                        .addComponent(sendToLogIn)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lendItemText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendToLogIn)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(itemSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(titleSearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(releaseYearSearch)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(authorSearch)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genreSearch)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isbnSearch)
                            .addComponent(jLabel7)))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(loanAddBtn)
                    .addComponent(loanButton))
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void itemSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemSelectActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
     
    }//GEN-LAST:event_jButton6ActionPerformed

    private void titleSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleSearchActionPerformed
        String selectedItem = (String)itemSelect.getSelectedItem();
        if(selectedItem.equals("DVD")){
            String title = jTextField1.getText();
            EntityManager em = this.getCardLayoutMain().getEntityManager();
            
            List<Item> dvdList = em.createNamedQuery("Item.findByTitle").setParameter("title", jTextField1.getText()).getResultList();
            
            for (Item current: dvdList){
                if(current.getDvd() != null){
                    model.addElement(current.getTitle());                    
                }  
            }
        }else if(selectedItem.equals("Book")){
            String title = jTextField1.getText();
            EntityManager em = this.getCardLayoutMain().getEntityManager();
            
            List<Item> bookList = em.createNamedQuery("Item.findByTitle").setParameter("title", jTextField1.getText()).getResultList();
            
            for (Item current: bookList){
                if(current.getBook() != null){
                    model.addElement(current.getTitle());
                }  
            }
        } 
    }//GEN-LAST:event_titleSearchActionPerformed

    private void releaseYearSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_releaseYearSearchActionPerformed

        String releaseYear = jTextField2.getText();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date newDate = null;
        try {
            newDate = format.parse(releaseYear+"-01-01");
        } catch (ParseException ex) {
            Logger.getLogger(ItemSearchUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        EntityManager em = this.getCardLayoutMain().getEntityManager();
        
        List<Item> itemList = em.createNamedQuery("Item.findByReleaseYear").setParameter("releaseYear", newDate).getResultList();
        
        for (Item current: itemList){
            model.addElement(current.getTitle());
        }
    }//GEN-LAST:event_releaseYearSearchActionPerformed

    private void authorSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorSearchActionPerformed
         
         String selectedItem = (String)itemSelect.getSelectedItem();
         String authorDirector = jTextField3.getText();
         EntityManager em = this.getCardLayoutMain().getEntityManager();
         
         if(selectedItem.equals("DVD")){
             List<Dvd> dvdList = em.createNamedQuery("Dvd.findByDirector").setParameter("director", jTextField3.getText()).getResultList();
             for(Dvd current : dvdList){
                model.addElement(current.getItem().getTitle());
             }
         }else if(selectedItem.equals("Book")){
             // Måste fixas, försöka koppla ihop authorID med item och sedan getTitle?....
             List<Author> bookAuthorList = em.createNamedQuery("Author.findByLastName").setParameter("lastName", jTextField3.getText()).getResultList();
             for(Author current : bookAuthorList){
                 for(Book currentBook : current.getBookCollection()){
                     model.addElement(currentBook.getItem().getTitle());
                 }
             } 
         }
    }//GEN-LAST:event_authorSearchActionPerformed

    private void genreSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreSearchActionPerformed
       
        //String genreType = jTextField4.getText(); helt oviktig rad egentligen?
        EntityManager em = this.getCardLayoutMain().getEntityManager();
        String selectedItem = (String)itemSelect.getSelectedItem();
        if(selectedItem.equals("DVD")){
            List<Dvd> dvdList = em.createNamedQuery("Dvd.findByGenre").setParameter("genre", jTextField4.getText()).getResultList();
            for(Dvd current : dvdList){
                model.addElement(current.getItem().getTitle());
            }
        }else if(selectedItem.equals("Book")){
            List<Book> bookList = em.createNamedQuery("Book.findAll").getResultList();
            for(Book current : bookList){
                List<Book> asd = (List)current.getTagCollection();
                for(Book curr: asd){
                model.addElement(curr.getItem().getTitle());
                }
            }
        }
    }//GEN-LAST:event_genreSearchActionPerformed

    private void isbnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnSearchActionPerformed
      
        EntityManager em = this.getCardLayoutMain().getEntityManager();
        List<Book> isbnList = em.createNamedQuery("Book.findByIsbn").setParameter("isbn", jTextField5.getText()).getResultList();
        
        for(Book current : isbnList){
            model.addElement(current.getItem().getTitle());
        }
    }//GEN-LAST:event_isbnSearchActionPerformed

    private void sendToLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToLogInActionPerformed
       
        Patron loggedIn = this.getCardLayoutMain().getPatronLoggedIn(); 
        if(loggedIn == null){
            switchToCard(LoginUI.class);
        }
    }//GEN-LAST:event_sendToLogInActionPerformed

    private void sendToLogInComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_sendToLogInComponentShown
        Patron loggedIn = this.getCardLayoutMain().getPatronLoggedIn();
        if(loggedIn == null){
            sendToLogIn.setVisible(true);
        }else{
            sendToLogIn.setVisible(false);
        }
    }//GEN-LAST:event_sendToLogInComponentShown

    private void lendItemTextComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_lendItemTextComponentShown
        Patron loggedIn = this.getCardLayoutMain().getPatronLoggedIn();
        if(loggedIn == null){
            lendItemText.setVisible(true);
        }else{
            lendItemText.setVisible(false);
        }
    }//GEN-LAST:event_lendItemTextComponentShown
    DefaultListModel lst2 = new DefaultListModel();
    private void loanAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanAddBtnActionPerformed
       
       lst2.addElement(resultList.getSelectedValue());
       toLoanList.setModel(lst2);   
       
    }//GEN-LAST:event_loanAddBtnActionPerformed

    private void toLoanListComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_toLoanListComponentShown
        Patron loggedIn = this.getCardLayoutMain().getPatronLoggedIn();
        if(loggedIn == null){
            lendItemText.setVisible(true);
        }else{
            lendItemText.setVisible(false);
        }
    }//GEN-LAST:event_toLoanListComponentShown

    private void jLabel9ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel9ComponentShown
        Patron loggedIn = this.getCardLayoutMain().getPatronLoggedIn();
        if(loggedIn == null){
            lendItemText.setVisible(true);
        }else{
            lendItemText.setVisible(false);
        }
    }//GEN-LAST:event_jLabel9ComponentShown

    private void loanButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_loanButtonComponentShown
        Patron loggedIn = this.getCardLayoutMain().getPatronLoggedIn();
        if(loggedIn == null){
            lendItemText.setVisible(true);
        }else{
            lendItemText.setVisible(false);
        }
    }//GEN-LAST:event_loanButtonComponentShown

    private void loanAddBtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_loanAddBtnComponentShown
        Patron loggedIn = this.getCardLayoutMain().getPatronLoggedIn();
        if(loggedIn == null){
            lendItemText.setVisible(true);
        }else{
            lendItemText.setVisible(false);
        }
    }//GEN-LAST:event_loanAddBtnComponentShown

    private void loanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanButtonActionPerformed
        
        switchToCard(CreateLoanUI.class);
        
    }//GEN-LAST:event_loanButtonActionPerformed
 
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton authorSearch;
    private javax.swing.JButton genreSearch;
    private javax.swing.JButton isbnSearch;
    private javax.swing.JComboBox<String> itemSelect;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lendItemText;
    private javax.swing.JButton loanAddBtn;
    private javax.swing.JButton loanButton;
    private javax.swing.JButton releaseYearSearch;
    private javax.swing.JList<String> resultList;
    private javax.swing.JButton sendToLogIn;
    private javax.swing.JButton titleSearch;
    private javax.swing.JList<String> toLoanList;
    // End of variables declaration//GEN-END:variables
    DefaultListModel<String> model = new DefaultListModel<>();
}
