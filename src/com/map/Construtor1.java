package com.map;

public class Construtor1 {
		
	
	Construtor1(double d){
		System.out.println("double arg");
	}
	Construtor1(int i){
		System.out.println("int arg");
	}
	Construtor1(){
		System.out.println("no arg");
	}
	
public static void main(String[] args) {
	Construtor1 t2 = new Construtor1(10);
	Construtor1 t1 = new Construtor1();
	
	Construtor1 t3 = new Construtor1(10.5);
	
}

}
