import java.util.*;
class Rotation_clockwise
{
public static void main(String[] args)
{
  int i,j;
 Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array:");
  int size=sc.nextInt();
int[] arr=new int[size];


  System.out.println("Enter elements of array");
  for(i=0;i<size;i++)
   {
     arr[i]=sc.nextInt(); 
     }

     System.out.println("your array");
  for(i=0;i<size;i++)
   {
     System.out.print(arr[i]+" "); 
     }
   System.out.println();
int x=arr[arr.length-1];
for(i=arr.length-2;i>=0;i--)
   {
     arr[i+1]=arr[i];
    } 
arr[0]=x;
   System.out.println("after array");
     for(i=0;i<arr.length;i++)
   {
     System.out.print(arr[i]+" "); 
     }
   System.out.println();
 
}
}