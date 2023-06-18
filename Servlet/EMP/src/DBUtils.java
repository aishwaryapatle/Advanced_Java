
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {

 private static Connection conn = null;
 
 public static Connection getConnection(){
	  try {
		  Class.forName("com.mysql.cj.jdbc.Driver");
	   conn = DriverManager.getConnection("jdbc:mysql://localhost/person","root","abc123");
	  } catch (Exception e) {
		  e.printStackTrace();
	  }
	  return conn;
 	}
}