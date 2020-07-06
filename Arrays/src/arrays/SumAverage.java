package arrays;

public class SumAverage {
 public static void main(String []args)
 {
 int a[]=new int[] {1,2,3,4,5,6};
 int n=a.length;
   int sum=0;
   int i;
   double average;
   
   for(i=0;i<n;i++)
   {
   
   sum=sum+a[i];
}
   System.out.println("the sum is"+sum);
   average=sum/n;
   System.out.println("the average is"+average);
 }
}

