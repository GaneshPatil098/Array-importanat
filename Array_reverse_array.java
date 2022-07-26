import java.util.*;
class Array_reverse_array
{
 public static void main(String args[])
 {
   int i;
  Scanner sc=new Scanner(System.in);
  int[] a=new int[10];
  System.out.println("enter elements");
  for(i=0;i<10;i++)
  {
   a[i]=sc.nextInt();
  }
  System.out.println("your array:");
  for(i=0;i<10;i++)
  {
   System.out.println(a[i]);
  }
  System.out.println("reverse array:");
  for(i=9;i>=0;i--)
  {
   System.out.println(a[i]);
  }
 }
}