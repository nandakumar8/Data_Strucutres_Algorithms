package com.data.binarytree;

public class Node {
   
	public int key;
	public int data;
	
	public Node(int key,int data){
		
		this.key=key;
		this.data=data;
	}
	
	Node leftchild;
	Node rightchild;
}
