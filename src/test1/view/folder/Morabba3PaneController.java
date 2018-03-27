/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.view.folder;

import Entity.CategorieRec;
import Entity.Produit;
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
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author aziz
 */
public class Morabba3PaneController implements Initializable {

    @FXML
    private VBox body;
    @FXML
    private HBox nav_search;
    @FXML
    private HBox nav_body;
    @FXML
    private VBox section_body;
    @FXML
    private HBox nav_cat;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            ProduitService ProdL = new ProduitService();
            List<Produit> listP = ProdL.AfficherNomProduit();
            Node [] nodesLigne = new Node[3];
            Node [] nodesColonne = new Node[9];
            int i = 0 ;
            int j = 0 ;
            FXMLLoader loaderItems = null ;
            Hbox_ItemsController hc = new Hbox_ItemsController();
            for(Produit prod : listP)
            {
                //condition just n7ebbou yafichi max 9 produit walla eli howa :p
                if(j == 2 )
                    return ;
                
                // parcour des lignes 
                if ( i % 3 == 0 || i == 0)
                {
                    loaderItems = new FXMLLoader(getClass().getResource("Hbox_Items.fxml"));
                    nodesLigne[j] = loaderItems.load() ;
                }
                hc = loaderItems.getController();
                
                //parcour des colonnes
                FXMLLoader loader = new FXMLLoader(getClass().getResource("morabba3s8ir.fxml"));
                nodesColonne[i] = loader.load() ;
                Morabba3s8irController msc = loader.getController();
                File file = new File("C:/wamp3/www/CupCakesF/web/public/uploads/brochures/Produit/" + prod.getImageprod());
                Image image = new Image(file.toURI().toString());
                msc.setNom(prod.getNomProd());
                msc.setImage(image);
                msc.setCat(prod.getIdCat().getNomCat());
                msc.setPatnom(prod.getIdUser().getUsername());
                msc.setQte(prod.getQteStockProd().toString());
                msc.setPrix(prod.getPrixProd().toString());
                hc.addColonne(nodesColonne[i]);
                i++;
                if( listP.size() > i)
                {
                    if ( i % 3 == 0 ){
                        section_body.getChildren().add(nodesLigne[j]);
                        j++;
                    }
                }
                else
                {
                    if ( i % 3 != 0 )
                        section_body.getChildren().add(nodesLigne[j]);
                }
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(Morabba3PaneController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Morabba3PaneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
}
