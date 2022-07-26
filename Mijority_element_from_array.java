import java.util.*;
class Mijority_element_from_array
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

for(i=0;i<arr.length;i++)
   {
    for(j=i+1;j<arr.length;j++)
     {
       
           if(arr[i]==arr[j])
            {
              count++;
              
            }
          
      }
     
   
 if(count>size/2)
{
  System.out.println(arr[i]+"is mijority elements in array");
}
else
{
  System.out.println(" In array is not any mijority elements");
}
break;
  
} 
}
}