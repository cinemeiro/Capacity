package br.com.caelum.agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import com.microsoft.jdbc.sqlserver.SQLServerDriver;

public class ConnectionFactory {
	
	public Connection getConnection()  {
		
		//Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver"); 
		try{
			//Class.forName("net.sourceforge.jtds.jdbc.Driver");
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			return DriverManager.getConnection(
					
					//"jdbc:sqlserver://10.15.53.43;databaseName = Capacity","usr_capacity", "C@pacity");
					"jdbc:sqlserver://10.15.53.43;databaseName=Capacity","usr_capacity","C@pacity");
					//"jdbc:jtds:sqlserver://10.15.53.43:1433/Capacity;usr_capacity;C@pacity");
			

	  
		}catch (SQLException | ClassNotFoundException e){
			throw new RuntimeException (e);
		}
	}
}


/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() throws SQLException {
		System.out.println("conectando ...");

		try {
			Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		}
		
		return DriverManager.getConnection("jdbc:microsoft:sqlserver://10.15.53.43;databaseName=Capacity","usr_capacity","C@pacity");
	}

}*/
