package com.data.linkedlist;

public class Main {

	public static void main(String args[]){
		
		Linkedlist list= new Linkedlist();
		list.insertFirst(1, 22);
		list.insertFirst(2, 22);
		list.insertFirst(4, 44);
		list.insertFirst(5,55);
		
		list.displaylist();
		
		while(!list.isEmpty()){
			
			Link a=list.deleteFirst();
			a.displaylinklist();
			
		}
		list.displaylist();
	}

   

}
