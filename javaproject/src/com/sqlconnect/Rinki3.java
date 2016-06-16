package com.sqlconnect;

import java.util.List;

public class Rinki3 {

	public static void main(String[] args) {
		StudentDAO studentDAO = new StudentDAO();
		List<Student> studentDetails = studentDAO.getStudentDetails();
		for (Student student : studentDetails) {
			System.out.println("ROLL NO : " + student.getRollno());
			System.out.println("NAME    : " + student.getName());
			System.out.println("CLASS   : " + student.getStandard());
			System.out.println("==========================================");
		}

	}

}
