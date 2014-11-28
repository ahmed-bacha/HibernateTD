package domain;

public class LigneCommande {
	
	private Integer id;
	
	private Integer quantite;
	
	private String label;

	public LigneCommande(int id, int quantite, String label) {
		super();
		this.id = id;
		this.quantite = quantite;
		this.label = label;
	}
	
	public LigneCommande() {
		super();
	}
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getQuantite() {
		return quantite;
	}


	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "LigneCommande [id=" + id + ", quantite=" + quantite
				+ ", label=" + label + "]";
	}
	

}
