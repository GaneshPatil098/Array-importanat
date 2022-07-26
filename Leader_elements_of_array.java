
class Leader_elements_of_array
{
    
int i,j;

int[] arr={16,17,4,3,5,2};
public void input()
  {
   
   System.out.println("your array:");
   for(i=0;i<arr.length;i++)
   {
    System.out.print(arr[i]+" ");
   }
   System.out.println();

  
for( i=0;i<arr.length;i++)
  {
   for(j=i+1;j<arr.length-1;j++)
    {
      if(arr[i]<arr[j])
      {
       
       System.out.print(arr[j]+" ");
      }
    }
  }
  System.out.print(arr[arr.length-1]);
  
}
public static void main(String[] args)
{
 Leader_elements_of_array ob=new Leader_elements_of_array();
ob.input(); 
}
}