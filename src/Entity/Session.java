/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Collection;
import java.util.Date;

/**
 *
 * @author escobar
 */
public class Session {
    private Integer idSes;
    private Date dateDebSes;
    private Date dateFinSes;
    private Integer capaciteSes;
    private String etatSes;
    private Promotion idPromo;
    private Formation idFor;
    private Collection<Educate> educateCollection;

    public Session() {
    }

    public Session(Integer idSes) {
        this.idSes = idSes;
    }

    public Integer getIdSes() {
        return idSes;
    }

    public void setIdSes(Integer idSes) {
        this.idSes = idSes;
    }

    public Date getDateDebSes() {
        return dateDebSes;
    }

    public void setDateDebSes(Date dateDebSes) {
        this.dateDebSes = dateDebSes;
    }

    public Date getDateFinSes() {
        return dateFinSes;
    }

    public void setDateFinSes(Date dateFinSes) {
        this.dateFinSes = dateFinSes;
    }

    public Integer getCapaciteSes() {
        return capaciteSes;
    }

    public void setCapaciteSes(Integer capaciteSes) {
        this.capaciteSes = capaciteSes;
    }

    public String getEtatSes() {
        return etatSes;
    }

    public void setEtatSes(String etatSes) {
        this.etatSes = etatSes;
    }

    public Promotion getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(Promotion idPromo) {
        this.idPromo = idPromo;
    }

    public Formation getIdFor() {
        return idFor;
    }

    public void setIdFor(Formation idFor) {
        this.idFor = idFor;
    }

    public Collection<Educate> getEducateCollection() {
        return educateCollection;
    }

    public void setEducateCollection(Collection<Educate> educateCollection) {
        this.educateCollection = educateCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSes != null ? idSes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Session)) {
            return false;
        }
        Session other = (Session) object;
        if ((this.idSes == null && other.idSes != null) || (this.idSes != null && !this.idSes.equals(other.idSes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Session[ idSes=" + idSes + " ]";
    }
    
}
