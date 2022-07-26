import java.util.*;
class Array_copy
{
 public static void main(String args[])
 {
  int i;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size of array:");
  int s=sc.nextInt();
  int[] arr1=new int[s];
  System.out.println("Enter elements of  first array");
  for(i=0;i<arr1.length;i++)
  {
   arr1[i]=sc.nextInt();
  }
  int[] arr2=new int[arr1.length];
  for(i=0;i<arr1.length;i++)
  {
   arr2[i]=arr1[i];
  }
  System.out.println("Elements of second array:");
  
   for(i=0;i<arr2.length;i++)
  {
   System.out.println(arr2[i]);
  }
 }
}