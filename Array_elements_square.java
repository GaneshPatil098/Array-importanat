import java.util.*;
class Array_elements_square
{
 public static void main(String args[])
 {
   int i;
  int[] a=new int[10];
  Scanner sc=new Scanner(System.in);
  System.out.println("enter elements of array:");
  for(i=0;i<10;i++)
  {
   a[i]=sc.nextInt();
  }
  System.out.println("your array square");
  for(i=0;i<10;i++)
  {
   System.out.println(a[i]*a[i]);
  }
 }
}