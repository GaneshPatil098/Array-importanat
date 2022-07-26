import java.util.*;
class Decending_order_of_array_sorting
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
    if(arr[i]<arr[j])
     {
      k=arr[j];
      arr[j]=arr[i];
      arr[i]=k;
     }
   }
  }
  System.out.println("decending order of array:");
  for(i=0;i<arr.length;i++)
  {
  System.out.println(arr[i]);
  }
  
 
 }
}