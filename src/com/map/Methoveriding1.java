package com.map;

import java.sql.SQLException;

public class Methoveriding1  extends Methodoveriding {
	
	void m2() throws  Exception
	
	{
		
		System.out.println("hk");
		
		
	}
	
	public static void main(String[] args) {
		
		Methoveriding1 br= new Methoveriding1();
		
		try {
			br.m2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
