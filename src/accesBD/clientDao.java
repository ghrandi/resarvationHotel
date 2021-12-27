package accesBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entites.	Client;

public class clientDao {
	
	public Client findById(String r) {//r: reference
		Client p= null;
		String s= "select * from tclient where cin=?"; 
		Connection cnx= SConnection.getInstance();
		PreparedStatement st= null;
		try {
			st = cnx.prepareStatement(s);
			st.setString(1, r);		
			ResultSet res=st.executeQuery();
			if (res.next()) //1,2 et 3 sont les n° de colonne ds la BD
				p = new Client(res.getString(1), res.getString(2), res.getString(3),res.getString(4));
				st.close(); 

			} catch (SQLException e) {
				System.out.println("**La requête  n'a pas pu être exécutée");
		}
		return p;
	}
//----------------

	public void updateClient (Client lc) {
		String rq= "update tclient set nom=? , numtel=? ,typepaiment=? where cin=?";
		Connection cnx= SConnection.getInstance();
		PreparedStatement st= null;
		int n=0;
		try {
		st = cnx.prepareStatement(rq);
		st.setString(1, lc.getNom());
		st.setString(2, lc.getNumtel());
		st.setString(3, lc.getTypepaiment());
		st.setString(4, lc.getCin());
		
		
		n= st.executeUpdate();
		st.close();
		} catch (SQLException e) {
		System.out.println("Exception dans modification d'un client ");
		}
		}
	
	public ArrayList<Client> findAll() {
		ArrayList lstmed= new ArrayList<Client>();
		Connection cnx=SConnection.getInstance();
		Client m= null;
		try {
		String req="select * from tclient ";
		PreparedStatement st=cnx.prepareStatement(req);
		ResultSet r= st.executeQuery();

		while (r.next()) {
		   m= new Client (r.getString(1),r.getString(2),r.getString(3),r.getString(4));
		   lstmed.add(m);
		   
		}
		st.close();
		}
		catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		finally {
			SConnection.close();
		}
		return lstmed;
		}
//----------------------------------------------
//delete: elle met le champ etat du produit ayant la référence 'r' à la valeur FALSE 	
	public void delete(String r) {//r: reference
		Connection cnx= SConnection.getInstance();
		String rq3= "delete from tclient where cin=?";
		PreparedStatement st;
		int n=0;
		try {
		st = cnx.prepareStatement(rq3);
		st.setString(1,r);
		n= st.executeUpdate();
		st.close();
		   System.out.println("La suppression du commande est effectue avec succe!");
		} catch (SQLException e) {
		System.out.println("Exception dans la suppression d'une client!!");
		}
		}
	public void addClient(Client c) {
		if(c==null)
		return;
		Connection cnx= SConnection.getInstance();
		String rq1 = "insert into tclient (nom,cin,numtel,typepaiment) values (?,?,?,?)";
		try {
		PreparedStatement stm2 = cnx.prepareStatement(rq1);
		stm2.setString(1,c.getNom());
		stm2.setString(2,c.getCin());
		stm2.setString(3,c.getNumtel());
		stm2.setString(4,c.getTypepaiment());
		int n=stm2.executeUpdate();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		}
}
		


