package com.map;

public class ABext  extends Abstract{
	 int m;
	 int n;
	
		
	public ABext(int i, int k, int m, int n) {
		super(i, k);
		this.m=m;
		this.n=n;
		
		
	}



	
	public static void main(String[] args) {
		
		ABext br= new ABext(1, 2,3,4);
		
		System.out.println(br.i+ " "+br.k+" "+br.m+" "+br.n);
		
		
		
		
	}

}
