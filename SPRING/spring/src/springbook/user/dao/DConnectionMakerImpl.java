package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMakerImpl implements ConnectionMaker {

	public Connection makeConnection() throws ClassNotFoundException,
			SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c = DriverManager.getConnection(
						"jdbc:oracle:thin:@172.21.3.209:1523:DEVDB","devhitops","lem1n");
		return c;
	}
}
