import java.util.*;
class Deleting_duplicate_elements_from_array
{
  int i,j=0;
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  int[] arr=new int[size];
  public void input()
   {
    System.out.println("Enter elements of array:");
    for(i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
   
     System.out.println("Your array:");
    for(i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ");
      }
      System.out.println();
     for(i=0;i<arr.length-1;i++)
     {
       if(arr[i]!=arr[i+1])
         {
           arr[j]=arr[i];
            j++;
           }
         
     }
     arr[j]=arr[arr.length-1];
    
    for(i=0;i<=j;i++)
      {
        System.out.print(arr[i]+" ");
      }
      
   }
public static void main(String[] args)
{
  System.out.println("Enter size of array");
  Deleting_duplicate_elements_from_array ob=new Deleting_duplicate_elements_from_array();
  ob.input();
 }
}