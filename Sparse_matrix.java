class Sparse_matrix
{
 public static void main(String args[])
 {
  int i,j,row=3,col=3,count=0;
  int[][]arr={{0,2,0},{4,0,0},{0,8,0}};
  System.out.println("Your array:");
  for(i=0;i<row;i++)
  {
   for(j=0;j<col;j++)
   {
    System.out.print(arr[i][j]+" ");
   }
   System.out.println();
  }

   for(i=0;i<row;i++)
   {
    for(j=0;j<col;j++)
    {
     if(arr[i][j]==0)
     {
      count++;
     }
    } 
   }
      System.out.println("zero(0's) elements in matrix="+count);;
      int size=row*col;
      System.out.println("size of matrix="+size);
     if(count>size/2)
    { System.out.println("matrix is sparse matrix");}
     else
    { System.out.println("matrix is not sparse matrix");}
 }
}