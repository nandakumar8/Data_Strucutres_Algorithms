package com.data.sort;

public class Main {

	public static void main(String args[]){

		int max=20;
		Bubblesort a=new Bubblesort(max);

		a.insert(77); 
		a.insert(99);
		a.insert(44);
		a.insert(55);
		a.insert(22);
		a.insert(88);
		a.insert(11);
		a.insert(00);
		a.insert(66);
		a.insert(33);

		a.display();
		a.bubblesort();
		System.out.println("after sorting"+"/n");
		a.display();

		SelectionSort b=new SelectionSort(max);

		b.insert(77); 
		b.insert(99);
		b.insert(44);
		b.insert(55);
		b.insert(22);
		b.insert(88);
		b.insert(11);
		b.insert(00);
		b.insert(66);
		b.insert(33);

		b.display();
		b.selectionsort();
		System.out.println("after selection sorting"+"/n");
		b.display();

		InsertionSort c=new InsertionSort(max);
		c.insert(77); 
		c.insert(99);
		c.insert(44);
		c.insert(55);
		c.insert(22);
		c.insert(88);
		c.insert(11);
		c.insert(00);
		c.insert(66);
		c.insert(33);

		c.display();
		c.insertionSort();
		System.out.println("after insertion sorting"+"\n");
		c.display();

	}

}
