package com.data.linkedlist;



public class Doublelinked {


	private Doublelink first,last;

	public Doublelinked(){

		first=null;
		last=null;

	}

	public boolean isempty(){

		return (first==null);
	}

	public void insertFirst(double d){

		Doublelink a =new Doublelink(d);
		if(isempty()){

			last=a;		
			}
		else
		first.previous=a;
		a.next=first;
		first=a;
		
	}
	
	public Doublelink deletefirst(double k){
		
	     Doublelink temp=first;
		if(first.next==null){
			last=null;
			}
		else
			first.next.previous=null;
		    first=first.next;
		    
		    return temp;
	}
	
	public boolean insertAfter(double key, double dd)
	{ 
     Doublelink current = first; 
	while(current.d != key) 
	{
	current = current.next; 
	if(current == null)
	return false; 
	}
	Doublelink newDoublelink = new Doublelink(dd); 
	if(current==last) 
	{
	newDoublelink.next = null; 
	last = newDoublelink; 
	}
	else
	{
	newDoublelink.next = current.next; 
	
	current.next.previous = newDoublelink;
	}
	newDoublelink.previous = current; 
	current.next = newDoublelink; 
	return true; 
	}
	
	public Doublelink deleteKey(long key) 
	{
	Doublelink current = first; 
	
	while(current.d != key) 
	{
	current = current.next; 
	if(current == null)
	return null; 
	}
	if(current==first)
	first = current.next; 
	else 
	
	current.previous.next = current.next;
	if(current==last) 
	last = current.previous; 
	else 
	
	current.next.previous = current.previous;
	return current; 
	}
	
	public void displayForward()
	{
	
	Doublelink current = first; 
	while(current != null) 
	{
	current.displaylink(); 
	current = current.next; 
	}
	
	}
	
	public void displayBackward()
	{
	
	Doublelink current = last; 
	while(current != null) 
	{
	current.displaylink(); 
	current = current.previous; 
	}
}
}