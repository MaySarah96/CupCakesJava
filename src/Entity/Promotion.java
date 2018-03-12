/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Collection;
/**
 *
 * @author escobar
 */
public class Promotion {

    private Integer idPromo;
    private Double tauxPromo;
    private String etatPromo;
    private Collection<LinePromo> linePromoCollection;
    private Collection<Session> sessionCollection;

    public Promotion() {
    }

    public Promotion(Integer idPromo) {
        this.idPromo = idPromo;
    }

    public Integer getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(Integer idPromo) {
        this.idPromo = idPromo;
    }

    public Double getTauxPromo() {
        return tauxPromo;
    }

    public void setTauxPromo(Double tauxPromo) {
        this.tauxPromo = tauxPromo;
    }

    public String getEtatPromo() {
        return etatPromo;
    }

    public void setEtatPromo(String etatPromo) {
        this.etatPromo = etatPromo;
    }

    public Collection<LinePromo> getLinePromoCollection() {
        return linePromoCollection;
    }

    public void setLinePromoCollection(Collection<LinePromo> linePromoCollection) {
        this.linePromoCollection = linePromoCollection;
    }

    public Collection<Session> getSessionCollection() {
        return sessionCollection;
    }

    public void setSessionCollection(Collection<Session> sessionCollection) {
        this.sessionCollection = sessionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPromo != null ? idPromo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Promotion)) {
            return false;
        }
        Promotion other = (Promotion) object;
        if ((this.idPromo == null && other.idPromo != null) || (this.idPromo != null && !this.idPromo.equals(other.idPromo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Promotion[ idPromo=" + idPromo + " ]";
    }
    
}
