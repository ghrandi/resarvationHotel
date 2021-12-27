
package accesBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class SConnection {
private static String url = "jdbc:mysql://localhost:3306/bdhotel";
private static String utilisateur= "root";
private static String motPasse="";
private static Connection cnx;
public static Connection getInstance()
{ 
try {
if(cnx==null || cnx.isClosed()) {
//V�rifier le chargement en m�moire du pilote JDBC
Class.forName("com.mysql.jdbc.Driver");
//Etablir la connexion
cnx=DriverManager.getConnection(url,utilisateur,motPasse);
System.out.println("Connexion � la base de donn�es "+cnx.getCatalog());
}}
catch (ClassNotFoundException e) { 
System.out.println("Classe Driver introuvable");
}
catch (SQLException e) {
System.out.println("L'�tablissement de la connexion a �chou�.");
}
return cnx;}
public static void close()
{
try{
if(cnx!=null && !cnx.isClosed()) {
cnx.close();}
}
catch(SQLException e){
System.out.print("Erreur lors de la fermeture de la connexion ");
}
}

}
