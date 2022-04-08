package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	/* Modolo de conex�o*/
	//Par�mentros de conex�o
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	private String user ="root";
	private String password = "cml123";
	// M�todo de Conex�o
	private Connection conectar() {
	Connection con = null;
	try {
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);
		return con;
	} catch (Exception e) {
		System.out.println(e);
		return null;
		
	}
		
		
	}
// teste de conex�o
	public void testeConex�o() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
