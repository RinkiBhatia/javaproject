package com.collection;

import java.util.ArrayList;

import java.util.List;
import java.util.Iterator;

public class Array{

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Mango");
		list.add("Orange");
		list.add("pine apple");
		
		Iterator iterator=list.iterator();
		while(iterator.hasNext()){
			String value=(String) iterator.next();
			System.out.println(value);
		}

	}

}
