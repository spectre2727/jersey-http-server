package individual.jersey_jdbc_grizzly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	private static String url = "jdbc:mysql://localhost:3306/mysql_d";
	private static String username = "root";
	private static String password = "root";

	public static Connection get() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
