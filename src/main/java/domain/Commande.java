package domain;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class Commande {
	
	private Integer id;
	
	private Date date;
	
	private CommandeStatus status;
	
	private Set<LigneCommande> lignes;

	public Commande() {
		
		super();
		
		this.lignes = new HashSet<LigneCommande>();
	}
	
	public void addLigne(LigneCommande ligneCommande){
		
		this.lignes.add(ligneCommande);
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

	public void setDate(Date date) {
		this.date = date;
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
	
	
	
	

}
