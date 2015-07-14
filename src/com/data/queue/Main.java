package com.data.queue;

public class Main {

	public static void main(String args[]){

       Queue a = new Queue(5);
       a.insert(2);
       a.insert(3);
       a.insert(4);
       a.insert(5);
       a.peek();
       while(!a.isEmpty()){
    	   
    	   long n=a.remove();
    	   System.out.println(n);
    	   
    	    }

	}
}
