package arrays;

public class Findvalue {
	public static void main(String args[])
	{
	int k = 2;
	int[] a = new int[]{1,3,4,5,6,7};
	int n = a.length;
	int flag=0;
	int i;
	for(i = 0; i< n; i++)
	        {
	if(a[i] == k)
	            {
	    flag = 1;
	break;
	            }
	else
	            {
	flag = 0;
	            }
	        }
	if(flag == 1)
	        {
	System.out.println("Element found at position:"+(i));
	        }
	else
	        {
	System.out.println("-1");
	        }
	}
	}


