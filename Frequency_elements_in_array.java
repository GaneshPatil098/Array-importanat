import java.util.*;
class Frequency_elements_in_array
{
public static void main(String args[])
 {
   int i,j,count=0;
  Scanner sc=new Scanner(System.in);
  int lock=-1;
  System.out.println("Enter size of array:");
  int s=sc.nextInt();
  int[] arr=new int[s];
  int[]b=new int[arr.length];
  System.out.println("Enter elements of array");
  for(i=0;i<s;i++)
  {
   arr[i]=sc.nextInt();
  }
 
  for(i=0;i<s;i++)
  {
  count=1;
   
     for(j=i+1;j<s;j++)
     {
    if(arr[i]==arr[j])
     {
       b[j]=lock;
       count++;
     }
     }
     if(b[i]!=lock)
     b[i]=count;
     }
     System.out.println("elements\t"+"frequency");
     for(i=0;i<s;i++)
  {
    if(b[i]!=lock)
    {
    System.out.println(arr[i]+"\t\t "+b[i]);
    }
  }

     
   
 }
}