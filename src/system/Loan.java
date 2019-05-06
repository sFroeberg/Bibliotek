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
public class Loan {
    private int loadId, PatronId;

    public int getLoadId() {
        return loadId;
    }

    public void setLoadId(int loadId) {
        this.loadId = loadId;
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
    private Date created;
    
}
