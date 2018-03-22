/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.BackPat;

import Entity.Produit;
import Services.ProduitService;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

/**
 * FXML Controller class
 *
 * @author escobar
 */
public class AjoutProdController extends AnchorPane {

    @FXML
    private JFXTextField nomProd;
    @FXML
    private JFXTextField qteStock;
    @FXML
    private JFXTextField prixprod;
    @FXML
    private JFXTextField typProd;
    @FXML
    private JFXButton image;
   
    
    
    /**
     * Initializes the controller class.
     */
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    String imagef="";
    @FXML
    private void AjouterImage(ActionEvent event) throws IOException {
          FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open Resource File");
         fileChooser.getExtensionFilters().addAll(
         new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg" ,"*.jpeg"));
       
        File f = fileChooser.showOpenDialog(null);
         if (f != null){
     System.out.println(f.getName());
                     }
         imagef = f.getName();
         File fd = new File("C:/wamp3/www/CupCakesF/web/public/uploads/brochures/Produit/"+f.getName());

         Files.copy(f.getAbsoluteFile().toPath(),fd.getAbsoluteFile().toPath());
    }
    
    @FXML
    private void Ajouter(ActionEvent event) throws SQLException, IOException {
        ProduitService ps = new ProduitService();
  
        Produit p = new Produit(nomProd.getText(),(double)Integer.parseInt(qteStock.getText()),typProd.getText(),Integer.parseInt(prixprod.getText()) , 0, "vrai", 0, 0,imagef);
        ps.AjouterProduit(p);
        System.out.println("c bon");
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Succées");
        alert.setHeaderText(null);
        alert.setContentText("Produit insérée avec succés!");
        alert.show();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AfficherProd.FXML"));
        Parent root = loader.load();
        nomProd.getScene().setRoot(root);

    }
}
