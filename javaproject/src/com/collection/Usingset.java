package com.collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

public class Usingset {

	public static void main(String[] args) {
		Set <String> set=new HashSet<String>(); 
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
