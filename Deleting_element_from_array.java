import java.util.*;
class Deleting_element_from_array
{
 public static void main(String args[])
 {
  int i;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array:");
  int s=sc.nextInt();
  int[] arr=new int[s];
  System.out.println("Elements of array:");
  for(i=0;i<arr.length;i++)
  {
   arr[i]=sc.nextInt();
  }
  System.out.println("Enter the number do you want to delete:");
  int num=sc.nextInt();
  for(i=0;i<arr.length;i++)
  {
  if(arr[i]==num)
  {
   for(int j=i;j<arr.length-1;j++)
   {
    arr[j]=arr[j+1];
   }
  }
  }
  System.out.println("after deleting elements array:");
  for(i=0;i<arr.length-1;i++)
  {
   System.out.println(arr[i]);
 }
 }
}