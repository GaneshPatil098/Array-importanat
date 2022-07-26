import java.util.*;
class Deleting_elements_from_array
{
  int i,j;
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

     System.out.println("Enter elements deleting from array:");
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
     System.out.println("after array:");
     for(i=0;i<arr.length-1;i++)
     {
      System.out.print(arr[i]+" ");
     }
      System.out.println();
   }
public static void main(String[] args)
{
  System.out.println("Enter size of array:");
  Deleting_elements_from_array ob=new Deleting_elements_from_array();
  ob.array_Input();
 }
}