/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author escobar
 */
public class CategorieRec {
    
    private Integer idCatRec;
    private String nomCatRec;
    private Collection<Recette> recetteCollection;

    public CategorieRec() {
    }

    public CategorieRec(Integer idCatRec) {
        this.idCatRec = idCatRec;
    }

    public Integer getIdCatRec() {
        return idCatRec;
    }

    public void setIdCatRec(Integer idCatRec) {
        this.idCatRec = idCatRec;
    }

    public String getNomCatRec() {
        return nomCatRec;
    }

    public void setNomCatRec(String nomCatRec) {
        this.nomCatRec = nomCatRec;
    }

    public Collection<Recette> getRecetteCollection() {
        return recetteCollection;
    }

    public void setRecetteCollection(Collection<Recette> recetteCollection) {
        this.recetteCollection = recetteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatRec != null ? idCatRec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategorieRec)) {
            return false;
        }
        CategorieRec other = (CategorieRec) object;
        if ((this.idCatRec == null && other.idCatRec != null) || (this.idCatRec != null && !this.idCatRec.equals(other.idCatRec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.CategorieRec[ idCatRec=" + idCatRec + " ]";
    }
    
}
