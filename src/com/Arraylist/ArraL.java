package com.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraL {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("hasim");
		arr.add("karim");
		arr.add("abhi");
		
		System.out.println(arr);
		Iterator<String> itr = arr.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
			
			
		}
	}

