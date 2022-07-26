import java.util.*;
class Second_minimum_elements_and_second_large_from_array
{
  public static void main(String args[])
  {
   int i,j,k;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter first Size array:");
   int size=sc.nextInt();
   int[] arr=new int[size];
   System.out.println("Enter elements of array:");
   for(i=0;i<size;i++)
   {
    arr[i]=sc.nextInt();
   }
   for(i=0;i<size;i++)
   {
    for(j=i+1;j<size;j++)
    {
     if (arr[i]>arr[j])
     {
       k=arr[i];
        arr[i]=arr[j];
       arr[j]=k;
     }
     System.out.println("Ascending order of array:");
      for(j=0;j<size;j++)
        {
           System.out.println(arr[j]);
        }
    }}
     // System.out.println("second small elements from array="+arr[1]);
    //  System.out.println("second large elements from array="+arr[size-2]);
     
    
   
  }
}