import java.util.*;
class Inserting_element_in_array
{
  int i;
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int[] arr=new int[size+1];
public void input()
  {
   System.out.println("Enter elements of array:");
   for(i=0;i<size;i++)
    {
     arr[i]=sc.nextInt();
     }
     
    System.out.println("your  array:");
   for(i=0;i<size;i++)
    {
     System.out.print(arr[i]+" ");
    }
    System.out.println();

    System.out.println("enter position to add elements in array:");
    int pos=sc.nextInt();
    System.out.println("enter elements to wish add  in array:");
    int x=sc.nextInt();e
   for(i=arr.length-1;i>=(pos-1);i--)
    {
      arr[i]=arr[i-1];
    }
   arr[pos-1]=x;

 System.out.println("after  array:");
   for(i=0;i<arr.length;i++)
    {
     System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
public static void main(String[] args)
  {
     System.out.println("Enter size of array:");
    Inserting_element_in_array ob=new Inserting_element_in_array();
    ob.input();
  }
}