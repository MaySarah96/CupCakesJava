/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.Feedback;

import Entity.Commande;
import Entity.FeedBack;
import Services.FeedbackService;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import test1.Panier.CommandePane;

/**
 *
 * @author escobar
 */
public class FeedbackPane extends AnchorPane {
    @FXML
    private Button button;
    @FXML
    private TextField Sujet;
    @FXML
    private TextArea Desc;

    /**
     * Initializes the controller class.
     */
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public FeedbackPane() {
        
    }
    

    @FXML
    private void Envoyer(ActionEvent event) {
        FeedbackService feedback = new FeedbackService();
        String sujet = Sujet.getText();
        String desc = Desc.getText();
        FeedBack f = new FeedBack(sujet,desc);
        try {
            feedback.AjouterFeedback(f);
        } catch (SQLException ex) {
            Logger.getLogger(CommandePane.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

}
