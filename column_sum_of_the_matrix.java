import java.util.*;
class column_sum_of_the_matrix
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

   for(i=0;i<row;i++)
  {
   colsum=0;
  for(j=0;j<col;j++)
   {
     colsum=colsum+m[j][i];
      System.out.print(m[j][i]+" ");
     }
    System.out.print("\t"+colsum);
     System.out.println();
   }
}


 
public static void main(String[] args)
  {
    System.out.println("Enter row size of matrix:");
    System.out.println("Enter column size of matrix:");
   column_sum_of_the_matrix ob=new column_sum_of_the_matrix();
   ob.input();
}
}