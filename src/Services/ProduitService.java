/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entity.FeedBack;
import Entity.Produit;
import Technique.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author escobar
 */
public class ProduitService {
     public Connection con = DataSource.getInstance().getCon();
    private Statement ste ;
    
    public ProduitService(){
        try {
            ste =con.createStatement();

        } catch (SQLException ex) {
            Logger.getLogger(CommandeService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void AjouterProduit(Produit p) throws SQLException{
        String req ="INSERT INTO produit (nomProd,qteStockProd,typeProd,prixProd,etatProd,imageprod,QteAcheter,valeur,idUser,idCat) VALUES (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pre = con.prepareStatement(req);
        ResultSet rs = ste.executeQuery("SELECT * FROM Utilisateur WHERE id = 1");
       int id = 0;
       while(rs.next())
            id= rs.getInt("id");
        pre.setString(1, p.getNomProd());
        pre.setDouble(2, p.getQteStockProd());
        pre.setString(3, p.getTypeProd());
        pre.setInt(4, p.getPrixProd());
        pre.setString(5, p.getEtatProd());
        pre.setString(6, p.getImageprod());
        pre.setDouble(7, 0);
        pre.setDouble(8, 0);
        pre.setInt(9, id );
        pre.setInt(10, 1 );
        pre.executeUpdate();
        System.out.println("ajouter");
    }
    
    public List<Produit> AfficherNomProduit() throws SQLException{
        List<Produit> Prod = new ArrayList();
            try {
            ResultSet rs =ste.executeQuery("SELECT * FROM Produit") ;
            while(rs.next()){
            Prod.add(new Produit(rs.getString("nomProd"),rs.getInt("prixProd"),rs.getString("imageprod"),rs.getDouble("qteStockProd")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProduitService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Prod;
    }
}
