package domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Commande {
	
	private Integer id;
	
	private Date date;
	
	private CommandeStatus status;
	
	private Set<LigneCommande> lignes;
	
	private Client client ;

	public Commande() {
		
		super();
		
		this.lignes = new HashSet<LigneCommande>();
	}
	
	public void addLigne(LigneCommande ligneCommande){
		
		this.lignes.add(ligneCommande);
	}
	
	public void removeLigne(LigneCommande ligneCommande){
		
		this.lignes.remove(ligneCommande);
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date2) {
		this.date = date2;
	}

	public CommandeStatus getStatus() {
		return status;
	}

	public void setStatus(CommandeStatus status) {
		this.status = status;
	}

	public Set<LigneCommande> getLignes() {
		return lignes;
	}

	public void setLignes(Set<LigneCommande> lignes) {
		this.lignes = lignes;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	

}
