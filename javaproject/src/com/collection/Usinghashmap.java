package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Usinghashmap {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("empId","100");
		map.put("empName","Rinki");
		System.out.println(map);
		Set<String> keySet= map.keySet();
		Iterator<String> iterator=keySet.iterator();
		while(iterator.hasNext()){
			String key=(String)iterator.next();
			System.out.println("Key :: "+key);
			System.out.println("Value :: "+map.get(key));
			System.out.println("======================================");
			
		}
		

	}

}
