package entites;

import java.sql.Date;

public class Reservation {
	public Reservation(Client client, int nbrnuit, Date dsortie, Date dentrer, int nbrch, int nbrjour, int nbrplace,
			String type) {
		super();
		this.client = client;
		this.nbrnuit = nbrnuit;
		this.dsortie = dsortie;
		this.dentrer = dentrer;
		this.nbrch = nbrch;
		this.nbrjour = nbrjour;
		this.nbrplace = nbrplace;
		this.type = type;
	}
	private Client client;
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public int getNbrnuit() {
		return nbrnuit;
	}
	public void setNbrnuit(int nbrnuit) {
		this.nbrnuit = nbrnuit;
	}
	public Date getDsortie() {
		return dsortie;
	}
	public void setDsortie(Date dsortie) {
		this.dsortie = dsortie;
	}
	public Date getDentrer() {
		return dentrer;
	}
	public void setDentrer(Date dentrer) {
		this.dentrer = dentrer;
	}
	public int getNbrch() {
		return nbrch;
	}
	public void setNbrch(int nbrch) {
		this.nbrch = nbrch;
	}
	public int getNbrjour() {
		return nbrjour;
	}
	public void setNbrjour(int nbrjour) {
		this.nbrjour = nbrjour;
	}
	public int getNbrplace() {
		return nbrplace;
	}
	public void setNbrplace(int nbrplace) {
		this.nbrplace = nbrplace;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private int nbrnuit;

	@Override
	public String toString() {
		return "Reservation [client=" + client + ", nbrnuit=" + nbrnuit + ", dsortie=" + dsortie + ", dentrer="
				+ dentrer + ", nbrch=" + nbrch + ", nbrjour=" + nbrjour + ", nbrplace=" + nbrplace + ", type=" + type
				+ "]";
	}
	private Date dsortie;
	private Date dentrer;
private int nbrch;
	private int nbrjour;
	private int nbrplace;
	private String type;
	


	

}
