/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.util.Date;

/**
 *
 * @author froeb
 */
public class Reservation {
    private int reservationId, PatronId;
    private Date created;

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getPatronId() {
        return PatronId;
    }

    public void setPatronId(int PatronId) {
        this.PatronId = PatronId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getItembarcode() {
        return Itembarcode;
    }

    public void setItembarcode(String Itembarcode) {
        this.Itembarcode = Itembarcode;
    }
    private String Itembarcode;
    
}
