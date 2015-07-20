package com.data.recursion;

public class Factorial_no {
	
	public static int factorial(int n){
		System.out.println("entering:"+ n);
		if(n==0){
			return 1;
		}
		
		 
		int tmp=( n*factorial(n-1));
		System.out.println("returning"+tmp);
		return tmp;
	}

}
