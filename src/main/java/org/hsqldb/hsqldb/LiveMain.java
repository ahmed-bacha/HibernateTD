package org.hsqldb.hsqldb;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dao.ClientDao;
import dao.CommandeDao;
import db.HibernateUtils;
import domain.Commande;
import domain.CommandeStatus;
import domain.LigneCommande;
import domain.Particulier;

public class LiveMain {

	private static Logger logger = LogManager.getLogger(LiveMain.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {

			CommandeDao commandeDao = new CommandeDao();

			/*
			 * 
			 * // CREATE LIGNES
			 * 
			 * LigneCommande lc_1 = new LigneCommande();
			 * 
			 * lc_1.setLabel("Livres"); lc_1.setQuantite(200);
			 * 
			 * LigneCommande lc_2 = new LigneCommande();
			 * 
			 * lc_2.setLabel("HDD"); lc_2.setQuantite(30);
			 * 
			 * commandeDao.createLigneCommande(lc_1);
			 * commandeDao.createLigneCommande(lc_2);
			 * 
			 * // READ,GET LIGNES
			 * 
			 * 
			 * LigneCommande lc1 = commandeDao.findLigneCommandeById(4);
			 * 
			 * logger.info(lc1);
			 * 
			 * // Update
			 * 
			 * lc1.setLabel("Bloom");
			 * 
			 * commandeDao.updateLigneCommande(lc1);
			 * 
			 * 
			 * // Delete
			 * 
			 * //commandeDao.deleteLigneCommande(4);
			 */

			// Creation CommandStatus

			/*
			 * CommandeStatus status = new CommandeStatus();
			 * status.setLabel("En cours de preparation");
			 * 
			 * 
			 * commandeDao.createCommandeStatus(status);
			 */
			/*
			// Get CommandStatus by id
			CommandeStatus status = commandeDao.findCommandeStatusById(1);

			logger.info("CommandeStatus n-1 : " + status);
			Commande commande = new Commande();

			// Create ligne commande
			
			LigneCommande lc_1 = new LigneCommande();

			lc_1.setLabel("Livres");
			lc_1.setQuantite(200);

			LigneCommande lc_2 = new LigneCommande();

			lc_2.setLabel("HDD");
			lc_2.setQuantite(30);

			commande.addLigne(lc_1);
			commande.addLigne(lc_2);
			commande.setStatus(status);
			commande.setDate(new Date());
			
			commandeDao.createCommande(commande);
			
			// Update ligne commande
			
			Commande commande1 = commandeDao.findCommandeById(1);
			
			LigneCommande lc_3 = new LigneCommande();

			lc_1.setLabel("iPod Touch 5G");
			lc_1.setQuantite(33);
			
			commande1.addLigne(lc_3);
			
			CommandeStatus new_status = new CommandeStatus();
			status.setLabel("En cours d'expedition");
			
			commandeDao.createCommandeStatus(status);
			
			commande1.setStatus(new_status);
			
			commandeDao.updateCommande(commande1);
			*/
			
			HibernateUtils.setUp();
			
			ClientDao clientDao = new ClientDao();
			
			Particulier particulier = new Particulier();
			particulier.setNom("DAM");
			particulier.setPrenom("Soul");
			particulier.setNumeroClient(27800);
			
			CommandeStatus new_status = new CommandeStatus();
			new_status.setLabel("Sending");
			
			commandeDao.createCommandeStatus(new_status);
			
			Commande commande1 = new Commande();
			
			LigneCommande lc_1 = new LigneCommande();

			lc_1.setLabel("DVD");
			lc_1.setQuantite(23);
			
			commande1.addLigne(lc_1);
			commande1.setStatus(new_status);
			commande1.setDate(new Date());
			
			particulier.ajouterCommande(commande1);
			
			clientDao.createClient(particulier);
			
			/*
			Entreprise entreprise = new Entreprise();
			entreprise.setNumeroClient(656);
			entreprise.setSiret("STW-16634");
			
			clientDao.createClient(entreprise);
			*/

			HibernateUtils.tearDown();
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
