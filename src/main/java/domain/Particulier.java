package domain;

public class Particulier extends Client {
	
	private String nom;
	
	private String prenom;
	
	
	public Particulier() {
		super();
	}

	public Particulier(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Particulier [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	

}
