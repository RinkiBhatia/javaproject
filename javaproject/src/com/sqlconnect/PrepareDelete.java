package com.sqlconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareDelete {

	public static void main(String[] args) {
		String driverName="com.mysql.jdbc.Driver";
		String connectionString="jdbc:mysql://localhost/school1";
		String dbUserName="root";
		String dbPassword="rohit12*";
        try{
        	Class.forName(driverName);
        	Connection connection=DriverManager.getConnection(connectionString,dbUserName,dbPassword);
        	PreparedStatement preparestatement=connection.prepareStatement("delete from school1.student1 where Rollno=?");
        	preparestatement.setInt(1,9);
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
