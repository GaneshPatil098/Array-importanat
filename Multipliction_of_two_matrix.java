import java.util.*;
class Multipliction_of_two_matrix
{
   int i,j,row=3,col=3;
 
int[][] m1={{1,2,3},{4,5,6},{7,8,9}};
int[][] m2={{9,8,7},{6,5,4},{3,2,1}};
int[][] m3=new int[3][3];
public void input()
{  
  System.out.println("your first matrix:");
  for(i=0;i<3;i++)
  {
  for(j=0;j<3;j++)
   {
    System.out.print(m1[i][j]+" ");
    }
 System.out.println();
  }
  System.out.println("your second matrix:");
  for(i=0;i<3;i++)
  {
  for(j=0;j<3;j++)
   {
    System.out.print(m2[i][j]+" ");
   }
   System.out.println();
  }

System.out.println("multipliction of two matrix in third:");
 
   for(i=0;i<3;i++)
  {
  for(j=0;j<3;j++)
   {
     m3[i][j]=0; 
     for(int k=0;k<3;k++)
     {
     m3[i][j]=m3[i][j]+m1[i][k]*m2[k][j];
   }
   
  }
}
  for(i=0;i<3;i++)
  {
    for(j=0;j<3;j++)
   {
    System.out.print(m3[i][j]+" ");
   }
   System.out.println();
  }

 }
public static void main(String[] args)
  {
   Multipliction_of_two_matrix ob=new Multipliction_of_two_matrix();
   ob.input(); 
}
}