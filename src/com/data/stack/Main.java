package com.data.stack;

public class Main {
	
	
	public static void main(String args[]){
	Stack a=new Stack(5);
	a.push(1);
	a.push(2);
	a.push(3);
	a.push(4);
	a.push(5);
	
	a.peek();
	
	while(!a.isempty()){
		
	long value=	a.pop();
	System.out.println("value popped:"+ value+"\n");
	
			
	}
	
	}
}
