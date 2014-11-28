package org.hsqldb.hsqldb;

import java.util.Collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dao.FootDao;
import domain.Team;

/**
 * Hello world!
 *
 */
public class App {

	private static Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {

		logger.info("Getting all teams");

		FootDao dao = new FootDao();

		// Java 8
		dao.listAllTeams().stream().forEach(t -> logger.info(t));

		logger.info("Creating a new team");

		Team team = new Team();

		team.setName("OM");

		dao.createNewTeam(team);
		
		logger.info("Listing all teams");

		// Java 8
		dao.listAllTeams().stream().forEach(t -> logger.info(t));

		logger.info("List players of team : 5");

		// Java 8
		dao.listAllPlayersForTeam(5).stream().forEach(player -> logger.info(player));

	}
}
