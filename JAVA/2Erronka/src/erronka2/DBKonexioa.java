package erronka2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;
import java.sql.Statement;

public class  DBKonexioa {
	private static String ERABILTZAILEA = "root";
	private static String PASAHITZA = "1MG2024";
	private static String DB = "2Erronka";
	private static String URL = "jdbc:mysql://172.16.237.9:3306/"+DB;
	
	private static Connection conn;
	private static Statement st_= null;

	public void konexioaEgin() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(URL, ERABILTZAILEA, PASAHITZA);
			
			if (conn != null) {
				st_ = conn.createStatement();
				System.out.println("Konexioa ondo egin da");
			}
			else {
				System.out.println("Konexioa gaizki atera da.");
			}
		} catch (SQLException e) {e.printStackTrace();}
		catch (ClassNotFoundException e) {e.printStackTrace();}
		catch (Exception e) {e.printStackTrace();}
		}
}

