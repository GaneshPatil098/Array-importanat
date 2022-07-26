import java.util.*;
class Frequency_of_array
{
public static void main(String[] args)
{
  int i,j,count,lock=-1;
 Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array:");
  int size=sc.nextInt();
int[] arr=new int[size];
int[] fre=new int[arr.length];

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

for(i=0;i<arr.length-1;i++)
   {
    count=1;
     for(j=i+1;j<arr.length;j++)
     {
     if(arr[i]==arr[j])
        {
          fre[j]=lock;
          count++;
        }
      if(fre[i]!=lock)
         {
           fre[i]=count;
          }
      }
    } 

   System.out.println("Elements"+"\t"+"frequency");
     for(i=0;i<arr.length;i++)
   {
    if(fre[i]!=lock)
     {
     System.out.println(arr[i]+"\t"+fre[i]+" "); 
     }
}
   
 
}
}