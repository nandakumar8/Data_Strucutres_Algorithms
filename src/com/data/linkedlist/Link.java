package com.data.linkedlist;

public class Link {

	private int i;
	private double d;
	public Link next;
	
	public Link(int i ,double d){
		
		this.i=i;
		this.d=d;
	}
	public void displaylinklist(){
		
		System.out.println(i+d);
		
	}
}
