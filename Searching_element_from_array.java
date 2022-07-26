import java.util.*;
class Searching_element_from_array
{
 public static void main(String args[])
 {
  int index;
  boolean found=false;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array");
  int size=sc.nextInt();
  int[] arr=new int[size];
  System.out.println("Enter elements of an array:");
  for(index=0;index<arr.length;index++)
  {
   arr[index]=sc.nextInt();
  }
  System.out.println(" Enter Elements to find from array:");
  int k=sc.nextInt();
   for(index=0;index<arr.length;index++)
  {
   if(arr[index]==k)
   {
    found=true;
    break;
   }
  }
   if(found==true)
   System.out.println("Found");
   else
   System.out.println("not found");
  
 }
}