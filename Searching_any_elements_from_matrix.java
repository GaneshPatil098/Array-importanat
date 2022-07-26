class Searching_any_elements_from_matrix
{
 public static void main(String args[])
 {
  int i,j,row=3,col=3,k,count=0;
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
   System.out.println("enter elements to search from matrix");
    k=4;
   for(i=0;i<row;i++)
   {
    for(j=0;j<col;j++)
    {
     if(arr[i][j]==k)
     {
      count++;
     }
    } 
   }
   if(count>0)
   {System.out.println("searched elements from matrix="+count+"times");}
    else
  { System.out.println("searched elements not found in matrix");}   
 }
}