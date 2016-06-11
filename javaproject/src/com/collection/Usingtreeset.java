package com.collection;

import java.util.Set;
import java.util.TreeSet;


public class Usingtreeset {

	public static void main(String[] args) {
		Set <String> set=new TreeSet<String>(); 
		set.add("Apple");
	    set.add("Mango");
		set.add("Mango");
		set.add("Orange");
		set.add("pine - Apple");
		
		for(String value:set){
			System.out.println(value);
		}
	
		


	}

}
