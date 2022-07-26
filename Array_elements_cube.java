import java.util.*;
class Array_elements_cube
{
 public static void main(String args[])
 {
   int i;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size of array");
  int n=sc.nextInt();
  int[] a=new int[n];
  System.out.println("enter elements");
  for(i=0;i<n;i++)
  {
   a[i]=sc.nextInt();
  }
  System.out.println("your array");
  for(i=0;i<n;i++)
  {
   System.out.println(a[i]*a[i]*a[i]);
  }
 }
}