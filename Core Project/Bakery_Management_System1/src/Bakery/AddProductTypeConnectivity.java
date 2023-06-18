package Bakery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddProductTypeConnectivity {

	public static int AddProductTypeCode(AddProductType a) throws ClassNotFoundException, SQLException
	{
		Connection con = Connective.getConnection();
		PreparedStatement stmt = con.prepareStatement("INSERT INTO bakery.addProductType VALUES (?,?)");
		stmt.setString(1, a.getPtype());
		stmt.setString(2, a.getDes1());
		
		int x = stmt.executeUpdate();
		con.close();
		return x;
	}
}
