package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import db.DatabaseUtil;
import domain.Player;
import domain.Team;

public class FootDao {

	private static Logger logger = LogManager.getLogger(FootDao.class);

	public Collection<Team> listAllTeams() {

		Collection<Team> teams = new ArrayList<Team>();

		Connection conn = DatabaseUtil.getConnection();

		if (conn != null) {

			try {

				Statement st = conn.createStatement();

				String query = "SELECT * FROM TEAM";

				ResultSet rs = st.executeQuery(query);

				while (rs.next()) {

					Team t = new Team();

					t.setNum(rs.getInt(1));
					t.setName(rs.getString(2));

					teams.add(t);

				}

			} catch (SQLException e) {
				logger.error("Error when crawling Database ! ");
				logger.error(ExceptionUtils.getStackTrace(e));
			}

		}

		return teams;
	}
	
	
	
	
	public void createNewTeam(Team team) {

		Connection conn = DatabaseUtil.getConnection();

		if (conn != null) {

			try {

				PreparedStatement statement = conn.prepareStatement("INSERT INTO TEAM(NAME) VALUES(?)");
				
				statement.setString(1, team.getName());

				statement.execute();

			} catch (SQLException e) {
				logger.error("Error when Inserting a new Team ! ");
				logger.error(ExceptionUtils.getStackTrace(e));
			}

		}

	}




	public Collection<Player> listAllPlayersForTeam(Integer numeroEquipe ) {
		
		Collection<Player> players = new ArrayList<Player>();

		Connection conn = DatabaseUtil.getConnection();

		if (conn != null) {

			try {

				PreparedStatement statement = conn.prepareStatement("SELECT * FROM PLAYER WHERE EQUIPE_ID = ? ORDER BY NUMERO");

				statement.setInt(1, numeroEquipe);
				
				ResultSet rs = statement.executeQuery();

				while (rs.next()) {

					Player player = new Player();

					player.setNum(rs.getInt("ID"));
					player.setName(rs.getString("NAME"));
					player.setNumero(rs.getInt("NUMERO"));
					player.setEquipeId(numeroEquipe);

					players.add(player);

				}

			} catch (SQLException e) {
				logger.error("Error when crawling Database ! ");
				logger.error(ExceptionUtils.getStackTrace(e));
			}

		}

		return players;
	}

}
