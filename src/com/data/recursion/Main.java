package com.data.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String args[]) throws IOException{
		//triangular	
		System.out.println("enter number to find traingular value");
		int no=getInt();
		int answer=Triangular_no.triangle(no);
		System.out.println("answer is "+ answer);

		//factorial
		System.out.println("enter number to find factorial value");
		int no2=getInt();
		int fact=Factorial_no.factorial(no2);
		System.out.println("answer is "+ fact);

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