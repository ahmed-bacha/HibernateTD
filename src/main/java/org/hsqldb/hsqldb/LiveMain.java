package org.hsqldb.hsqldb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import dao.CommandeDao;
import db.HibernateUtils;
import domain.LigneCommande;

public class LiveMain {
	
	private static Logger logger = LogManager.getLogger(LiveMain.class);

	public static void main(String[] args) {
		
		try {
			
			CommandeDao commandeDao = new CommandeDao();
			
			// CREATE LIGNES
			
			LigneCommande lc_1  = new LigneCommande();
			
			lc_1.setLabel("Livres");
			lc_1.setQuantite(200);
			
			LigneCommande lc_2  = new LigneCommande();
			
			lc_2.setLabel("HDD");
			lc_2.setQuantite(30);
			
			commandeDao.createLigneCommande(lc_1);
			commandeDao.createLigneCommande(lc_2);
			
			// READ,GET LIGNES
			
			
			LigneCommande lc1 = commandeDao.findLigneCommandeById(4);
			
			logger.info(lc1);
			
			// Update
			
			lc1.setLabel("Bloom");
			
			commandeDao.updateLigneCommande(lc1);
			
			
			// Delete
			
			//commandeDao.deleteLigneCommande(4);
			
		
			HibernateUtils.tearDown();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		

	}

}
