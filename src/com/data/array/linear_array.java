package com.data.array;

public class linear_array {
	
	private int max;
	private int [] array;
	private int key;
	public linear_array(int maxsize){
		
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
		
		for(int j=0;j<max;j++){
			
			if(array[j]==value){
				
				System.out.println("number found at:"+j);
				break;
			
			}
			
		
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
