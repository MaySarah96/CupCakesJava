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
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author escobar
 */
public class ProduitsingleController implements Initializable {

    @FXML
    private ImageView imagprod;
    @FXML
    private Label nomProd;
    @FXML
    private Label proxProd;
    @FXML
    private Button panier;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
 }    

    public ImageView getImagprod() {
        return imagprod;
    }

    public void setImagprod(Image imagprod) {
        this.imagprod.setImage(imagprod);
    }

    public Label getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd.setText(nomProd);
    }

    public Label getProxProd() {
        return proxProd;
    }

    public void setProxProd(int proxProd) {
        this.proxProd.setText(String.valueOf(proxProd));
    }

    public Button getPanier() {
        return panier;
    }

    public void setPanier(Button panier) {
        this.panier = panier;
    }

    @FXML
    private void panier(ActionEvent event) {
                    
    }
    
}
