package springbook.user.dao;

import java.sql.*;

public interface ConnectionMaker {
	
	public Connection makeConnection() throws ClassNotFoundException,
		SQLException;
	
}
