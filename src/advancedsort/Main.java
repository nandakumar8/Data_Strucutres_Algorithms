package advancedsort;

public class Main {
	
	public static void main(String args[]){
	
	int maxSize = 20;
	Shellsort a;
	a = new Shellsort(maxSize); 
	for(int j=0; j<maxSize; j++)
	{ 
	long n = (int)(java.lang.Math.random()*99);
	a.insert(n);
	}
	a.display(); 
	a.shellSort(); 
	a.display(); 

}
}
