class Equality_matrix
{
 public static void main(String args[])
 {
  int i,j,row1,col1,row2,col2;
  int[][] arr1={(2,3,4),(4,5,6),(7,8,9)};
  int[][] arr2={(2,3,4),(4,5,6),(7,8,9)};
  
  row1=arr1.length;
  col1=arr1[0].length;
  row2=arr2.length;
  col2=arr2[0].length;
  int c=1;
 
if(row1!=row2 && col1!=col2)
     {
      System.out.println("not equal");
     }
else
     {
      for(i=0;i<row1;i++)
      {
       for(j=i;j<col1;j++)
       {
        if(arr1[i][j]!=arr2[i][j])
        {
          c=0;
          break;
         }
        } 
       }
      }

if(c==1)
{System.out.println("Matrix are equal");}
else

{System.out.println("Matrix are not equal");}

}}