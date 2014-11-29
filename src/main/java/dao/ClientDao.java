package dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import db.HibernateUtils;
import domain.Client;
import domain.CommandeStatus;

public class ClientDao {

	
	private static Logger logger = LogManager.getLogger(ClientDao.class);
	

	public void createClient(Client client)
			throws Exception {

		logger.info("Creating client ...");
		
		Session session = HibernateUtils.getSession();

		session.beginTransaction();

		session.save(client);

		session.getTransaction().commit();

		HibernateUtils.closeSession(session);
		
		logger.info("Creat client ...");

	}
	
	
	public Client findClientById(Integer id) throws Exception {
		
		logger.info("Finding Client with id : "+id);

		Session session = HibernateUtils.getSession();
		
		Client result = (Client) session.get(Client.class, id);

		HibernateUtils.closeSession(session);
		
		if (result != null) {
			logger.info("Client found : "+ result);
		}else{
			logger.info("Client not found : ");
		}
		
		return result;
	}
	
	
	
}
