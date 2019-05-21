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
@Table(name = "Book_Type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BookType.findAll", query = "SELECT b FROM BookType b")
    , @NamedQuery(name = "BookType.findByBookTypeId", query = "SELECT b FROM BookType b WHERE b.bookTypeId = :bookTypeId")
    , @NamedQuery(name = "BookType.findByName", query = "SELECT b FROM BookType b WHERE b.name = :name")
    , @NamedQuery(name = "BookType.findByLoanDays", query = "SELECT b FROM BookType b WHERE b.loanDays = :loanDays")})
public class BookType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bookTypeId")
    private Integer bookTypeId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "loanDays")
    private int loanDays;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bookTypeId")
    private Collection<Book> bookCollection;

    public BookType() {
    }

    public BookType(Integer bookTypeId) {
        this.bookTypeId = bookTypeId;
    }

    public BookType(Integer bookTypeId, String name, int loanDays) {
        this.bookTypeId = bookTypeId;
        this.name = name;
        this.loanDays = loanDays;
    }

    public Integer getBookTypeId() {
        return bookTypeId;
    }

    public void setBookTypeId(Integer bookTypeId) {
        this.bookTypeId = bookTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLoanDays() {
        return loanDays;
    }

    public void setLoanDays(int loanDays) {
        this.loanDays = loanDays;
    }

    @XmlTransient
    public Collection<Book> getBookCollection() {
        return bookCollection;
    }

    public void setBookCollection(Collection<Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookTypeId != null ? bookTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof BookType)) {
            return false;
        }
        BookType other = (BookType) object;
        if ((this.bookTypeId == null && other.bookTypeId != null) || (this.bookTypeId != null && !this.bookTypeId.equals(other.bookTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
}
