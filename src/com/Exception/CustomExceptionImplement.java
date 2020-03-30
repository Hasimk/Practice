package com.Exception;

public class CustomExceptionImplement {
	public static void main(String[] args) {
		
		int a=11;
		
		if(a>18) {
			
			throw new CustomException("Valid");
			
		}
		
		else if (a<22) {
			
			throw new CustomException("Not Valid");
			
		}
	}

}
