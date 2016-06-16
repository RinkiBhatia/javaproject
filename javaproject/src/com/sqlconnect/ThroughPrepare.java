package com.sqlconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ThroughPrepare {

	public static void main(String[] args) {
		String driverName="com.mysql.jdbc.Driver";
		String connectionString="jdbc:mysql://localhost/school1";
		String dbUserName="root";
		String dbPassword="rohit12*";
        try{
        	Class.forName(driverName);
        	Connection connection=DriverManager.getConnection(connectionString,dbUserName,dbPassword);
        	PreparedStatement preparestatement=connection.prepareStatement("select* from school1.student1 where Rollno=?");
        	preparestatement.setInt(1, new Integer(3));
        	ResultSet resultset=preparestatement.executeQuery();
        	while(resultset.next()){
        		System.out.println(resultset.getInt("Rollno"));
        		System.out.println(resultset.getString("Name"));
        		System.out.println(resultset.getString("class"));
        	}}
        catch(ClassNotFoundException e){
        	e.printStackTrace();
        }
        catch(SQLException ex){
        	ex.printStackTrace();
        }
	}

        	
 }
        
	


