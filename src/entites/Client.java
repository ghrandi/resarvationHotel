package entites;

public class Client {
	
	private String nom;
	private String cin;
	private String numtel;
	private String typepaiment;
	

	
	
	
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", cin=" + cin + ", numtel=" + numtel + ", typepaiment=" + typepaiment + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cin == null) ? 0 : cin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (cin == null) {
			if (other.cin != null)
				return false;
		} else if (!cin.equals(other.cin))
			return false;
		return true;
	}

	public Client(String nom, String cin, String numtel, String typepaiment) {
		super();
		this.nom = nom;
		this.cin = cin;
		this.numtel = numtel;
		this.typepaiment = typepaiment;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNumtel() {
		return numtel;
	}
	public void setNumtel(String numtel) {
		this.numtel = numtel;
	}
	public String getTypepaiment() {
		return typepaiment;
	}
	public void setTypepaiment(String typepaiment) {
		this.typepaiment = typepaiment;
	}
	

}
