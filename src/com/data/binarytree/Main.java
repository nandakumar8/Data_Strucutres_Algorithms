package com.data.binarytree;

public class Main {
	
	
	public static void main(String args[]){
		
		
		Binarytree tree= new Binarytree();
		tree.insert(1, 22);
		tree.insert(2, 33);
		tree.insert(3, 44);
		tree.insert(4, 55);
		tree.insert(5, 6);
		System.out.println("inserted");
		Node temp;
		temp=tree.find(2);
		System.out.println(temp.key);
		
	}

}
