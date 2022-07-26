import java.util.*;
class sum_of_even_index_elements_of_array
{
public static void main(String args[])
 {
 int i,sum=0,count1=0,count2=0,count3=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array:");
  int s=sc.nextInt();
  int[] arr=new int[s];
  System.out.println("Enter elements of array");
  for(i=0;i<s;i++)
  {
   arr[i]=sc.nextInt();
  }
  for(i=0;i<s;i++)
   {
   if(arr[i]==0)
     {
     count1;
     }
    else if(arr[i]%2==0)
      {
       count2;
      }
     else
     {
      count3;
     }
   }
   System.out.println("no of 0 in array="+count1);  
   System.out.println("no of even in array="+count2);
   System.out.println("no of odd in array="+count3);
 }
}