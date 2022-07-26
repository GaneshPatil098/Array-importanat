import java.util.*;
class Clockwise_rotation
{
  Scanner sc=new Scanner(System.in);
int i;
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
   int k=arr[arr.length-1];
    for(i=arr.length-2;i>=0;i--)
      {
        arr[i+1]=arr[i];
      }
    arr[0]=k;
    System.out.println("After clockwise rotation your array:");
   for(i=0;i<arr.length;i++)
   {
    System.out.print(arr[i]+" ");
   }
   System.out.println(); 
  }
public static void main(String[] args)
   {
    System.out.println("Enter size of array:");
   Clockwise_rotation ob=new Clockwise_rotation();
    ob.input();
  }
}