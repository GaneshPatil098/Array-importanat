class Diagonal_matrix_reverse
{
 public static void main(String args[])
 {
  int i,j,row=3,col=3;
  int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
  System.out.println("Your array:");
  for(i=0;i<row;i++)
  {
   for(j=0;j<col;j++)
   {
    System.out.print(arr[i][j]+" ");
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
     if(i==0  && j==2 || i==1 && j==1 || i==2 && j==0)
     System.out.print(arr[i][j]+" ");
      else
     System.out.print("0"+" ");
    } 
     System.out.println();
   }
  }
  else
  System.out.println("matrix is not diagonal");
 }
}