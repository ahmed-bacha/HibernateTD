package dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import db.HibernateUtils;
import domain.Commande;
import domain.CommandeStatus;
import domain.LigneCommande;

public class CommandeDao {

	private static Logger logger = LogManager.getLogger(CommandeDao.class);
	

	public void createLigneCommande(LigneCommande ligneCommande)
			throws Exception {

		Session session = HibernateUtils.getSession();

		session.beginTransaction();

		session.save(ligneCommande);

		session.getTransaction().commit();

		HibernateUtils.closeSession(session);

	}

	
	public LigneCommande findLigneCommandeById(Integer id) throws Exception {
		
		logger.info("Finding LigneCommande with id : "+id);

		Session session = HibernateUtils.getSession();
		
		LigneCommande result = (LigneCommande) session.get(LigneCommande.class, id);

		HibernateUtils.closeSession(session);
		
		if (result != null) {
			logger.info("Ligne commande found : "+ result);
		}else{
			logger.info("Ligne commande not found : ");
		}
		
		return result;
	}
	
	public void updateLigneCommande(LigneCommande ligneCommande) throws Exception{
		
		Session session = HibernateUtils.getSession();
		
		session.beginTransaction();
		
		session.merge(ligneCommande);
		
		session.getTransaction().commit();

		HibernateUtils.closeSession(session);
		
	}
	
	
	
	public void deleteLigneCommande(Integer id) throws Exception {

		Session session = HibernateUtils.getSession();

		session.beginTransaction();

		session.delete(this.findLigneCommandeById(id));

		session.getTransaction().commit();

		HibernateUtils.closeSession(session);

	}
	
	public void createCommandeStatus(CommandeStatus status)
			throws Exception {

		logger.info("Creating CommandeStatus ...");
		
		Session session = HibernateUtils.getSession();

		session.beginTransaction();

		session.save(status);

		session.getTransaction().commit();

		HibernateUtils.closeSession(session);
		
		logger.info("CommandeStatus created");

	}
	
	public CommandeStatus findCommandeStatusById(Integer id) throws Exception {
		
		logger.info("Finding LigneCommande with id : "+id);

		Session session = HibernateUtils.getSession();
		
		CommandeStatus result = (CommandeStatus) session.get(CommandeStatus.class, id);

		HibernateUtils.closeSession(session);
		
		if (result != null) {
			logger.info("Ligne commande found : "+ result);
		}else{
			logger.info("Ligne commande not found : ");
		}
		
		return result;
	}
	
	public void createCommande(Commande commande)
			throws Exception {

		logger.info("Creating Commande ...");
		
		Session session = HibernateUtils.getSession();

		session.beginTransaction();

		session.save(commande);

		session.getTransaction().commit();

		HibernateUtils.closeSession(session);
		
		logger.info("Commande created");

	}
	
	public void updateCommande(Commande commande) throws Exception{
		
		Session session = HibernateUtils.getSession();
		
		session.beginTransaction();
		
		session.merge(commande);
		
		session.getTransaction().commit();

		HibernateUtils.closeSession(session);
		
	}
	
public Commande findCommandeById(Integer id) throws Exception {
		
		logger.info("Finding Commande with id : "+id);

		Session session = HibernateUtils.getSession();
		
		Commande result = (Commande) session.get(Commande.class, id);

		HibernateUtils.closeSession(session);
		
		if (result != null) {
			logger.info("commande found : "+ result);
		}else{
			logger.info("commande not found : ");
		}
		
		return result;
	}
	
	
	
	
}
