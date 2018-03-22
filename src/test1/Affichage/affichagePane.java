/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.Affichage;

import Entity.Produit;
import Services.PanierService;
import Services.ProduitService;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author escobar
 */
public class affichagePane implements Initializable {

  
    @FXML
    private VBox vb;
    @FXML
    private HBox hbo;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            ProduitService crs = new ProduitService();
            List<Produit> listeCatR = crs.AfficherNomProduit();
            Node [] nodes = new Node[listeCatR.size()];
            int i = 0;
            for (Produit c : listeCatR){
                
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Kaaboura.fxml"));
                nodes[i] = loader.load() ;
                KaabouraController c1 =loader.getController();
                File file = new File("C:/wamp3/www/CupCakesF/web/public/uploads/brochures/Produit/" + c.getImageprod());
                Image image = new Image(file.toURI().toString());
                c1.setImage(image);
                c1.setLab(c.getNomProd());
                Button b = c1.getDet();
               
                b.setOnAction(e->{
                    try {
                        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("produitsingle.fxml"));
                        Parent root = loader1.load();
                        ProduitsingleController c2 =loader1.getController();
                        vb.getScene().setRoot(root);
                        c2.setNomProd(c.getNomProd());
                        c2.setImagprod(image);
                        c2.setProxProd(c.getPrixProd());
                        Button panier = c2.getPanier();
                        panier.setOnAction(f->{
                        PanierService pan = new PanierService();
                         pan.ajouterArticle(c, 1);
                            System.out.println("panier ajouter");
                            Integer Tot = pan.calculerPanier();
           System.out.println("total = " + Tot);
                        });
                    } catch (IOException ex) {
                        Logger.getLogger(affichagePane.class.getName()).log(Level.SEVERE, null, ex);
                    }
});

                hbo.getChildren().add(nodes[i]);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(affichagePane.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(affichagePane.class.getName()).log(Level.SEVERE, null, ex);
        }
    }      
    
}    

