package com.wrapper;

public class BufferString {

	public static void main(String[] args) {
    StringBuffer name=new StringBuffer("Sachin");
    name.append(" Tendulkar");
    System.out.println(name);
    System.out.println("Length :: "+name.length());
    System.out.println("Substring :: "+name.substring(6));
    System.out.println("Substring1 :: "+name.substring(3,6));
    System.out.println("Lowercase :: "+name.toString().toLowerCase());
    System.out.println("Uppercase :: "+name.toString().toUpperCase());

    
    System.out.println("Reverse :: "+name.reverse());
   char[] charArray=name.toString().toCharArray();
   for(int i=0;i<charArray.length;i++){
	   System.out.print(charArray[i]);
   }
   System.out.println("");
 String value="Apple";
 String value1="apple";
 if(value.equals(value1)){
	 System.out.println("Values are equal");
 }
 else{
	 System.out.println("Values are not equal");
	 
	 
 }
 
	}

}
