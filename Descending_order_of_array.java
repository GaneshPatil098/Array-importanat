import java.util.*;
class Descending_order_of_array
{
 int i,j,spam;
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int[] arr=new int[size];
public void array_Input()
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
    for(j=i+1;j<arr.length;j++)
    {
     if(arr[i]<arr[j])
      {
        spam=arr[i];
        arr[i]=arr[j];
        arr[j]=spam;       
        }
    }
 }
  System.out.println("Descending array");
  for(i=0;i<arr.length;i++)
   {
    System.out.print(arr[i]+" ");
   }
   System.out.println();
}
public static void main(String[] args)
{
    System.out.println("Enter size of array:");
    Descending_order_of_array ob=new Descending_order_of_array();
    ob.array_Input();
}
}