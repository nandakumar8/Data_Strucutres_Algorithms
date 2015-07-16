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
		
		
		Doublelinked a= new Doublelinked();
		a.insertFirst(22);
		a.insertAfter(2 ,44);
		a.insertAfter(4,55);
        a.deleteKey(4);
        a.displayForward();
        a.displayBackward();
	}

     

}
