package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "Patron_Type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PatronType.findAll", query = "SELECT p FROM PatronType p")
    , @NamedQuery(name = "PatronType.findByPatronTypeId", query = "SELECT p FROM PatronType p WHERE p.patronTypeId = :patronTypeId")
    , @NamedQuery(name = "PatronType.findByName", query = "SELECT p FROM PatronType p WHERE p.name = :name")
    , @NamedQuery(name = "PatronType.findByMaxLoans", query = "SELECT p FROM PatronType p WHERE p.maxLoans = :maxLoans")})
public class PatronType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "patronTypeId")
    private Integer patronTypeId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "maxLoans")
    private int maxLoans;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patronTypeId")
    private Collection<Patron> patronCollection;

    public PatronType() {
    }

    public PatronType(Integer patronTypeId) {
        this.patronTypeId = patronTypeId;
    }

    public PatronType(Integer patronTypeId, String name, int maxLoans) {
        this.patronTypeId = patronTypeId;
        this.name = name;
        this.maxLoans = maxLoans;
    }

    public Integer getPatronTypeId() {
        return patronTypeId;
    }

    public void setPatronTypeId(Integer patronTypeId) {
        this.patronTypeId = patronTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxLoans() {
        return maxLoans;
    }

    public void setMaxLoans(int maxLoans) {
        this.maxLoans = maxLoans;
    }

    @XmlTransient
    public Collection<Patron> getPatronCollection() {
        return patronCollection;
    }

    public void setPatronCollection(Collection<Patron> patronCollection) {
        this.patronCollection = patronCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patronTypeId != null ? patronTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PatronType)) {
            return false;
        }
        PatronType other = (PatronType) object;
        if ((this.patronTypeId == null && other.patronTypeId != null) || (this.patronTypeId != null && !this.patronTypeId.equals(other.patronTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getName();
    }
    
}
