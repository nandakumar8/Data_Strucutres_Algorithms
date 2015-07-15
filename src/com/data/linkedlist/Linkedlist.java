package com.data.linkedlist;

public class Linkedlist {


	private Link first;

	public Linkedlist(){

		first=null;
	}

	public boolean isEmpty(){

		return(first==null);
	}

	public void insertFirst(int i, double d){

		Link a = new Link(i, d);
		a.next=first;
		first=a;

	}

	public Link deleteFirst(){

		Link temp=first;
		first=first.next;
		return temp;
	}

	public void displaylist(){

		Link current=first;
		while(current!=null){

			current.displaylinklist();
			current=current.next;

		}
		System.out.println(" ");
	}
}
