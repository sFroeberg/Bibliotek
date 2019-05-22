package entities;

import UI.CardLayoutMain;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "Item")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Item.findAll", query = "SELECT i FROM Item i")
    , @NamedQuery(name = "Item.findByBarcode", query = "SELECT i FROM Item i WHERE i.barcode = :barcode")
    , @NamedQuery(name = "Item.findByTitle", query = "SELECT i FROM Item i WHERE i.title = :title")
    , @NamedQuery(name = "Item.findByLocation", query = "SELECT i FROM Item i WHERE i.location = :location")
    , @NamedQuery(name = "Item.findByReleaseYear", query = "SELECT i FROM Item i WHERE i.releaseYear = :releaseYear")})

public class Item implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "barcode")
    private String barcode;
    @Basic(optional = false)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @Column(name = "location")
    private String location;
    @Basic(optional = false)
    @Lob
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "releaseYear")
    @Temporal(TemporalType.DATE)
    private Date releaseYear;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "item")
    private Collection<ItemLoan> itemLoanCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "item")
    private Book book;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "item")
    private Dvd dvd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itembarcode")
    private Collection<Reservation> reservationCollection;

    public Item() {
    }

    public Item(String barcode) {
        this.barcode = barcode;
    }

    public Item(String barcode, String title, String location, String description, Date releaseYear) {
        this.barcode = barcode;
        this.title = title;
        this.location = location;
        this.description = description;
        this.releaseYear = releaseYear;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }

    @XmlTransient
    public Collection<ItemLoan> getItemLoanCollection() {
        return itemLoanCollection;
    }

    public void setItemLoanCollection(Collection<ItemLoan> itemLoanCollection) {
        this.itemLoanCollection = itemLoanCollection;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Dvd getDvd() {
        return dvd;
    }

    public void setDvd(Dvd dvd) {
        this.dvd = dvd;
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
        hash += (barcode != null ? barcode.hashCode() : 0);
        return hash;
    }
    
    public boolean isOnLoan(){
        Collection<ItemLoan> itemLoans = this.getItemLoanCollection();
        for(ItemLoan current : itemLoans){
            if(current.getReturned() == null){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.barcode == null && other.barcode != null) || (this.barcode != null && !this.barcode.equals(other.barcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return title;
    }
    
}
