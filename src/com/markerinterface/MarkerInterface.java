
package com.markerinterface;

public class MarkerInterface implements Cloneable {
	
	int a=20;
	int b=30;
	public static void main(String[] args) throws CloneNotSupportedException {
		
		MarkerInterface mk = new MarkerInterface();
		
		System.out.println(mk.a+" "+mk.b);
		
	        MarkerInterface duplicatecopy= (MarkerInterface) mk.clone();
	          System.out.println(duplicatecopy.a+" "+duplicatecopy.b);
		
	}
	
	

}
