import java.util.*;
class Converting_first_elements_to_last_elemenst_of_array
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

for(i=0;i<arr.length;i++)
   {
     int swap=arr[0];
      arr[0]=arr[arr.length-1];
       arr[arr.length-1]=swap; 
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
Converting_first_elements_to_last_elemenst_of_array ob=new Converting_first_elements_to_last_elemenst_of_array();
 ob.input();
 }
}