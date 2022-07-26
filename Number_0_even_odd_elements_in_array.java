import java.util.*;
class Number_0_even_odd_elements_in_array
{
public static void main(String args[])
 {
 int i,sum=0,count1=0,count2=0,count3=0;
 int evensum=0,oddsum=0;
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
     count1++;
     }
    else if(arr[i]%2==0)
      {
       evensum=evensum+arr[i];
       count2++;
      }
     else
     {
      oddsum=oddsum+arr[i];
      count3++;
     }
   }
   System.out.println(" 0 elments in array="+count1);  
   System.out.println(" even no elements in array="+count2);
   System.out.println("odd no elements in array="+count3);
   System.out.println("sum of even elments in array="+evensum);
   System.out.println("sum of odd elements in array="+oddsum);
 }
}