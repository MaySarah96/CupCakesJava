/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author escobar
 */

public class Commentaire {

    private Integer idCmnt;
    private String descriptionCmnt;
    private Date dateCmnt;
    private String etatCmnt;
    private Recette idRec;
    private Utilisateur idUser;

    public Commentaire() {
    }

    public Commentaire(Integer idCmnt) {
        this.idCmnt = idCmnt;
    }

    public Integer getIdCmnt() {
        return idCmnt;
    }

    public void setIdCmnt(Integer idCmnt) {
        this.idCmnt = idCmnt;
    }

    public String getDescriptionCmnt() {
        return descriptionCmnt;
    }

    public void setDescriptionCmnt(String descriptionCmnt) {
        this.descriptionCmnt = descriptionCmnt;
    }

    public Date getDateCmnt() {
        return dateCmnt;
    }

    public void setDateCmnt(Date dateCmnt) {
        this.dateCmnt = dateCmnt;
    }

    public String getEtatCmnt() {
        return etatCmnt;
    }

    public void setEtatCmnt(String etatCmnt) {
        this.etatCmnt = etatCmnt;
    }

    public Recette getIdRec() {
        return idRec;
    }

    public void setIdRec(Recette idRec) {
        this.idRec = idRec;
    }

    public Utilisateur getIdUser() {
        return idUser;
    }

    public void setIdUser(Utilisateur idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCmnt != null ? idCmnt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commentaire)) {
            return false;
        }
        Commentaire other = (Commentaire) object;
        if ((this.idCmnt == null && other.idCmnt != null) || (this.idCmnt != null && !this.idCmnt.equals(other.idCmnt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Commentaire[ idCmnt=" + idCmnt + " ]";
    }
    
}
