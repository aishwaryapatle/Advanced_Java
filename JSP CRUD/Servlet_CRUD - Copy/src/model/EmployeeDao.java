package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/employeedb";
    private static String username = "root";
    private static String password = "abc123";
 
    private static Connection getConnection() throws ClassNotFoundException, SQLException{
        
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, username, password);
        return con;
    }
 
    public static int insert1(Employee e) throws SQLException, ClassNotFoundException
    {
    	String query = "Insert into employee1 (fname, lname, gender, email, mobile, dob, city) values (?,?,?,?,?,?,?)";
    	Connection con = getConnection();
    	PreparedStatement ps = con.prepareStatement(query); 	
    	
		ps.setString(1, e.getFname());
		ps.setString(2, e.getLname());
		ps.setString(3, e.getGender());
		ps.setString(4, e.getEmail());
		ps.setString(5, e.getMobile());
		ps.setString(6, e.getDob());
		ps.setString(7, e.getCity());

		int a = ps.executeUpdate();
		con.close();
    	return a;
    }
    
    public static int insert(Employee e) throws SQLException, ClassNotFoundException
    {
    	String query = "Insert into employee1 (fname, lname, gender, email, mobile, dob, city, skill) values (?,?,?,?,?,?,?,?)";
    	Connection con = getConnection();
    	PreparedStatement ps = con.prepareStatement(query); 	
    	
		ps.setString(1, e.getFname());
		ps.setString(2, e.getLname());
		ps.setString(3, e.getGender());
		ps.setString(4, e.getEmail());
		ps.setString(5, e.getMobile());
		ps.setString(6, e.getDob());
		ps.setString(7, e.getCity());
		ps.setString(8, e.getSkill());

		int a = ps.executeUpdate();
		con.close();
    	return a;
    }
    
    
    public static List<Employee> getAllEmployee()
    {
    	List<Employee> list = new ArrayList<Employee>();

    	try {
    		Connection con = getConnection();
    		PreparedStatement ps = con.prepareStatement("select * from employee1");
    		ResultSet rs = ps.executeQuery();
    		while (rs.next()) {
    			Employee e = new Employee();
    			e.setId(rs.getInt(1));
    			e.setFname(rs.getString(2));
    			e.setLname(rs.getString(3));
    			e.setGender(rs.getString(4));
    			e.setEmail(rs.getString(5));
    			e.setMobile(rs.getString(6));
    			e.setDob(rs.getString(7));
    			e.setCity(rs.getString(8));
    			e.setSkill(rs.getString(9));
    			
    			list.add(e);
    		}
    		con.close();
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}

    	return list;
    }

    
    public static int delete(int id)
    {
    	int a=0;
    	try {
    		Connection con = EmployeeDao.getConnection();
    		// delete query is given to delete the record for
    		// the given UserId
    		PreparedStatement ps = con.prepareStatement(
    			"delete from employee1 where id=?");
    		ps.setInt(1, id);
    		a = ps.executeUpdate();
    		con.close();
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}

		return a;
    }

    
    public static Employee getEmployeeById(int id)
    {
    	Employee e = new Employee();
    	try {
    		Connection con = getConnection();
    		// We are getting the details for a specific user
    		// and hence the query has to be sent in the below
    		// way
    		PreparedStatement ps = con.prepareStatement("select * from employee1 where id=?");
    		ps.setInt(1, id);
    		ResultSet rs = ps.executeQuery();
    		if (rs.next()) {
    		
    			e.setId(rs.getInt(1));
    			e.setFname(rs.getString(2));
    			e.setLname(rs.getString(3));
    			e.setGender(rs.getString(4));
    			e.setEmail(rs.getString(5));
    			e.setMobile(rs.getString(6));
    			e.setDob(rs.getString(7));
    			e.setCity(rs.getString(8));
    			e.setSkill(rs.getString(9));


//                boolean isChecked = resultSet.getBoolean("is_checked");
    		}
    		con.close();
    	}
    	catch (Exception ex) {
    		ex.printStackTrace();
    	}

    	return e;
    }
    
    
    public static int update(Employee e)
    {
    	int a = 0;
    	try {
    		Connection con = getConnection();
    		// AS we are not sure about what fields need to be
    		// updated, we are setting for all the fields by
    		// means of update query This will update the record
    		// for the corresponding geekUserId
    		PreparedStatement ps = con.prepareStatement(
    			"update employee1 set fname=?, lname=?, gender=?, email=?, mobile=?, dob=?, city=?, skill=? where id=?");
    		
    		ps.setString(1, e.getFname());
    		ps.setString(2, e.getLname());
    		ps.setString(3, e.getGender());
    		ps.setString(4, e.getEmail());
    		ps.setString(5, e.getMobile());
    		ps.setString(6, e.getDob());
    		ps.setString(7, e.getCity());
    		ps.setString(8, e.getSkill());
    		ps.setInt(9, e.getId());

    		a = ps.executeUpdate();
    		con.close();
    	}
    	catch (Exception ex) {
    		ex.printStackTrace();
    	}

    	return a;
    }
}
