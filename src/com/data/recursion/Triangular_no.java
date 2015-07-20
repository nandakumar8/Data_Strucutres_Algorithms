package com.data.recursion;

public class Triangular_no {
	
	
	public static int triangle(int n){
		System.out.println("entering:"+ n);
		if(n==1){
			return 1;
		}
		
		 
		int tmp=( n+triangle(n-1));
		System.out.println("returning"+tmp);
		return tmp;
	}
	

}
