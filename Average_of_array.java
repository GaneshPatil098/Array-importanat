import java.util.*;
class Average_of_array
{
public static void main(String args[])
 {
 int i,sum=0,averg=0;
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
   sum=sum+arr[i];
  }
  System.out.println("sum of array="+sum);
  for(i=0;i<s;i++)
  {
   averg=sum/s;
  }
  System.out.println("average of array="+averg);
 }
}