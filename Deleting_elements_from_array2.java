import java.util.*;
class Deleting_elements_from_array2
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
System.out.println("enter elements delete from array:");
int x=sc.nextInt();
for(i=0;i<arr.length;i++)
   {
   if(arr[i]==x)
   {
     for(j=i;j<arr.length-1;j++)
    {
       arr[j]=arr[j+1];
      }
     }
    } 
   System.out.println("after array");
     for(i=0;i<arr.length-1;i++)
   {
     System.out.print(arr[i]+" "); 
     }
   System.out.println();
 
}
}