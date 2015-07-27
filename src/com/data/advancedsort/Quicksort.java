package com.data.advancedsort;

public class Quicksort {

	private long[] a; 
	private int nElements; 

	public Quicksort(int max) 
	{
		a = new long[max];
		nElements = 0; 
	}

	public void insert(long value) 
	{
		a[nElements] = value; 
		nElements++; 
	}

	public void display() 
	{
		System.out.print("a=");
		for(int j=0; j<nElements; j++) 
			System.out.print(a[j] + " "); 
		System.out.println(" ");	
	}


	public void quick(){

		recquick(0,nElements-1);
	}

	public void recquick(int left,int right){

		if(right-left<=0){

			return;
		}
		else{
			long pivot=a[right];
			int partition=partitionIt( left, right, pivot);
			recquick(left,partition-1);
			recquick(partition+1,right);
		}
	}


	public int partitionIt(int left,int right,long pivot){

		int leftptr=left-1;
		int rightptr=right;
		while(true){


			while(a[++leftptr]<pivot){

			}

			while(rightptr>0 && a[--rightptr]>pivot){

			}

			if(leftptr>=rightptr)
				break;

			else
				swap(leftptr,rightptr);
		}
		swap(leftptr,right);
		return leftptr;
	}


	public void swap(int i, int j){

		long temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}


}

