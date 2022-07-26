import java.util.*;
class Array_from_user
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
  System.out.println("enter elements:");
  for(i=0;i<row;i++)
  {
   for(j=0;j<column;j++)
   {
    arr[i][j]=sc.nextInt();
   }
  }
  System.out.println("your array:");
  for(i=0;i<row;i++)
  {
   for(j=0;j<column;j++)
   {
    System.out.print(arr[i][j]+"  ");
   }
   System.out.println(); 
  }
 }
}