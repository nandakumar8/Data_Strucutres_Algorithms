package com.data.array;

public class Main {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String args[]){

		int maxsize=500000000;
		linear_array arr = new linear_array(maxsize);

		for(int i=1;i<maxsize;i++){

			arr.Insert(i);

		}

		arr.Display();
		System.out.println("finding number");
		arr.Find(50000000);
		System.out.println("found number");
		 arr.Delete(19);
		 System.out.println("displaying elemets after deleting");
		arr.Display();

		binary_array bin=new binary_array(maxsize);

        for(int i=1;i<maxsize;i++){

			bin.Insert(i);

		}
	
        System.out.println("inserted values");

		System.out.println("finding number");
		bin.Find(50000000);
		System.out.println("found number");
	}
}
