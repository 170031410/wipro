package arrays;

public class LargeSmall2Nums {
	public static void main(String args[])
	{
	int a[] = new int[] {4,8,12,18,20};
	int i, max1, max2;
	int N = a.length;

	max1 = a[0];

	max2=a[0];

	for(i=0;i<N; i++){

	if(a[i]> max1)

	max1 = a[i];

	}

	for(i=0; i<N; i++){

	if(a[i]>max2 && a[i]!=max1)

	max2= a[i];

	}
	int min1 ,min2;
	min1 = min2 = Integer.MAX_VALUE; 
	for (i = 0; i< N ; i ++) 
	        { 
	if (a[i] < min1) 
	            { 
	min2 = min1; 
	min1 = a[i]; 
	            } 
	else if (a[i] < min2 && a[i] != min1) 
	min2 = a[i]; 
	        }
	System.out.println("Largest 2 numbers are: "+max1+" "+max2);
	System.out.println("Smallest 2 numbers are: "+min1+" "+min2);
	}
	}


