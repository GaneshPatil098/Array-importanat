import java.util.*;
class Pairs_elements_of_any_number
{
public static void main(String[] args)
{
  int i,j,count=0;
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
       
           if(arr[i]+arr[j]==x)
            {
              count++;
              System.out.println(arr[i]+" "+arr[j]);
            }
          
      }
    } 
   
 if(count==0)
{
  System.out.println("no pairs in array");
}

   
 
}
}