package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ItemLoanPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "itemBarcode")
    private String itemBarcode;
    @Basic(optional = false)
    @Column(name = "loanId")
    private int loanId;

    public ItemLoanPK() {
    }

    public ItemLoanPK(String itemBarcode, int loanId) {
        this.itemBarcode = itemBarcode;
        this.loanId = loanId;
    }

    public String getItemBarcode() {
        return itemBarcode;
    }

    public void setItemBarcode(String itemBarcode) {
        this.itemBarcode = itemBarcode;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemBarcode != null ? itemBarcode.hashCode() : 0);
        hash += (int) loanId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemLoanPK)) {
            return false;
        }
        ItemLoanPK other = (ItemLoanPK) object;
        if ((this.itemBarcode == null && other.itemBarcode != null) || (this.itemBarcode != null && !this.itemBarcode.equals(other.itemBarcode))) {
            return false;
        }
        if (this.loanId != other.loanId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ItemLoanPK[ itemBarcode=" + itemBarcode + ", loanId=" + loanId + " ]";
    }
    
}
