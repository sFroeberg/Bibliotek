package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "Dvd")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dvd.findAll", query = "SELECT d FROM Dvd d")
    , @NamedQuery(name = "Dvd.findByItembarcode", query = "SELECT d FROM Dvd d WHERE d.itembarcode = :itembarcode")
    , @NamedQuery(name = "Dvd.findByGenre", query = "SELECT d FROM Dvd d WHERE d.genre = :genre")
    , @NamedQuery(name = "Dvd.findByDirector", query = "SELECT d FROM Dvd d WHERE d.director = :director")
    , @NamedQuery(name = "Dvd.findByAgeLimit", query = "SELECT d FROM Dvd d WHERE d.ageLimit = :ageLimit")
    , @NamedQuery(name = "Dvd.findByProdCountry", query = "SELECT d FROM Dvd d WHERE d.prodCountry = :prodCountry")})
public class Dvd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Itembarcode")
    private String itembarcode;
    @Basic(optional = false)
    @Column(name = "genre")
    private String genre;
    @Basic(optional = false)
    @Column(name = "director")
    private String director;
    @Basic(optional = false)
    @Column(name = "ageLimit")
    private int ageLimit;
    @Basic(optional = false)
    @Column(name = "prodCountry")
    private String prodCountry;
    @JoinTable(name = "dvd_actor", joinColumns = {
        @JoinColumn(name = "DVDItembarcode", referencedColumnName = "Itembarcode")}, inverseJoinColumns = {
        @JoinColumn(name = "actorId", referencedColumnName = "actorId")})
    @ManyToMany
    private Collection<Actor> actorCollection;
    @JoinColumn(name = "Itembarcode", referencedColumnName = "barcode", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Item item;

    public Dvd() {
    }

    public Dvd(String itembarcode) {
        this.itembarcode = itembarcode;
    }

    public Dvd(String itembarcode, String genre, String director, int ageLimit, String prodCountry) {
        this.itembarcode = itembarcode;
        this.genre = genre;
        this.director = director;
        this.ageLimit = ageLimit;
        this.prodCountry = prodCountry;
    }

    public String getItembarcode() {
        return itembarcode;
    }

    public void setItembarcode(String itembarcode) {
        this.itembarcode = itembarcode;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getProdCountry() {
        return prodCountry;
    }

    public void setProdCountry(String prodCountry) {
        this.prodCountry = prodCountry;
    }

    @XmlTransient
    public Collection<Actor> getActorCollection() {
        return actorCollection;
    }

    public void setActorCollection(Collection<Actor> actorCollection) {
        this.actorCollection = actorCollection;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itembarcode != null ? itembarcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dvd)) {
            return false;
        }
        Dvd other = (Dvd) object;
        if ((this.itembarcode == null && other.itembarcode != null) || (this.itembarcode != null && !this.itembarcode.equals(other.itembarcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Dvd[ itembarcode=" + itembarcode + " ]";
    }
    
}
