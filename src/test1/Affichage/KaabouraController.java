/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.Affichage;

import Entity.CategorieRec;
import Services.ProduitService;
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
public class KaabouraController implements Initializable {

    @FXML
    private Label lab;
    @FXML
    private ImageView image;
    @FXML
    private Button det;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    } 

    public Label getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab.setText(lab);
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image.setImage(image);
    }

    public Button getDet() {
        return det;
    }

    public void setDet(Button det) {
        this.det = det;
    }


    
    
    
}
