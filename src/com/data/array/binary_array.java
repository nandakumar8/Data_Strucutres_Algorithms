package com.data.array;

public class binary_array {
	
	private int max;
	private int [] array;
	private int key;
	public binary_array(int maxsize){
		
		this.max=maxsize;
		key=0;
		array=new int[max];
		
		
	}
	
	public void Display(){
		
		for(int i=0;i<max;i++)
		System.out.println(array[i]+"\n");
		
	}
	
	public void Insert(int value){
		
		array[key]=value;
		key++;
		
	}
	
	public void Find(int value){
		
		 int lowerbound=0;
	     int upperbound=max-1;
	     int cur;
	     
		 while(true){
			 cur=(lowerbound+upperbound)/2;
			
			if(array[cur]==value){
				 
				System.out.println("number found at:"+cur);
				break;
			
			}
			else if(array[cur]<value){
				
				lowerbound=cur+1;
				
				}
			else
				upperbound=cur-1;
			
		
		}
			
	}
    
	public void Delete(int value){
		
		for(int k=0;k<max;k++){
			
			if(array[k]==value){
				
				for(int l=k;l<max;l++){
					
					array[l]=array[l+1];
				    key--;
					}
				System.out.println("Number deleted at:"+k);
				
			}
			
		}

}
}
