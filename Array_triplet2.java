import java.util.*;
class Array_triplet2
{
public static void main(String[] args)
{
  int i,j,k,count=0;
 Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array:");
  int size=sc.nextInt();
int[] arr=new int[size];


  System.out.println("Enter elements of array");
  for(i=0;i<size;i++)
   {
     arr[i]=sc.nextInt(); 
     }

     System.out.println("your array");
  for(i=0;i<size;i++)
   {
     System.out.print(arr[i]+" "); 
     }
   System.out.println();
System.out.println("Enter any number to find triplet:");
int x=sc.nextInt();
for(i=0;i<arr.length;i++)
   {
    for(j=i+1;j<arr.length;j++)
     {
       for(k=j+1;k<arr.length;k++)
         {
           if(arr[i]+arr[j]+arr[k]==x)
            {
              count++;
              System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
            }
          }
      }
    } 
   
 if(count>0)
{
  System.out.println("array is triplet");
}
else
{
  System.out.println("array is not triplet");
}
   
 
}
}