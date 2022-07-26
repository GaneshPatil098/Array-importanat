import java.util.*;
class Anticlockwise_rotation_of_array
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
int x=arr[0];
for(i=0;i<arr.length-1;i++)
   {
     arr[i]=arr[i+1];
    } 
arr[arr.length-1]=x;
   System.out.println("after array");
     for(i=0;i<arr.length;i++)
   {
     System.out.print(arr[i]+" "); 
     }
   System.out.println();
 
}
}