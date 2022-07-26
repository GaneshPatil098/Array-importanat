class Sum_array
{
 public static void main(String args[])
 {
  int i,j,sum=0;
  int[][] a={{3,5,6},{7,8,9},{9,8,7}};
  
  for(i=0;i<3;i++)
   {
    for(j=0;j<3;j++)
    {
     sum=sum+a[i][j];
    }
    System.out.print("a["+i+"]["+j+"]"+" "+"a["+i+"]["+j+"]"+" "+"a["+i+"]["+j+"]="+sum);
    
    System.out.println();
  }
  
}
}