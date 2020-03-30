package com.comparable.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.org.apache.regexp.internal.recompile;

public class Runner {
	
	public static void main(String[] args) {
			
	List<Laptop>laps = new ArrayList<> ();
	
	laps.add(new Laptop("Dell", 16, 800));
	laps.add(new Laptop("Apple", 8, 1200));
	laps.add(new Laptop("Acer", 12, 700));
	
	Comparator<Laptop> com = new Comparator<Laptop>() {

		@Override
		public int compare(Laptop l1, Laptop l2) {
			
			
			if(l1.getPrice() > l2.getPrice())
				
				return 2;
			
			else
				return -1;
			
			
		}
		
			
	};
	
	Collections.sort(laps,com);
	
	for(Laptop l : laps) {
		
		System.out.println(l);
		
	}
	
	
	}

}
