package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_connection {


	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/BloodLIFE";
	private static String username = "root";
	private static String password = "abc123";

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
	
}
