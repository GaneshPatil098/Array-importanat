import java.util.*;
class Inserting_an_element_at_position_in_array
{
 public static void main(String args[])
 {
  int i;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array");
  int s=sc.nextInt();
  int[] arr=new int[s+1];
  System.out.println("Enter Elements of array:");
  for(i=0;i<arr.length-1;i++)//arr.length/s
  {
   arr[i]=sc.nextInt();
  }
  System.out.println("Enter the position of insert elements of array");
  int pos=sc.nextInt();
  System.out.println("Enter the element you want to insert:");
  int x=sc.nextInt();
  for(i=arr.length-1;i>=(pos-1);i--)
  {
   arr[i+1]=arr[i];
  }
  arr[pos-1]=x;
  System.out.println("After inserting elements in array:");
  for(i=0;i<arr.length-1;i++)
  {
  System.out.println(arr[i]);
  }
  System.out.println(arr[arr.length-1]);
 }
}