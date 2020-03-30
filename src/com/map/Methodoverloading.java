package com.map;

public class Methodoverloading {

	
	private String m1(int a,int b) {
		
		System.out.println(a + b);
		return null;
		
		
	}
	
public Object m1(double a, float b) {
		System.out.println(b + a);
		return b;
		
		
		
	}

public static void main(String[] args) {
	
	Methodoverloading mb= new Methodoverloading();
	
	mb.m1(1, 2);
	
}
}


