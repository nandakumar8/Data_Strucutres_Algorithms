package com.data.sort;

public class SelectionSort {

	private int max;
	protected int nelements=0;
	private long[] a;
	public SelectionSort(int max){

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


	//selection sort
	
	public void selectionsort(){
		
		int out,in,min;
		
		for(out=0;out<nelements-1;out++){
			
			min=out;
			for(in=out+1;in<nelements;in++){
				
				if(a[in]<a[min]){
					min=in;
				}
				
			}
			swap(out,min);
			
		}
		
	}
	
private void swap(int l, int m) {
		
		long temp=a[l];
		a[l]=a[m];
		a[m]=temp;
		
	}
	
	


}
