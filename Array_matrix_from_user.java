import java.util.*;
class  Array_matrix_from_user
{
 public static void main(String args[])
 {
  int i,j;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of rows:");
  int row=sc.nextInt();
  System.out.println("Enter size of column:");
  int column=sc.nextInt();
  int[][] arr=new int[row][column];
  System.out.println("enter elements of array:");
  for(i=0;i<row;i++)
  {
   for(j=0;j<column;j++)
   {
    arr[i][j]=sc.nextInt();
   }
  }
   System.out.println("Your array:");
   for(i=0;i<row;i++)
   {
    for(j=0;j<column;j++)
    {
     System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+"\t");
    }
     System.out.println();
   }
  
 }
}