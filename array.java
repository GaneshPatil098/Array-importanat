import java.util.*;
class array
{
 public static void main(String args[])
 {
  int i;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array:");
  int n=sc.nextInt();
  int[] a=new int[n];
   System.out.println("Enter elements of array");
  for(i=0;i<a.length;i++)
  {
   a[i]=sc.nextInt();
  }
  System.out.println("your array");
  for(i=0;i<a.length;i++)
  {
   System.out.println(a[i]);
  }
  int max=a[0];
  for(i=0;i<a.length;i++)
  {
   if(a[i]>max)
   {
    max=a[i];
   }
  }
  System.out.println("minimum elements="+max);
 }
}