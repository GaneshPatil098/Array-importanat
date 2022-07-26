import java.util.*;
class Transpose_matrix
{
 public static void main(String args[])
 {
  int i,j,count=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter row size:");
  int row=sc.nextInt();
  System.out.println("enter column size:");
  int column=sc.nextInt();
  int[][] arr1=new int[row][column];
  System.out.println("enter array elements:");
  for(i=0;i<row;i++)
  {
   for(j=0;j<column;j++)
   {
    arr1[i][j]=sc.nextInt();
   }
  }
  System.out.println("printing array:");
  for(i=0;i<row;i++)
  {
   for(j=0;j<column;j++)
   {
    System.out.print(arr1[i][j]+" ");
   }
   System.out.println();
  }
  System.out.println("transpose matrix:");
  for(i=0;i<row;i++)
  {
   for(j=0;j<column;j++)
   {
    System.out.print(arr1[j][i]+" ");
   }
   System.out.println();
  }

 }
}