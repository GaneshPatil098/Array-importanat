import java.util.*;
class Printing_particular_elements_from_which_index
{
 public static void main(String args[])
 {
  int i;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size of array:");
  int n=sc.nextInt();
  int[] arr=new int[n];
  System.out.println("Enter elements of array");
  for(i=0;i<n;i++)
  {
   arr[i]=sc.nextInt();
  }
  System.out.println("Enter particular number:");
  int num=sc.nextInt();
  for(i=0;i<n;i++)
  {
   if(arr[i]==num)
  {
   System.out.println("particular number found at="+i);
   }
  }
 }
}