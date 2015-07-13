package com.data.stack;

public class Stack {
	
	private long [] a;
	private int maxsize;
	private int top;
	
	public Stack(int max){
		
		this.maxsize=max;
		a=new long[maxsize];
		top=-1;
	}
	
	public void push(long j){
		
		
		a[++top]=j;
		
	}
   
	public long pop(){
		
		return a[top--];
		
	}
	
	public long peek(){
		
		return a[top];
	}
	
	public boolean isempty(){
		
		return(top==-1);
	}
	
	public boolean isfull(){
		
		return(top==maxsize-1);
	}

}
