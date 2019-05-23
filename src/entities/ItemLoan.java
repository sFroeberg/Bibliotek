package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "Item_Loan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItemLoan.findAll", query = "SELECT i FROM ItemLoan i")
    , @NamedQuery(name = "ItemLoan.findByItemBarcode", query = "SELECT i FROM ItemLoan i WHERE i.itemLoanPK.itemBarcode = :itemBarcode")
    , @NamedQuery(name = "ItemLoan.findByLoanId", query = "SELECT i FROM ItemLoan i WHERE i.itemLoanPK.loanId = :loanId")
    , @NamedQuery(name = "ItemLoan.findAllNotReturned", query = "SELECT i FROM ItemLoan i WHERE i.returned IS NULL")
    , @NamedQuery(name = "ItemLoan.findByReturned", query = "SELECT i FROM ItemLoan i WHERE i.returned = :returned")})
public class ItemLoan implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ItemLoanPK itemLoanPK;
    @Column(name = "returned")
    @Temporal(TemporalType.TIMESTAMP)
    private Date returned;
    @JoinColumn(name = "itemBarcode", referencedColumnName = "barcode", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Item item;
    @JoinColumn(name = "loanId", referencedColumnName = "loanId", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Loan loan;

    public ItemLoan() {
    }

    public ItemLoan(ItemLoanPK itemLoanPK) {
        this.itemLoanPK = itemLoanPK;
    }

    public ItemLoan(String itemBarcode, int loanId) {
        this.itemLoanPK = new ItemLoanPK(itemBarcode, loanId);
    }

    public ItemLoanPK getItemLoanPK() {
        return itemLoanPK;
    }

    public void setItemLoanPK(ItemLoanPK itemLoanPK) {
        this.itemLoanPK = itemLoanPK;
    }

    public Date getReturned() {
        return returned;
    }

    public void setReturned(Date returned) {
        this.returned = returned;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemLoanPK != null ? itemLoanPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ItemLoan)) {
            return false;
        }
        ItemLoan other = (ItemLoan) object;
        if ((this.itemLoanPK == null && other.itemLoanPK != null) || (this.itemLoanPK != null && !this.itemLoanPK.equals(other.itemLoanPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ItemLoan[ itemLoanPK=" + itemLoanPK + " ]";
    }
    
}
