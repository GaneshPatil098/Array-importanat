import java.util.*;
class Sorting_ascending_elements_of_array
{
   int i,j;
 Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
int[] arr=new int[size];

public void input()
{
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

for(i=0;i<arr.length-1;i++)
   {
  for(j=i+1;j<arr.length;j++)
    {
      if(arr[i]>arr[j])
      {
        int swap=arr[i];
        arr[i]=arr[j];
        arr[j]=swap;
       }
      }
     }
     
   System.out.println("after array");
     for(i=0;i<arr.length;i++)
   {
     System.out.print(arr[i]+" "); 
     }
   System.out.println();
  
  }
public static void main(String[] args)
{
   System.out.println("Enter size of array:");
Sorting_ascending_elements_of_array ob=new Sorting_ascending_elements_of_array();
ob.input();
}
 }