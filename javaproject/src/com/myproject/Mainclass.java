package com.myproject;
interface MyContents{
	public String getData();
	
}
class MyClass{
	public MyContents getMyClassData(){
		return new MyContents(){//anonymous class
			private String data="rinki bhatia from interface";
			public String getData(){
				return data;
				
			}
		};
	}
}
public class Mainclass {

	public static void main(String[] args) {
		MyClass obj=new MyClass();
		System.out.println("Data is :: "+obj.getMyClassData().getData());
		

	}

}
