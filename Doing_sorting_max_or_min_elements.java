import java.util.*;
class Doing_sorting_max_or_min_elements
{
 public static void main(String args[])
 {
  int i,j,k;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array:");
  int s=sc.nextInt();
  int[] arr=new int[s];
  System.out.println("Enter elemnts of array:");
  for(i=0;i<arr.length;i++)
  {
   arr[i]=sc.nextInt();
  }
  for(i=0;i<arr.length;i++)
  {
   for(j=i+1;j<arr.length;j++)
   {
    if(arr[i]>arr[j])
     {
      k=arr[j];
      arr[j]=arr[i];
      arr[i]=k;
     }
   }
  }
  System.out.println("Asscending order of array:");
  for(i=0;i<arr.length;i++)
  {
  System.out.println(arr[i]);
  }
  System.out.println("minimum elements of array:");
  System.out.println(arr[0]);
  System.out.println("miximum elements of array:");
  System.out.println(arr[arr.length-1]);
 }
}