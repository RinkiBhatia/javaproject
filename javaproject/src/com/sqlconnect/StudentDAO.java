package com.sqlconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	public List<Student> getStudentDetails(){
		PreparedStatement preparestatement=null;
		ResultSet resultset=null;
		List<Student> studentList = null;
		Connection connection = null;
		
        try{
        	Class.forName(Constants.DRIVER_NAME);
        	connection=DriverManager.getConnection(Constants.CONNECTION_STRING,Constants.DB_USERNAME,Constants.DB_PASSWORD);
        	preparestatement=connection.prepareStatement("select * from school1.student1 ");
            resultset=preparestatement.executeQuery();
        	studentList=new ArrayList<Student>();
            while(resultset.next()){
            	Student student=new Student(resultset.getInt("Rollno"),resultset.getString("Name"),resultset.getString("Standard"));
        		studentList.add(student);
        	}}
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
        
		return studentList;			
					
				}
			}
		
		
		

	


