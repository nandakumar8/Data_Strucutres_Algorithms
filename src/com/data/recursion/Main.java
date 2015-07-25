package com.data.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String args[]) throws IOException{
//		//triangular	
		System.out.println("enter number to find traingular value");
		int no=getInt();
		int answer=Triangular_no.triangle(no);
		System.out.println("answer is "+ answer);

//		//factorial
		System.out.println("enter number to find factorial value");
		int no2=getInt();
		int fact=Factorial_no.factorial(no2);
		System.out.println("answer is "+ fact);
		
		int maxSize = 20; 
	    Mergesort a;
		a = new Mergesort(maxSize); 
		a.Insert(64); 
		a.Insert(21);
		a.Insert(33);
		a.Insert(70);
		a.Insert(12);
		a.Insert(85);
		a.Insert(44);
		a.Insert(3);
		a.Insert(99);
		a.Insert(0);
		a.Insert(108);
		a.Insert(36);
		a.display(); 
		a.mergesort(); 
		a.display();

	}

	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	public static int getInt() throws IOException
	{
		String s = getString();
		return Integer.parseInt(s);
	}
}