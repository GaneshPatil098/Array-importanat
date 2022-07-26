import java.util.*;
class Reverse_array
{
  int i;
 Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
int[] arr=new int[size];
public void input()
{
  System.out.println("Enter elements of array");
  for(i=0;i<arr.length;i++)
   {
     arr[i]=sc.nextInt(); 
     }

     System.out.println("your array");
  for(i=0;i<arr.length;i++)
   {
     System.out.print(arr[i]+" "); 
     }
   System.out.println();

   System.out.println("reversearray");
  for(i=arr.length-1;i>=0;i--)
   {
     System.out.print(arr[i]+" "); 
     }
   System.out.println();
  }
public static void main(String[] args)
{
   System.out.println("Enter size of array:");
Reverse_array ob=new Reverse_array();
ob.input();
  }
 }