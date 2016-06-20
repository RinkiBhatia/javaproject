package com.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInputOutputExample4 {

	public static void main(String[] args) throws  IOException {
		BufferedReader obj1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number");
		int a=Integer.parseInt(obj1.readLine());
		System.out.println("Enter second number");
		int b=Integer.parseInt(obj1.readLine());
		int c=a+b;
		System.out.println("The sum is "+c);

	}

}
