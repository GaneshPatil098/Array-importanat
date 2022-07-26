class Sum_of_array
{
 public static void main(String args[])
  {
   int i,j;
   int[][] arr1={(1,2,3),(3,4,5)(7,6,5)};
   int[][] arr2={(4,5,6),(8,9,7),(2,3,4)};
   int[][] arr3={ (arr1.length+arr2.length)};
    System.out.println(your matrix A)
    for(i=0;i<arr1.length;i++)
    {
     for(j=0;j<arr1.length;j++))
     {
      System.out.println(arr1[i][j]);
     }
     System.out.println();
    }
    System.out.println(your matrix B)
    for(i=0;i<arr2.length;i++)
    {
     for(j=0;j<arr2.length;j++))
     {
      System.out.println(arr2[i][j]);
     }
     System.out.println();
    }
    System.out.println("addition of matrix a and b ");
    for(i=0;i<(arr1.length+arr2.length);i++)
    {
     for(j=0;j<(arr1.length+arr2.length;j++))
     {
       arr3[i][j]=arr1[i][j]+arr2[j][j];
     }
     
    }
  }
}