/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

/**
 *
 * @author froeb
 */
public class DVD extends Item {
    private String genre;
    private String director;
    private int ageLimit;
    private String prodCountry;

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
}
