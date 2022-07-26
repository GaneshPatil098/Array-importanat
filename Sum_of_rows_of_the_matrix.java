import java.util.*;
class Sum_of_rows_of_the_matrix
{
   int i,j,rowsum;
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
   rowsum=0;
  for(j=0;j<col;j++)
   {
     rowsum=rowsum+m[i][j];
      System.out.print(m[i][j]+" ");
     }
    System.out.print("\t"+rowsum);
     System.out.println();
   }
}


 
public static void main(String[] args)
  {
    System.out.println("Enter row size of matrix:");
    System.out.println("Enter column size of matrix:");
   Sum_of_rows_of_the_matrix ob=new Sum_of_rows_of_the_matrix();
   ob.input();
}
}