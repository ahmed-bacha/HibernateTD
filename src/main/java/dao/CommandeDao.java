package dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import db.HibernateUtils;
import domain.LigneCommande;

public class CommandeDao {

	private static Logger logger = LogManager.getLogger(CommandeDao.class);
	
	public CommandeDao() throws Exception{
		HibernateUtils.setUp();
	}

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
	
	
	
}
