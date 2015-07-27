package com.data.advancedsort;

public class Main {

	public static void main(String args[]){

		int maxSize = 20;
		Shellsort a;
		a = new Shellsort(maxSize); 
		for(int j=0; j<maxSize; j++)
		{ 
			long n = (int)(java.lang.Math.random()*99);
			a.insert(n);
		}
		a.display(); 
		a.shellSort(); 
		a.display(); 



		Quicksort b;
		b=new Quicksort(maxSize);
		for(int j=0; j<maxSize; j++)
		{ 
			long n = (int)(java.lang.Math.random()*99);
			b.insert(n);
		}
		b.display(); 
		b.quick(); 
		b.display();

	}
}
