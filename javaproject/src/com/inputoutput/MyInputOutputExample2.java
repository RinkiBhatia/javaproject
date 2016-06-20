package com.inputoutput;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class MyInputOutputExample2 {

	public static void main(String[] args) throws IOException {

	   /*   BufferedInputStream bis = new BufferedInputStream (new DataInputStream(System.in));
          System.out.println("Enter your remarks");
          char m=(char)bis.read();
           System.out.println(m); */
           
           DataInputStream obj1=new DataInputStream(System.in);
           System.out.println("Enter your remarks");
           System.out.println(obj1.readLine());
           
          
          
          
	}

}
