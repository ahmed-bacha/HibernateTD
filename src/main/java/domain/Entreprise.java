package domain;

public class Entreprise extends Client {
	
	private String siret;

	public Entreprise() {
		super();
		this.siret = "";
	}
	
	
	public Entreprise(String siret) {
		super();
		this.siret = siret;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}


	@Override
	public String toString() {
		return "Entreprise [siret=" + siret + "]";
	}



}
