import java.util.*;
class Converting_first_element_to_last_of_array
{
 public static void main(String args[])
 {
  int i;
  int k;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array:");
  int n=sc.nextInt();
  int[] arr=new int[n];
  System.out.println("Enter any number:");
  for(i=0;i<n;i++)
   {
    arr[i]=sc.nextInt();
   }
   
   k=arr[0];
   arr[0]=arr[n-1];
   arr[n-1]=k;
  {
    System.out.println("converting first elements to last elements");
  }
  for(i=0;i<n;i++)
  {
   System.out.println(arr[i]);
  }
 }
}