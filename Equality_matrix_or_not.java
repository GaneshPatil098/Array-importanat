class Equality_matrix_or_not
{
     int i,j,row,col,row1,col1,count=0;
 
int[][] m1={{1,2,3},{4,5,6},{7,8,9}};
int[][] m2={{1,2,3},{4,5,6},{7,8,9}};

public void input()
{
row=m1.length;
col=m1[0].length;
row1=m2.length;
col1=m2[0].length;  
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

 if(row!=row1 && col!=col1)
{
   System.out.println("matrix are not equal");
  }
else
{
  for(i=0;i<3;i++)
   {
    for(j=0;j<3;j++)
     {
      if(m1[i][j]!=m2[i][j])
       {
         count=1;
         break;
       }
     }
   }
if(count==0)
{
  System.out.println("matrix is equal");
}
else
{
  System.out.println("matrix is not equal");
}
}
 }
public static void main(String[] args)
  {
   Equality_matrix_or_not ob=new Equality_matrix_or_not();
   ob.input();
}
}