import java.util.*;
class Clockwise_rotation_upto_n_rotation
{
    Scanner sc=new Scanner(System.in);
int i,j;
int size=sc.nextInt();
int[] arr=new int[size];
public void input()
  {
   System.out.println("Enter elements of array:");
   for(i=0;i<arr.length;i++)
   {
    arr[i]=sc.nextInt();
   } 
   System.out.println("your array:");
   for(i=0;i<arr.length;i++)
   {
    System.out.print(arr[i]+" ");
   }
   System.out.println();
 System.out.println("enter number upto rotate array:");
int num=sc.nextInt();
  for(i=0;i<num;i++)
   {
    int k=arr[arr.length-1];
    for(j=arr.length-2;j>=0;j--)
       {
         arr[j+1]=arr[j];
       } 
      arr[0]=k;
   }
   System.out.println("your array:");
   for(i=0;i<arr.length;i++)
   {
    System.out.print(arr[i]+" ");
   }
   System.out.println();
}
public static void main(String[] args)
 {
   System.out.println("Enter size of array:");
Clockwise_rotation_upto_n_rotation ob=new Clockwise_rotation_upto_n_rotation();
ob.input();
 }
}