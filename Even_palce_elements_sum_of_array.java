import java.util.*;
class Even_palce_elements_sum_of_array 
{
 public static void main(String args[])
  {
   int i;
   int sum=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter size of array:");
   int n=sc.nextInt();
   int[] arr=new int[n];
   System.out.println("Elements of array:");
   for(i=0;i<n;i++)
   {
    arr[i]=sc.nextInt();
   }
   for(i=0;i<n;i++)
   {
    if(arr[i]%2==0)
    {
      sum=sum+arr[i];
    }
   }
   System.out.println("Sum of even place elements="+sum);
  }
}