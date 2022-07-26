class Printing_row_or_column
{
 public static void main(String args[])
 {
  int i,j;
  int[][] a={{3,5,6},{7,8,9},{9,8,7}};
  
  for(i=1;i<2;i++)
   {
    for(j=0;j<3;j++)
    {
     System.out.print(a[i][j]+" ");
    }
    //System.out.print();
    
   }
}
}