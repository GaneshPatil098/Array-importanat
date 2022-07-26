import java.util.*;
class Array_substraction
{
 public static void main(String args[])
 {
  int i,j;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter row size:");
  int row=sc.nextInt();
  System.out.println("enter column size:");
  int column=sc.nextInt();
  int[][] arr=new int[row][column];
  int[][] arr1=new int[row][column];
  int[][] arr2=new int[row][column];
  System.out.println("enter first array elements:");
  for(i=0;i<row;i++)
  {
   for(j=0;j<column;j++)
   {
    arr[i][j]=sc.nextInt();
   }
  }
  System.out.println("enter second array elements:");
  for(i=0;i<row;i++)
  {
   for(j=0;j<column;j++)
   {
    arr1[i][j]=sc.nextInt();
   }
  }
    
    for(i=0;i<row;i++)
  {
   for(j=0;j<column;j++)
   {
    arr2[i][j]=arr[i][j]-arr1[i][j];
   }
  System.out.println("sum of 1st and 2nd array:");
  for(i=0;i<row;i++)
  {
   for(j=0;j<column;j++)
   {
    System.out.println(arr2[i][j]);
   }
  }
  }
 }
}