import java.util.*;
class Sorting_array_ascending
{
  int i,j,spam;
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int[] arr=new int[size];
public void array_Input()
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
     
     System.out.println("Ascending array:");
    for(i=0;i<arr.length;i++)
    {
     for(j=i+1;j<arr.length;j++)
      {
       if(arr[i]>arr[j])
         {
          spam=arr[i];
          arr[i]=arr[j];
          arr[j]=spam;
         }
      }
    }

   for(i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
   }
public static void main(String[] args)
{
  System.out.println("Enter size of array:");
  Sorting_array_ascending ob=new Sorting_array_ascending();
   ob.array_Input();
}
}