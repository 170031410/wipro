package arrays;

public class SUM {
	public static void main(String args[])
	{
	int sum=0,i;
	boolean add = true;
	int n = args.length;
	int array[]=new int[] {1,2,3,6,4,5,7,8};
	for(i=0;i<n;i++)
	{
	array[i] = Integer.parseInt(args[i]); 
	}
	for(i=0; i<array.length;i++)
	    {

	if(array[i] != 6 && add==true)
	sum = sum+array[i];
	else if(array[i] == 6){
	if((i+1) == array.length)
	sum = sum+array[i];
	else
	add = false;
	        }
	else if(array[i] == 7)
	add = true;
	    }
	System.out.println(sum); 
	 }
	}

