import java.util.*;
class Transpose_matrix_with_diff_row_column
{
   int i,j;
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

System.out.println("transpose matrix:");
 int swap=row;
   row=col;
    col=swap;
   for(i=0;i<row;i++)
  {
  for(j=0;j<col;j++)
   {
     System.out.print(m[j][i]+" ");
   }
   System.out.println();
  }

 }
public static void main(String[] args)
  {
    System.out.println("Enter row size of matrix:");
    System.out.println("Enter column size of matrix:");
Transpose_matrix_with_diff_row_column ob=new Transpose_matrix_with_diff_row_column();
ob.input();
}
}