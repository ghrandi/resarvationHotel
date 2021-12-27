package test;

import java.util.ArrayList;

import accesBD.clientDao;
import entites.Client;


public class test {

	
		public static void main(String[] args) {
			clientDao cdao= new clientDao();
			Client c1= new Client("malek","155vcc","223695c44","catrceBincaire");
			Client c2= new Client("motii","136cfd","xxq4","cash");
			Client c3= new Client("nassim","136cwdw","26336891","cash");
			//cdao.addClient(c2);
		//	System.out.println("*****Sauvegarde/MAJ du client c1");
		//	cdao.save(c2);
		//	System.out.println("*****Sauvegarde/MAJ du client c2");
			//cdao.save(c3);
			System.out.println("*****Sauvegarde/MAJ du client c3");

			//if(cdao.findById("malek")==null)
			//	System.out.println("***La client n'existe pas ***");
			//else System.out.println("La client a pour code :"+ cdao.findById("malek").getNom()+ "**nom="+cdao.findById("malek").getNom());
			cdao.updateClient(new Client("youusef","136cd","xxq4","cash"));
			cdao.delete("136cfd");
			//ArrayList<Client> lst=csdao.findAll() ;
			//for(Client me : lst ) {
			//System.out.println(me);
		//=====================================
		


}
		}

