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
@Table(name = "patron")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patron.findAll", query = "SELECT p FROM Patron p")
    , @NamedQuery(name = "Patron.findByPatronId", query = "SELECT p FROM Patron p WHERE p.patronId = :patronId")
    , @NamedQuery(name = "Patron.findByFirstName", query = "SELECT p FROM Patron p WHERE p.firstName = :firstName")
    , @NamedQuery(name = "Patron.findByLastName", query = "SELECT p FROM Patron p WHERE p.lastName = :lastName")
    , @NamedQuery(name = "Patron.findByEmail", query = "SELECT p FROM Patron p WHERE p.email = :email")
    , @NamedQuery(name = "Patron.findByTelnr", query = "SELECT p FROM Patron p WHERE p.telnr = :telnr")
    , @NamedQuery(name = "Patron.findByDob", query = "SELECT p FROM Patron p WHERE p.dob = :dob")
    , @NamedQuery(name = "Patron.findByEmailAndPassword", query = "SELECT p FROM Patron p WHERE p.email = :email AND p.password = :password")
    , @NamedQuery(name = "Patron.findByCreated", query = "SELECT p FROM Patron p WHERE p.created = :created")})
public class Patron implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "patronId")
    private Integer patronId;
    @Basic(optional = false)
    @Column(name = "firstName")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "telnr")
    private String telnr;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Basic(optional = false)
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patronId")
    private Collection<Loan> loanCollection;
    @JoinColumn(name = "patronTypeId", referencedColumnName = "patronTypeId")
    @ManyToOne(optional = false)
    private PatronType patronTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patronId")
    private Collection<Reservation> reservationCollection;

    public Patron() {
    }

    public Patron(Integer patronId) {
        this.patronId = patronId;
    }

    public Patron(Integer patronId, String firstName, String lastName, Date dob, Date created) {
        this.patronId = patronId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.created = created;
        this.password = password;
    }

    public Integer getPatronId() {
        return patronId;
    }

    public void setPatronId(Integer patronId) {
        this.patronId = patronId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelnr() {
        return telnr;
    }

    public void setTelnr(String telnr) {
        this.telnr = telnr;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @XmlTransient
    public Collection<Loan> getLoanCollection() {
        return loanCollection;
    }

    public void setLoanCollection(Collection<Loan> loanCollection) {
        this.loanCollection = loanCollection;
    }

    public PatronType getPatronTypeId() {
        return patronTypeId;
    }

    public void setPatronTypeId(PatronType patronTypeId) {
        this.patronTypeId = patronTypeId;
    }

    @XmlTransient
    public Collection<Reservation> getReservationCollection() {
        return reservationCollection;
    }

    public void setReservationCollection(Collection<Reservation> reservationCollection) {
        this.reservationCollection = reservationCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patronId != null ? patronId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patron)) {
            return false;
        }
        Patron other = (Patron) object;
        if ((this.patronId == null && other.patronId != null) || (this.patronId != null && !this.patronId.equals(other.patronId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Patron[ patronId=" + patronId + " ]";
    }
    
}
