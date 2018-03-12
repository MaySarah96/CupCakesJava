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

public class Note {

    private Double note;
    private Date dateNote;
    private String etatNote;
    private Recette recette;
    private Utilisateur utilisateur;

    public Note() {
    }

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }

    public Date getDateNote() {
        return dateNote;
    }

    public void setDateNote(Date dateNote) {
        this.dateNote = dateNote;
    }

    public String getEtatNote() {
        return etatNote;
    }

    public void setEtatNote(String etatNote) {
        this.etatNote = etatNote;
    }

    public Recette getRecette() {
        return recette;
    }

    public void setRecette(Recette recette) {
        this.recette = recette;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

  
}
