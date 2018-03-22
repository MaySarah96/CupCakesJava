/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.Panier;

import Services.CommandeService;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import Entity.Commande;
import javafx.event.ActionEvent;


/**
 *
 * @author escobar
 */
public class ListeCmdPane extends AnchorPane {
      @FXML
    private TextArea Liste;

    /**
     * Initializes the controller class.
     */
    public void initialize(URL url, ResourceBundle rb) {
           

    }    
    
    public ListeCmdPane() {
       
    }
    
    private void initialize() {
               
    }

    @FXML
    private void Afficher(ActionEvent event) {
               CommandeService cs = new CommandeService();
          try {
               List<Entity.Commande> listCmd;
              listCmd = cs.AfficherCommande();
               System.out.println("c bon");
                          for (Entity.Commande cmd : listCmd){

                            Liste.setText(cmd.toString());}

                          
          } catch (SQLException ex) {
              Logger.getLogger(ListeCmdPane.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
}
