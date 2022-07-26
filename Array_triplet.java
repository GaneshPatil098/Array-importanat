import java.util.*;
class Array_triplet
{
  Scanner sc=new Scanner(System.in);
int i,j,k;
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
  System.out.println("Enter any number:");
  int num=sc.nextInt();
 for(i=0;i<arr.length;i++)
   {
    for(j=i+1;j<arr.length;j++)
    {
     for(k=j+1;k<arr.length;k++)
      {
        if(arr[i]+arr[j]+arr[k]==num)
          {
            System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
          } 
      }
    }
   }
 }
public static void main(String[] args)
  {
   System.out.println("Enter size of array:");
   Array_triplet ob=new Array_triplet();
   ob.input();
 }
}