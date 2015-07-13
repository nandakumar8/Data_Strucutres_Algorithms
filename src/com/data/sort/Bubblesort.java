package com.data.sort;

public class Bubblesort {

	private int max,nelements=0;
	private long[] a;
	public Bubblesort(int max){
		
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
	
	//bubblesort
  public void bubblesort(){
    	 
	  int out,in;
	  
	  for(out=nelements-1;out>1;out--){
		  
		  for(in=0;in<out;in++){
			  
			  if(a[in]>a[in+1]){
				  
				  swap(in,in+1);
				  
			  }
			  
			  
		  }
	  }
    	 
    	 
     }
   //swap method
	private void swap(int l, int m) {
		
		long temp=a[l];
		a[l]=a[m];
		a[m]=temp;
		
	}
	
	
	
}
