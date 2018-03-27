/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.view.folder;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author aziz
 */
public class Morabba3s8irController implements Initializable {

    @FXML
    private VBox prod;
    @FXML
    private ImageView image;
    @FXML
    private Text nom;
    @FXML
    private Text cat;
    @FXML
    private Text qte;
    @FXML
    private Text prix;
    @FXML
    private Text patnom;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        File file = new File("C:/wamp64/www/final/web/public/uploads/brochures/Produit/a18bd01eef49479340fa39143532b1b2.jpeg");
        Image img = new Image(file.toURI().toString());
        image.setImage(img);

    }    

    public void setNom(String nom) {
        this.nom.setText(nom);
    }

  public void setImage(Image image) {
        this.image.setImage(image);
    }

   
    public void setCat(String cat) {
        this.cat.setText(cat);
    }

    public void setQte(String qte) {
        this.qte.setText(qte);
    }

    public void setPrix(String prix) {
        this.prix.setText(prix);
    }

    public void setPatnom(String patnom) {
        this.patnom.setText(patnom);
    }
    
    
}
