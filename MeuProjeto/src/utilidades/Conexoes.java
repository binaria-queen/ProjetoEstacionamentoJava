package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexoes {
	static Connection con = null;
	public static Connection conect() {
		String url = "jdbc:postgresql://ec2-23-20-224-166.compute-1.amazonaws.com:5432/d8noa84cmmo1q8";
		String user = "lhrfiqeibqinfh"; 
		String password = "c1beedaeea55f2f2fe5bd0371046ba7780287b9b50b0c1187b23c686a1b865ab";
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void closeConexao() {
		con = null;
	}
	
}
