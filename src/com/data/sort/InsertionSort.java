package com.data.sort;

public class InsertionSort{

	private int max;
	protected int nelements=0;
	private long[] a;
	public InsertionSort(int max){

		this.max=max;
		a=new long[max];

	}

	//insert into array

	public void insert(int value){

		a[nelements]=value;
		nelements=nelements+1;

	}

	//display elements

	public void display(){
		System.out.println("The elements are:"+"\n");
		for(int i=0;i<max;i++){

			System.out.println(a[i]);
		}

	}



	public void insertionSort(){

		int out,in;

		for(out=1;out<nelements;out++){

			long temp=a[out];
			in=out;

			while(in>0 && a[in-1]>=temp){

				a[in]=a[in-1];
				--in;

			}
			a[in]=temp;

		}


	}

}
