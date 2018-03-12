/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;


/**
 *
 * @author escobar
 */
public class LineCmd  {

    private Integer qteAcheter;
    private String etatLineCmd;
    private Produit produit;
    private Commande commande;

    public LineCmd() {
    }


    public Integer getQteAcheter() {
        return qteAcheter;
    }

    public void setQteAcheter(Integer qteAcheter) {
        this.qteAcheter = qteAcheter;
    }

    public String getEtatLineCmd() {
        return etatLineCmd;
    }

    public void setEtatLineCmd(String etatLineCmd) {
        this.etatLineCmd = etatLineCmd;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }    
}
