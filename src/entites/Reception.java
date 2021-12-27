package entites;

public class Reception {
public  int Numchambre;
public Reception(int numchambre, Reservation reschambre, float tarif, Client nvclient) {
	super();
	Numchambre = numchambre;
	this.reschambre = reschambre;
	this.tarif = tarif;
	this.nvclient = nvclient;
}

public  Reservation reschambre;
public float tarif;
public 	Client nvclient;

	public Reception() {
		// TODO Auto-generated constructor stub
	}

}
