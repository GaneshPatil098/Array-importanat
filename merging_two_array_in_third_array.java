import java.util.*;
class  merging_two_array_in_third_array
{
 public static void main(String args[])
 {
  int index;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of first array:");
  int size1=sc.nextInt();
  int[] arr1=new int[size1];
  System.out.println("Enter size of second array:");
  int size2=sc.nextInt();
  int[] arr2=new int[size2];
  int[] arr3=new int[arr1.length+arr2.length];
  System.out.println("Enter elements of first array:");
  for(index=0;index<arr1.length;index++)
  {
   arr1[index]=sc.nextInt();
  }
  System.out.println("Enter elements of second array:");
  for(index=0;index<arr2.length;index++)
  {
   arr2[index]=sc.nextInt();
  }
  for(index=0;index<arr1.length;index++)
  {
   arr3[index]=arr1[index];
  }
  for(index=0;index<arr2.length;index++)
  {
   arr3[arr1.length+index]=arr2[index];
  }
  System.out.println("After merging first array and second array:");
System.out.println(" arr3[index]"+"\t"+"elements"+" ");
  for(index=0;index<arr3.length;index++)
  {
   System.out.println("arr3["+index+"]"+"\t\t "+arr3[index]+" ");
  }
 }
}