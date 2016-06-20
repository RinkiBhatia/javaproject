package com.Swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Swings {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swings window = new Swings();
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
	public Swings() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblG = new JLabel("Enter First Number");
		lblG.setBounds(20, 60, 114, 27);
		frame.getContentPane().add(lblG);
		
		JLabel lblEnterSecondNumber = new JLabel("Enter Second Number");
		lblEnterSecondNumber.setBounds(20, 93, 125, 27);
		frame.getContentPane().add(lblEnterSecondNumber);
		
		textField = new JTextField();
		textField.setBounds(145, 63, 228, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(145, 96, 228, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSum = new JLabel("Result");
		lblSum.setBounds(31, 128, 104, 27);
		lblSum.setBackground(Color.PINK);
		lblSum.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblSum);
		
		textField_2 = new JTextField();
		textField_2.setBounds(145, 131, 228, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnComputeSum = new JButton("ADD");
		btnComputeSum.setBounds(123, 166, 75, 23);
		btnComputeSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Float num1,num2,result;
				  num1 = Float.parseFloat(textField.getText());
				  num2 = Float.parseFloat(textField_1.getText());
				  result=num1+num2;
				  textField_2.setText(String.valueOf(result));
				
				 
			}
		});
		frame.getContentPane().add(btnComputeSum);
		
		JButton btnExit = new JButton("CLEAR");
		btnExit.setBounds(217, 166, 89, 23);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		frame.getContentPane().add(btnExit);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setBounds(320, 211, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNumberAddition = new JLabel("Number Addition");
		lblNumberAddition.setBounds(123, 11, 157, 31);
		lblNumberAddition.setForeground(Color.WHITE);
		lblNumberAddition.setBackground(Color.WHITE);
		lblNumberAddition.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNumberAddition.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNumberAddition);
		
		
		
}
}
