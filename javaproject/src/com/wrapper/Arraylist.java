package com.wrapper;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List<Integer> myList=new ArrayList<Integer>();
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(40);
		myList.add(50);
		System.out.println(myList);
		for(int value:myList){
			System.out.println(value);
		}
		
		

	}

}
