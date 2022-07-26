import java.util.*;
class Sparse_matrix
{
   int i,j,count=0;
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
  for(j=0;j<col;j++)
   {
     if(m[i][j]==0)
     {
        count++;
      
     }
    
   }
}
System.out.println("total zero elements in arrat="+count);
int size=row*col;
System.out.println("size of matrix="+size);
if(count>size/2)
{
  System.out.println("matrix is sparse matrix");  
}
else
{
  System.out.println("matrix is not sparse matrix");
}
 }
public static void main(String[] args)
  {
    System.out.println("Enter row size of matrix:");
    System.out.println("Enter column size of matrix:");
Sparse_matrix ob=new Sparse_matrix();
ob.input();
}
}