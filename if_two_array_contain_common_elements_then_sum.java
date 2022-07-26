import java.util.*;
class if_two_array_contain_common_elements_then_sum
{
 public static void main(String[] args)
{
int i,j,k,sum=0;
  int[] arr1={2,3,7,10,12};
  int[] arr2={1,5,7,8}; 
   System.out.println("your first array");
   for(i=0;i<arr1.length;i++)
   {
     System.out.print(arr1[i]+" ");
   }
   System.out.println();
  System.out.println("your second array");
   for(j=0;j<arr2.length;j++)
   {
     System.out.print(arr2[j]+" ");
   }
   System.out.println();
   for(i=0;i<arr1.length;i++)
     {
    for(j=0;j<arr2.length;j++)
        {
      
      if(arr1[i]==arr2[j])
       {
        for(i=0;i<=j;i++)
         {
          sum=sum+arr2[i];
         } 
         for(k=i;k<arr1.length;k++)
          {
           sum=sum+arr1[k];
          }
        }
       }
     }
    System.out.println("sum="+sum);
}
}