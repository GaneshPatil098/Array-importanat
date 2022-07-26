import java.util.*;
class Searching_elements_in_array
{
 public static void main(String args[])
 {
  int i,j,count=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter row size:");
  int row=sc.nextInt();
  System.out.println("enter column size:");
  int column=sc.nextInt();
  int[][] arr=new int[row][column];
  System.out.println("enter first array elements:");
  for(i=0;i<row;i++)
  {
   for(j=0;j<column;j++)
   {
    arr[i][j]=sc.nextInt();
   }
  }
  System.out.println("enter array elements to search:");
   int k=sc.nextInt();
  for(i=0;i<row;i++)
  {
   for(j=0;j<column;j++)
   {
    if(arr[i][j]==k)
     count++;
   }
  }
  if(count>0)
  System.out.println("searching elements="+count+" "+"times");  
  else
  System.out.println("elements not found");  
 }
}