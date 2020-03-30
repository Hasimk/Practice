package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;



public class MapTest {

public static void main(String[] args) {
	
	Map<Integer, String> mp=new HashMap<Integer,String>();
	mp.put(101, "hasim");
	mp.put(102, "kareem");
	mp.put(103, "faiz");
	
	for(Map.Entry m:mp.entrySet()) {
	
	
	System.out.println(m.getKey()+" "+m.getValue());
	
	
	
	}
	
}
	
}
