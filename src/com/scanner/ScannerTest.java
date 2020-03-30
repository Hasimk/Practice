package com.scanner;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Age");
		
		int age = sc.nextInt();
		
		
		if(age<=100&&age>=18)
		{
			System.out.println("you are eligible");
		}
		else {
			System.out.println("you are not eligible");
			
		}
		
		
		
	}

}
