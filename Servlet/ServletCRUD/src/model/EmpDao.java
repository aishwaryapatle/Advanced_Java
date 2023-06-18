package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpDao {

	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/servlet_crud";
	private static String username = "root";
	private static String password = "abc123";

	private static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
	
	public static int insertEmp(Employee e) throws ClassNotFoundException, SQLException
	{
		int a = 0;
		String query = "insert into emp values(?,?,?)";
			Connection con = EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, e.getId());
			ps.setString(2, e.getFname());
			ps.setString(3, e.getLname());
			a=ps.executeUpdate();
		
		return a;
	}
	
}
