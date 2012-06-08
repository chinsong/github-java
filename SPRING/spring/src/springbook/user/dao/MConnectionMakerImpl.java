package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MConnectionMakerImpl implements ConnectionMaker {

	public Connection makeConnection() throws ClassNotFoundException,
			SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/spring","root","dkswlstjd0");
		System.out.println("db connected");
		return c;
	}

}
