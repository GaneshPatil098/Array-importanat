import java.util.*;
class Copy_array
{
  int i;
 Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
int[] arr=new int[size];
int[] arr2=new int[arr.length];
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

for(i=0;i<arr.length;i++)
   {
     arr2[i]=arr[i]; 
     }
     
   System.out.println("copy array");
     for(i=0;i<arr2.length;i++)
   {
     System.out.print(arr2[i]+" "); 
     }
   System.out.println();
  }
public static void main(String[] args)
{
   System.out.println("Enter size of array:");
   Copy_array ob=new Copy_array();
   ob.input();
 }
}