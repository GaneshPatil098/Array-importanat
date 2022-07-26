import java.util.*;
class Odd_elements_of_array 
{
 public static void main(String args[])
  {
   int i;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter size of array:");
   int n=sc.nextInt();
   int[] arr=new int[n];
   System.out.println("Elements of array:");
   for(i=0;i<n;i++)
   {
    arr[i]=sc.nextInt();
   }
   System.out.println("odd elements of array");
   for(i=0;i<n;i++)
   {
    if(arr[i]%2!=0)
    {
     System.out.println(arr[i]);
    }
   }
  }
}