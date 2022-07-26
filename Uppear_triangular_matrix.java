import java.util.*;
class Uppear_triangular_matrix
{
  int i,j,sum=0;
  Scanner sc=new Scanner(System.in);
  int row=sc.nextInt();
  int col=sc.nextInt();
int[][] m=new int[row][col];
public void input()
{  
  System.out.println("enter elements of matrix:");
  for(i=0;i<row;i++)
  {
  for(j=0;j<col;j++)
   {
    m[i][j]=sc.nextInt();
    }
  }
  System.out.println("your matrix:");
  for(i=0;i<row;i++)
  {
  for(j=0;j<col;j++)
   {
    System.out.print(m[i][j]+" ");
   }
System.out.println();
  }
System.out.println("diagonal matrix");
if(row==col)
{
   for(i=0;i<row;i++)
  {
  for(j=0;j<col;j++)
   {
     if(i<j)
     {
         System.out.print(0+" ");
      
     }
     else
     {
       System.out.print(m[i][j]+" ");
     }
   }
System.out.println();
  }
}
else
{
  System.out.println("matrix row and column are not equal");
}
 }
public static void main(String[] args)
  {
    System.out.println("Enter row size of matrix:");
    System.out.println("Enter column size of matrix:");
    Uppear_triangular_matrix ob=new Uppear_triangular_matrix();
    ob.input();
}
}