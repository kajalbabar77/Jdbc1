package com.velocity;

import java.util.Scanner;

public class Test 
{
	public static void main(String[]argd)
	{

		Scanner  sc = new Scanner(System.in); 
		for (int i= 0;i<3;i++)
		{
			System.out.println(" Enter the last Name");
			String LastName= sc.next() ;
			System.out.println(" Enter the FirstName");
			String FirstName= sc.next() ;
			System.out.println(" Enter the Address");
			String Address= sc.next() ;
			System.out.println(" Enter the City");
			String City= sc.next() ;
			//System.out.println(" Enter the Salary");
			//String Salary= sc.next() ;
			UserInput input =new  UserInput();
			input.insertStudentData( LastName, FirstName, Address, City);
			
			
			
		}
		sc.close();
	}}
