package com.collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Array1 {

	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList<String>();
		list.add("Mango");
		list.add("Orange");
		list.add("pine apple");
		
		Iterator iterator=list.iterator();
		while(iterator.hasNext()){
			Object value=(String) iterator.next();
			System.out.println(value);

	}

}
}
