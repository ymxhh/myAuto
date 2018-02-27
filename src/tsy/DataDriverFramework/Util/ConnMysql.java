package tsy.DataDriverFramework.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnMysql {

	private String driver = "com.mysql.jdbc.Driver";
	private String url;
	private String user;
	private String password;
	
	public ConnMysql(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
	}
	
	/*public void conn() {
		try {
			Class.forName(driver);
			Connection conn = ((Connection) DriverManager.getConnection(url, user, password));
			
		} catch (ClassNotFoundException e) {
			System.out.println("Sorry! Cannot find the driver...");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
}
