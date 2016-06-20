package com.sqlconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class PrepareAdd {
	
	public static void main(String[] args){
		String driverName="com.mysql.jdbc.Driver";
		String connectionString="jdbc:mysql://localhost/school1";
		String dbUserName="root";
		String dbPassword="rohit12*";
        try{
        	Class.forName(driverName);
        	Connection connection=DriverManager.getConnection(connectionString,dbUserName,dbPassword);
        	PreparedStatement preparestatement=connection.prepareStatement("insert into school1.student1(Rollno,Name,class)"+"values(?,?,?)");
        	preparestatement.setInt(1,10);
        	preparestatement.setString(2,"Abhishek");
        	preparestatement.setString(3,"B.Tech");
            preparestatement.execute();
            System.out.println(preparestatement.toString());
           
        	
        	
             
        }
        catch(ClassNotFoundException e){
        	e.printStackTrace();
        }
        catch(SQLException ex){
        	ex.printStackTrace();
        }

	}

}
