package com.data.recursion;

public class Mergesort {

	private int nelements;
	private long[] a;
	private int max;

	public Mergesort(int max){
		this.max=max;
		a=new long[max];
		nelements=0;

	}

	public void Insert(long value){

		a[nelements]=value;
		nelements++;

	}

	public void display(){

		for(int i=0;i<nelements;i++){

			System.out.println(a[nelements]+"\n");
		}
	}
	public void mergesort(){

		long [] workspace=new long[nelements];
		recmerge(workspace,0,nelements-1);

	}

	public void recmerge(long [] workspace,int lowerbound,int upperbound){


		if(lowerbound==upperbound){
			return;}
		else{
			int mid=(lowerbound+upperbound)/2;

			recmerge(workspace,lowerbound,mid);
			recmerge(workspace,mid+1,upperbound);
			merge(workspace,lowerbound,mid+1,upperbound);

		}
	}

	public void merge(long[] workspace,int lowptr,int highptr,int upperbound ){

		int j = 0; 
		int lowerbound = lowptr;
		int mid = highptr-1;
		int n = upperbound-lowerbound+1; 
		while(lowptr <= mid && highptr <= upperbound)
			if( a[lowptr] < a[highptr] )
				workspace[j++] = a[lowptr++];
			else
				workspace[j++] = a[highptr++];
		while(lowptr <= mid)
			workspace[j++] = a[lowptr++];
		while(highptr <= upperbound)
			workspace[j++] = a[highptr++];
		for(j=0; j<n; j++)
			a[lowerbound+j] = workspace[j];

	}

}


