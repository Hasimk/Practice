package com.map;

public class InterIm  implements Interface12, Interface13{

	@Override
	public void show() {
	System.out.println("hi");
		
	}

	@Override
	public void travel() {
		System.out.println("by");
		
	}

	public static void main(String[] args) {
		
		InterIm br = new InterIm();
		
		
		br.show();
		br.travel();
		
	}
		
		
	

}
