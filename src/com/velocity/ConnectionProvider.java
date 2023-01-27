package com.velocity;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionProvider 
{
Connection con =null; //  interphase con is refrance variable is con and value is null
	
	public Connection getconnectionDetails()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
				

		}catch (Exception e )// handling Exception 
		{
			e.printStackTrace();// print Exception object 
		}
		return con;
	}
}