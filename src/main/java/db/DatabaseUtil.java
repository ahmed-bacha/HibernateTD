package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hsqldb.hsqldb.App;

public class DatabaseUtil {

	private static Logger logger = LogManager.getLogger(DatabaseUtil.class);

	private final static String DRIVER = "org.hsqldb.jdbcDriver";

	private final static String URL = "jdbc:hsqldb:hsql://localhost/footdb";

	private final static String USER = "SA";

	private final static String PASSWORD = "";

	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			logger.error("Error while loading JDBC Driver ! ");
			logger.error(ExceptionUtils.getStackTrace(e));
		}
	}

	public static Connection getConnection(){

		Connection conn = null;

		try {

			conn = DriverManager.getConnection(URL, USER, PASSWORD);

		} catch (SQLException e) {
			logger.error("Error when connecting to database ! ");
			logger.error(ExceptionUtils.getStackTrace(e));
		}

		return conn;
	}

	public static void closeConnection(Connection conn) {

		if (conn != null) {
			
			try {

				conn.close();

			} catch (SQLException e) {
				logger.error("Error when closing the connection ! ");
				logger.error(ExceptionUtils.getStackTrace(e));
			}

		}

	}

}
