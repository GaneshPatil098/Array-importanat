import java.util.*;
class Any_two_elements_sum_of_matrix
{
 public static void main(String args[])
 {
  int i,j,sum=0;
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
  System.out.println("As your wish enter two elements to add:");
  int a=sc.nextInt();
  int b=sc.nextInt();
  for(i=0;i<row;i++)
  {
   for(j=0;j<column;j++)
   {
    if(arr1[i][j]==a && arr1[i][j]==b);
    {
     sum=a+b;
    }
   
   }
  }
  System.out.println("sum of that two numbers="+sum);
 }
}