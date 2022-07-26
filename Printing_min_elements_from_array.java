import java.util.*;
class Printing_min_elements_from_array 
{
 public static void main(String args[])
 {
  int i;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array:");
  int n=sc.nextInt();
  int[] arr=new int[n];
  System.out.println("Enter any elements are array:");
  for(i=0;i<n;i++)
  {
   arr[i]=sc.nextInt();
  }
  int min=arr[0];
  for(i=0;i<n;i++)
   {
    if(arr[i]<min)
    {
     min=arr[i];
	}
   }
  System.out.println("minimum elements of array="+min);
 }
}