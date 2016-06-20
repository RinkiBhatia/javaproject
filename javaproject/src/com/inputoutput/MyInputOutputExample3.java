package com.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInputOutputExample3 {

	public static void main(String[] args) throws IOException{
		String c;
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 'Quit' to exit");
		do{
			 c=(String )obj.readLine();
			 System.out.println(c);
			
		}while(!c.equals("Quit"));
		

	}

}
