package db;

public class MySQLDBConfig {
	private static final String INSTANCE = "lymproject-instance.ci8gkwfgmwqq.us-east-2.rds.amazonaws.com";
	private static final String PORT_NUM = "3306";
	public static final String DB_NAME = "lymproject";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "lym412lym412";
	public static final String URL = "jdbc:mysql://"
			+ INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
			+ "?user=" + USERNAME + "&password=" + PASSWORD
			+ "&autoReconnect=true&serverTimezone=UTC";
}
