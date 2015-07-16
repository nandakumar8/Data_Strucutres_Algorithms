package com.data.linkedlist;

public class Doublelink {
 
	public double d;
	public Doublelink next, previous;
	
	public Doublelink(double d){
		
		this.d=d;
		next=null;
		previous=null;
	}
	
	public void displaylink(){
		
		System.out.println(d);
	}
}
