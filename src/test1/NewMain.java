/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import Entity.Commande;
import Entity.FeedBack;
import Entity.Produit;
import Services.CommandeService;
import Services.FeedbackService;
import Services.PanierService;
import Services.ProduitService;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author escobar
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            PanierService pan = new PanierService();
            CommandeService cs = new CommandeService();
            FeedbackService fs = new FeedbackService();
            ProduitService ps = new ProduitService();
        try {
            Produit p = new Produit("haja bnina",(double)15.2,"piece",30,"vrai");
            ps.AjouterProduit(p);
            
            pan.ajouterArticle(p, 9);
           Integer Tot = pan.calculerPanier();
           System.out.println("total = " + Tot);
            Map <Produit,Integer> panier = pan.Afficher();
           for(Map.Entry<Produit, Integer> entry : panier.entrySet())
	{
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
            Commande commandes = new Commande(5,"en preparation");
            cs.ModifierEtatCommande(commandes);
            cs.SupprimerComande(commandes);
            List<FeedBack> listFb = fs.AfficherFeedBack();
            for (FeedBack f : listFb)
                   System.out.println(f);
            List<Entity.Commande> listCmd;
              listCmd = cs.AfficherCommande();
              for (Entity.Commande cmd : listCmd)
                System.out.println(cmd);
             } catch (SQLException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
    
}
