import java.util.*;
class Printing_repeated_element_from_array
{
 public static void main(String args[])
 {
  int i;
  int count=0;
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter size ofarray:");
   int n=sc.nextInt();
   int[] arr=new int[n];
   System.out.println("Enter elements of arary:");
   for(i=0;i<n;i++)
   {
    arr[i]=sc.nextInt();
   }
   System.out.println("particular elements in array");
   int par_num=sc.nextInt();
   for(i=0;i<n;i++)
   {
    if(arr[i]==par_num)
   {
    count++;
    }
   }
  System.out.println("particular elements counting from array="+count);
 } 
}