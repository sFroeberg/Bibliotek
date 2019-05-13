package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "loan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Loan.findAll", query = "SELECT l FROM Loan l")
    , @NamedQuery(name = "Loan.findByLoanId", query = "SELECT l FROM Loan l WHERE l.loanId = :loanId")
    , @NamedQuery(name = "Loan.findByCreated", query = "SELECT l FROM Loan l WHERE l.created = :created")})
public class Loan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "loanId")
    private Integer loanId;
    @Basic(optional = false)
    @Column(name = "created")
    @Temporal(TemporalType.DATE)
    private Date created;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "loan")
    private Collection<ItemLoan> itemLoanCollection;
    @JoinColumn(name = "PatronId", referencedColumnName = "patronId")
    @ManyToOne(optional = false)
    private Patron patronId;

    public Loan() {
    }

    public Loan(Integer loanId) {
        this.loanId = loanId;
    }

    public Loan(Integer loanId, Date created) {
        this.loanId = loanId;
        this.created = created;
    }

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @XmlTransient
    public Collection<ItemLoan> getItemLoanCollection() {
        return itemLoanCollection;
    }

    public void setItemLoanCollection(Collection<ItemLoan> itemLoanCollection) {
        this.itemLoanCollection = itemLoanCollection;
    }

    public Patron getPatronId() {
        return patronId;
    }

    public void setPatronId(Patron patronId) {
        this.patronId = patronId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loanId != null ? loanId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Loan)) {
            return false;
        }
        Loan other = (Loan) object;
        if ((this.loanId == null && other.loanId != null) || (this.loanId != null && !this.loanId.equals(other.loanId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Loan[ loanId=" + loanId + " ]";
    }
    
}
