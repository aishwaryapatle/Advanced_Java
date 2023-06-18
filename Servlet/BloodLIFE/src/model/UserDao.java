package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DB_connection;

public class UserDao {
	
	public static int save(User u) {
		int status = 0;
		try {
			Connection con = DB_connection.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into user "
					+ "(fname, lname, email, phonenumber, password, cpassword, bloodgroup, pincode, roleid) values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, u.getFname());
			ps.setString(2, u.getLname());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getPhonenumber());
			ps.setString(5, u.getPassword());
			ps.setString(6, u.getCpassword());
			ps.setString(7, u.getBloodgroup());
			ps.setString(8, u.getPincode());
			ps.setInt(9, u.getRoleid());
			
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
	
	public static List<User> getAllRecords() {
		List<User> list = new ArrayList<User>();

		try {
			Connection con = DB_connection.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from BloodLIFE.user");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				User u = new User();
				u.setId(rs.getInt("id"));
				u.setFname(rs.getString("fname"));
				u.setLname(rs.getString("lname"));
				u.setEmail(rs.getString("email"));
				u.setPhonenumber(rs.getString("phonenumber"));
				u.setPassword(rs.getString("password"));
				u.setCpassword(rs.getString("cpassword"));
				u.setBloodgroup(rs.getString("bloodgroup"));
				u.setPincode(rs.getString("pincode"));

				list.add(u);
			}
//			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	
	public static String authenticateUser(User user) {
		
		String query = "select email, password, roleid from user";
		String emailDB = "";
		String passwordDB = "";
		int roleidDB;
		
		String email = user.getEmail();
		String password = user.getPassword();
		
			
		try {
			Connection con = DB_connection.getConnection();		
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(query);
			
			while(rs.next())
			{
				emailDB = rs.getString("email");
				passwordDB = rs.getString("password");
				roleidDB = rs.getInt("roleid");
				
				if(email.equals(emailDB) && password.equals(passwordDB) && roleidDB==2)
				{
					return "User_Role";
				}
				else if(email.equals(emailDB) && password.equals(passwordDB) && roleidDB==1)
				{
					return "Admin_Role";
				}
			}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		return "Not_Valid";
	}	
}
