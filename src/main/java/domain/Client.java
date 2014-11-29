package domain;

import java.util.HashSet;
import java.util.Set;

public class Client {
	
	private Integer id;
	
	private Integer numeroClient;
	
	private Set<Commande> commandes; 
	
	private Set<Event> invitations; 

	public Client() {
		super();
		// TODO Auto-generated constructor stub
		commandes = new HashSet<Commande>();
		
		invitations = new HashSet<Event>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroClient() {
		return numeroClient;
	}

	public void setNumeroClient(Integer numeroClient) {
		this.numeroClient = numeroClient;
	}

	public Set<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(Set<Commande> listCommande) {
		this.commandes = listCommande;
	}
	
	public void ajouterCommande(Commande commande){
		
		this.commandes.add(commande);
		
		commande.setClient(this);
	}

	public Set<Event> getInvitations() {
		return invitations;
	}

	public void setInvitations(Set<Event> invitations) {
		this.invitations = invitations;
	}

}
