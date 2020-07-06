package arrays;

public class MaxMin {
	public static void main(String args[]) 
	{
		int a[]=new int[] {5,6,4,8,7};
		int n=a.length;
		int max = 0;
	
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		int min =a[0];
		for(int i=0;i<n;i++)
		{
			 if (a[i]<min)
				 min=a[i];
			
			
		}
		
		System.out.println("max value"+max);
		System.out.println("min value"+min);
		
		
	}

}
