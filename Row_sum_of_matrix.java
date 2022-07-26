class Row_sum_of_matrix
{
 public static void main(String args[])
 {
  int i,j,row=3,col=3,k,rowsum=0;
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
  for(i=0;i<row;i++)
  {
   rowsum=0;
   for(j=0;j<col;j++)
    {
    rowsum=rowsum+arr[i][j];
    System.out.print(arr[i][j]+" ");
    }
   System.out.print("\t="+rowsum);
   System.out.println();
  }
 }
}