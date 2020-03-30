package com.Arraylist;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapIttreator {
	
	 public static void main(String[] args) {
		
		 HashMap<Integer, String> br = new HashMap<>();
		 
		 br.put(101, "hasim");
		 br.put(102, "Mukesh");
		 br.put(103, "kuldeep");
		 		 
		 /*System.out.println(br);
		 
		 Set<Integer>s=br.keySet();
		 
		 System.out.println(s);
		 
		 Collection<String>m=br.values();
		 
		 System.out.println(m); */
		  
		/* Set<Entry<Integer, String>> s1=br.entrySet();
		 
		 for(Entry<Integer, String> e:s1) {
			
			 System.out.println(e.getKey()+" "+e.getValue());
			 */
		 
		for(Map.Entry<Integer, String> e2:br.entrySet()) {
			
			System.out.println(e2.getKey()+" "+e2.getValue());
			
		}
			 
		 }
		 
		 }
		
		 
	
	
	
	


