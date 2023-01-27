package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserInput 
{
	PreparedStatement ps= null;
	Connection con =null;
	public void insertStudentData( String LastName,String FirstName,String Address,String City)
	{
		try {
			ConnectionProvider connectionProvider = new ConnectionProvider();// because of implementation of this class 
			
			//
			con= connectionProvider.getconnectionDetails();// Because of connection 
			ps=con.prepareStatement("insert into stud_info (LastName,FirstName,Address,City)Values(?,?,?,?) ");
			ps.setString(1,LastName);
			ps.setString(2,FirstName);
			ps.setString(3,Address);
			ps.setString(4,City);
			//ps.setString(5,Salary);
			int i= ps.executeUpdate();
			System.out.println(" Record Added....."+i);
			
			
		}
		catch (Exception e )// handling Exception 
		{
			e.printStackTrace();// print Exception object 
		}
		finally
		{
			if(ps!=null) 
			{
				try {
				ps.close();
			}
			catch (Exception e)// handling Exception 
			{
				e.printStackTrace();
			}
		}

			if(con!=null) 
			{
				try {
					con.close();
			}
			catch (Exception e)// handling Exception 
			{
				e.printStackTrace();
			}
		}
		
	}
}
	


}
