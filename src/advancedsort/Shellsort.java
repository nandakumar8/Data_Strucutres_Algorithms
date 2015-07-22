package advancedsort;

public class Shellsort {


	private long[] a; 
	private int nElements; 

	public Shellsort(int max) 
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
		System.out.println(" ");	}

	public void shellSort()
	{
		int inner, outer;
		long temp;
		int h = 1; 
		while(h <= nElements/3)
			h = h*3 + 1; 
		while(h>0) 
		{

			for(outer=h; outer<nElements; outer++)
			{
				temp = a[outer];
				inner = outer;

				while(inner > h-1 && a[inner-h] >= temp)
				{
					a[inner] = a[inner-h];
					inner -= h;

				}
				a[inner] = temp;
			} 
			h = (h-1) / 3; 
		} 
	} 
} 




