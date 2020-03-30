package com.comparable1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Runner {
	 public static void main(String[] args) {
		
	
	List<Bike> bike= new ArrayList<>();
	
	bike.add(new Bike("Hero", 40000,165));
	bike.add(new Bike("Honda", 45000,135));
	bike.add(new Bike("Bajaj", 42000,125));	
	
	Collections.sort(bike);
	
	for(Bike b : bike) {
		
		System.out.println(b);
		
		
	}
	

	 }
}
