package com.sqlconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertStudentDao {
	public void getStudentDetails(){
		PreparedStatement preparestatement=null;
	    ResultSet resultset=null;
	
		Connection connection = null;
		
        try{
        	Class.forName(Constants.DRIVER_NAME);
        	connection=DriverManager.getConnection(Constants.CONNECTION_STRING,Constants.DB_USERNAME,Constants.DB_PASSWORD);
        	preparestatement=connection.prepareStatement("insert into school1.student1(Rollno,Name,Standard) values(?,?,?)");
        	preparestatement.setInt(1,11);
        	preparestatement.setString(2,"Sona");
        	preparestatement.setString(3,"B.Tech");
        	
        	
            resultset=preparestatement.executeQuery();
            Student student=new Student(resultset.getInt("Rollno"),resultset.getString("Name"),resultset.getString("Standard"));
        	student.getRollno();
        	student.getName();
        	student.getStandard();
        	}
        catch(ClassNotFoundException e){
        	e.printStackTrace();
        }
        catch(SQLException ex){
        	ex.printStackTrace();
        }
		finally{
			if(resultset != null){
				try{
					resultset.close();
				}
				catch(SQLException e){
					e.printStackTrace();
				}
			}
			if(preparestatement != null){
				try{
					preparestatement.close();
				}
				catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
        
					
					
				}

}
