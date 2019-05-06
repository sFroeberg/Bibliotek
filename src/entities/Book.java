/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author froeb
 */
@Entity
@Table(name = "book")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b")
    , @NamedQuery(name = "Book.findByItembarcode", query = "SELECT b FROM Book b WHERE b.itembarcode = :itembarcode")
    , @NamedQuery(name = "Book.findByIsbn", query = "SELECT b FROM Book b WHERE b.isbn = :isbn")})
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Itembarcode")
    private String itembarcode;
    @Column(name = "ISBN")
    private String isbn;
    @JoinTable(name = "book_author", joinColumns = {
        @JoinColumn(name = "BookItembarcode", referencedColumnName = "Itembarcode")}, inverseJoinColumns = {
        @JoinColumn(name = "AuthorId", referencedColumnName = "authorId")})
    @ManyToMany
    private Collection<Author> authorCollection;
    @JoinTable(name = "tag_book", joinColumns = {
        @JoinColumn(name = "BookItembarcode", referencedColumnName = "Itembarcode")}, inverseJoinColumns = {
        @JoinColumn(name = "Tagname", referencedColumnName = "name")})
    @ManyToMany
    private Collection<Tag> tagCollection;
    @JoinColumn(name = "bookTypeId", referencedColumnName = "bookTypeId")
    @ManyToOne(optional = false)
    private BookType bookTypeId;
    @JoinColumn(name = "Itembarcode", referencedColumnName = "barcode", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Item item;

    public Book() {
    }

    public Book(String itembarcode) {
        this.itembarcode = itembarcode;
    }

    public String getItembarcode() {
        return itembarcode;
    }

    public void setItembarcode(String itembarcode) {
        this.itembarcode = itembarcode;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @XmlTransient
    public Collection<Author> getAuthorCollection() {
        return authorCollection;
    }

    public void setAuthorCollection(Collection<Author> authorCollection) {
        this.authorCollection = authorCollection;
    }

    @XmlTransient
    public Collection<Tag> getTagCollection() {
        return tagCollection;
    }

    public void setTagCollection(Collection<Tag> tagCollection) {
        this.tagCollection = tagCollection;
    }

    public BookType getBookTypeId() {
        return bookTypeId;
    }

    public void setBookTypeId(BookType bookTypeId) {
        this.bookTypeId = bookTypeId;
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
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        if ((this.itembarcode == null && other.itembarcode != null) || (this.itembarcode != null && !this.itembarcode.equals(other.itembarcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Book[ itembarcode=" + itembarcode + " ]";
    }
    
}
