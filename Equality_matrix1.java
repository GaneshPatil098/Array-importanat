class Equality_matrix1
{
 public static void main(String args[])
 {
  int i,j,row1,col1,row2,col2;
  int[][] a={{2,3,4},{4,5,6},{7,8,9}};
  int[][] b={{2,3,4},{4,5,6},{7,8,9}};
  
  row1=a.length;
  col1=a[0].length;
  row2=b.length;
  col2=b[0].length;
  int c=1;
 
if(row1!=row2 && col1!=col2)
     {
      System.out.println("not equal");
     }
else
     {
      for(i=0;i<row1;i++)
      {
       for(j=0;j<col1;j++)
       {
        if(a[i][j]!=b[i][j])
        {
          c=0;
          break;
         }
        } 
       }
      }

if(c==1)
System.out.println("Matrix are equal");
else

System.out.println("Matrix are not equal");

}}