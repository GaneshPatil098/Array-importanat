import java.util.*;
class Clock_rotation_of_array
{
 public static void main(String args[])
 {
  int i,k;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array");
  int s=sc.nextInt();
  int[] arr=new int[s];
  System.out.println("Enter Elements of array:");
  for(i=0;i<s;i++)
  {
   arr[i]=sc.nextInt();
  }
  k=arr[s-1];
  for(i=s-2;i>=0;i--)
  {
   arr[i+1]=arr[i];
  }
  arr[0]=k;
  System.out.println("rotated array:");
  for(i=0;i<s;i++)
  {
  System.out.println(arr[i]);
  }
 }
}