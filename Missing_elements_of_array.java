import java.util.*;
class Missing_elements_of_array
{
 int i;
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int[] arr=new int[size];
public void array_Input()
{
   System.out.println("enter elements of array:");
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
   

      for(i=0;i<arr.length-1;i++)
   {
     if(arr[i+1]-arr[i]==1)
     {
     }
     else
     {
      System.out.println(arr[i]+1+"is elements is missing from array");
     }
    }
}
public static void main(String args[])
{
    System.out.println("Enter size of array:");
    Missing_elements_of_array ob=new Missing_elements_of_array();
    ob.array_Input();
}
}