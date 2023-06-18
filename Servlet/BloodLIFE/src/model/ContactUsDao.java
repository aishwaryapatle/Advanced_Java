package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DB_connection;

public class ContactUsDao {
	
	public static int save(ContactUs c) {
		int status = 0;
		try {
			Connection con = DB_connection.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into contactus (firstName, lastname, email, message) values(?,?,?,?)");
			ps.setString(1, c.getFirstName());
			ps.setString(2, c.getLastName());
			ps.setString(3, c.getEmail());
			ps.setString(4, c.getMessage());
			
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	
	
	public static List<ContactUs> getAllRecords() {
		List<ContactUs> list = new ArrayList<ContactUs>();

		try {
			Connection con = DB_connection.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from BloodLIFE.contactus");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ContactUs u = new ContactUs();
				u.setId(rs.getInt("id"));
				u.setFirstName(rs.getString("firstName"));
				u.setLastName(rs.getString("lastName"));
				u.setEmail(rs.getString("email"));
				u.setMessage(rs.getString("message"));
				

				list.add(u);
			}
//			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
	
}


