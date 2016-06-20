package com.inputoutput;

import java.io.*;

//import java.io.BufferedReader;


public class MyInputOutputExample1 {

	public static void main(String[] args) throws IOException {
		char c;
		InputStreamReader isr= new InputStreamReader(System.in);
		System.out.println("Enter character 'Q' to quit");
		do{
			c=(char) isr.read();
			System.out.print(c);
		}while(c!='Q');
		/*BufferedReader isr1= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter character 'Q' to quit");
		do{
			c=(char) isr1.read();
			System.out.print(c);
		}while(c!='Q');*/

	
	
	
	

	}

}
