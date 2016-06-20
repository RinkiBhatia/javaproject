package com.Swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Student_Record {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Record window = new Student_Record();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Student_Record() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Roll Number");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(21, 53, 127, 22);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(158, 54, 240, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterName = new JLabel("Enter Name");
		lblEnterName.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterName.setBounds(21, 86, 127, 22);
		panel.add(lblEnterName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 85, 240, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEnterScienceMarks = new JLabel("Enter Science Marks");
		lblEnterScienceMarks.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterScienceMarks.setBounds(21, 115, 127, 22);
		panel.add(lblEnterScienceMarks);
		
		textField_2 = new JTextField();
		textField_2.setBounds(158, 116, 240, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEnterMathsMarks = new JLabel("Enter maths Marks");
		lblEnterMathsMarks.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterMathsMarks.setBounds(21, 148, 127, 22);
		panel.add(lblEnterMathsMarks);
		
		textField_3 = new JTextField();
		textField_3.setBounds(158, 147, 240, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lbl6 = new JLabel("");
		lbl6.setForeground(Color.WHITE);
		lbl6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6.setBounds(21, 217, 377, 33);
		panel.add(lbl6);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String driverName="com.mysql.jdbc.Driver";
				String connectionString="jdbc:mysql://localhost/school1";
				String dbUserName="root";
				String dbPassword="rohit12*";
		        try{
		        	Class.forName(driverName);
		        	Connection connection=DriverManager.getConnection(connectionString,dbUserName,dbPassword);
		        	PreparedStatement preparestatement=connection.prepareStatement("insert into school1.studentrecord(Roll_Number,Full_Name,Science_Marks,Maths_Marks)"+"values(?,?,?,?)");
		        	String a=textField.getText();
		        	String b=textField_1.getText();
		        	String c=textField_2.getText();
		        	String d=textField_3.getText();
		        			
		        	preparestatement.setString(1,a);
		        	preparestatement.setString(2,b);
		        	preparestatement.setString(3,c);
		        	preparestatement.setString(4,d);
		            preparestatement.executeUpdate();
		            lbl6.setText("Record added Successfully!!")	;	           
		        	
		        	
		             
		        }catch(ClassNotFoundException e1){
		        	e1.printStackTrace();
		        }
		        
		        catch(SQLException ex){
		        	ex.printStackTrace();
		        }
			}
		});
		btnSubmit.setBounds(309, 178, 89, 23);
		panel.add(btnSubmit);
		
		
		
		JLabel lblStudentDetails = new JLabel("STUDENT DETAILS");
		lblStudentDetails.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStudentDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentDetails.setBounds(144, 21, 154, 22);
		panel.add(lblStudentDetails);
		
		
	}

}
