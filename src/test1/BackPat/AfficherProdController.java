/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.BackPat;

import Entity.Produit;
import Services.ProduitService;
import java.io.File;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author escobar
 */
public class AfficherProdController implements Initializable {

    @FXML
    private TableColumn<File, Image> Image;
    @FXML
    private ImageView ImageV;
    @FXML
    private TableColumn<Produit, String> NomProduit;
    @FXML
    private TableColumn<Produit, Double> PrixUnitaire;
    @FXML
    private TableColumn<Produit, Double> QuantitéStock;
    @FXML
    private TableView<Produit> listProd;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            ProduitService ps = new ProduitService();
            ObservableList<Produit> listP = FXCollections.observableArrayList(ps.AfficherNomProduit());
            NomProduit.setCellValueFactory(new PropertyValueFactory<Produit,String>("nomProd"));
            PrixUnitaire.setCellValueFactory(new PropertyValueFactory<Produit,Double>("prixProd"));
            QuantitéStock.setCellValueFactory(new PropertyValueFactory<Produit,Double>("qteStockProd"));
            Image.setCellValueFactory(new Callback<CellDataFeatures<File, Image>, ObservableValue<Image>>() {
                @Override
                public ObservableValue<Image> call(CellDataFeatures<File, Image> p) {
                    File file = p.getValue();
                    return new SimpleObjectProperty<>(new Image(file.toURI().toString(), 100, 100, true, true, true));
                }
            });
            
             File file = new File("C:/wamp3/www/CupCakesF/web/public/uploads/brochures/Produit/" + "imageProd");
                Image image = new Image(file.toURI().toString());
                ImageV.setImage(image);

            listProd.setItems(listP);
        } catch (SQLException ex) {
            Logger.getLogger(AfficherProdController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }    
    
}
