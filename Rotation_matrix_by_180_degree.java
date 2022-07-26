import java.util.*;
class Rotation_matrix_by_180_degree
{
   int i,j,colsum;
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

  System.out.println("after rotation of matrix by 180 degree:");
  for(i=row-1;i>=0;i--)
  {
  for(j=col-1;j>=0;j--)
   {
    System.out.print(m[i][j]+" ");
   }
System.out.println();
  }

}


 
public static void main(String[] args)
  {
    System.out.println("Enter row size of matrix:");
    System.out.println("Enter column size of matrix:");
    Rotation_matrix_by_180_degree ob=new Rotation_matrix_by_180_degree();
    ob.input();
}
}