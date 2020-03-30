package com.comparable1;

public class Bike implements Comparable<Bike> {
	
	private String brand;
	private int price;
	private int Engine;
		
	public Bike(String brand, int price, int engine) {
		
		this.brand = brand;
		this.price = price;
		Engine = engine;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getEngine() {
		return Engine;
	}
	public void setEngine(int engine) {
		Engine = engine;
	}
	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", price=" + price + ", Engine=" + Engine + "]";
	}
	@Override
	public int compareTo(Bike bike2) {
		
		//if first object this > bike2=+
		//this < bik2= -
		//if first object == bike2=0
		
		if(this.getEngine() > bike2.getEngine())
			
			return 5;// any positive number for return;
		
		else 
		return -1;
	}
	
	}

