import java.util.*;
class Merging_two_array_to_print_third_array
{
 public static void main(String args[])
 {
  int i;
  Scanner sc=new Scanner(System.in);
  int[] arr1=new int[10];
  int[] arr2=new int[5];
  int[] arr3=new int[15];


  System.out.println("Enter the first array elements:");
  for(i=0;i<10;i++)
  {
   arr1[i]=sc.nextInt();
  }


  System.out.println("Enter the second array elements:");
  for(i=0;i<5;i++)
  {
   arr2[i]=sc.nextInt();
  }


  System.out.println("Third array elements:");
  for(i=0;i<10;i++)
  {
   arr3[i]=arr1[i];
  }

   for(i=0;i<5;i++)
  {
   arr3[10+i]=arr2[i];
  }
   
  for(i=1;i<15;i++)
  {
   System.out.println(arr3[i]);
  }
 }
}