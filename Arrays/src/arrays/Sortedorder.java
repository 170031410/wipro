package arrays;

public class Sortedorder {
	public static void main(String args[])
	{
	int a[] = new int[]{4,7,2,8,6,16,12};
	int temp = 0;
	for (int i = 0; i<a.length; i++) {     
	for (int j = i+1; j <a.length; j++) {     
	if(a[i] >a[j]) {    
	temp = a[i];    
	a[i] = a[j];    
	a[j] = temp;    
	               }     
	            }     
	        }    
	System.out.println("Sorted Array Elements are : ");
	for (int i = 0; i<a.length; i++) {     
	System.out.print(a[i]+" " );    
	        }   
	}
	}



