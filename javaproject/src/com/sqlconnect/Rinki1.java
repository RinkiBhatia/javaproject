package com.sqlconnect;

import java.sql.Connection;
import java.sql.DriverManager ;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Driver;


public class Rinki1 {

	public static void main(String[] args) {
		String driverName="com.mysql.jdbc.Driver";
		String connectionString="jdbc:mysql://localhost/school1";
		String dbUserName="root";
		String dbPassword="rohit12*";
        try{
        	Class.forName(driverName);
        	Connection connection=DriverManager.getConnection(connectionString,dbUserName,dbPassword);
        	Statement statement=connection.createStatement();
        	ResultSet resultset=statement.executeQuery("select*from school1.student1");
        	while(resultset.next()){
        		System.out.println(resultset.getInt(1));
        	}
        }
        	catch(ClassNotFoundException e){
        		e.printStackTrace();
        	}
        catch(SQLException ex){
        	ex.printStackTrace();
        }
	}

        		
        	
        	
        }
	


