package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/jspTable1";
	private static String username = "root";
	private static String password = "abc123";

	private static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
	

	public static int save(User u) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("insert into users1 (firstname, lastname, email, address, city) values(?,?,?,?,?)");
			ps.setString(1, u.getFirstname());
			ps.setString(2, u.getLastname());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getAddress());
			ps.setString(5, u.getCity());
			
			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	
	public static boolean deleteUser(int id)
	{
		String sql = "DELETE FROM users1 WHERE id=?";
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			
			ps.executeUpdate();
			return true;
			} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
	
	
	public static List<User> getAllRecords() {
		List<User> list = new ArrayList<User>();

		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("select * from users1");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setFirstname(rs.getString("firstname"));
				u.setLastname(rs.getString("lastname"));
				u.setEmail(rs.getString("email"));
				u.setAddress(rs.getString("address"));
				u.setCity(rs.getString("city"));
				

				list.add(u);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}


	public static User getRecordById (int id) {
		
		User u = null;
		try {
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("select * from users1 where id=?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			u = new User();
			u.setId(rs.getInt("id"));
			u.setFirstname(rs.getString("firstname"));
			u.setLastname(rs.getString("lastname"));
			u.setEmail(rs.getString("email"));
			u.setAddress(rs.getString("address"));
			u.setCity(rs.getString("city"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return u;
	}
	
	
	public static int update (User u) {
		
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("update users1 set firstname=?, lastname=?, email=?, address=?, city=? where id=?");
			ps.setString(1, u.getFirstname());
			ps.setString(2, u.getLastname());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getAddress());
			ps.setString(5, u.getCity());
			ps.setInt(6, u.getId());
			
			status = ps.executeUpdate();
		
		} catch(Exception e) {
			System.out.println(e);
		}
		
		return status;
	}

}


