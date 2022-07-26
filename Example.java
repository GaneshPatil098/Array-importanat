import java.util.*;
class Example
{
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();

int[] arr=new int[size];

 int i,j,count,lock=-1;
  public void input()
   {

System.out.println("Enter elements of array:");
for(i=0;i<size;i++)
   {
     arr[i]=sc.nextInt();
   }

System.out.println("your array:");
for(i=0;i<size;i++)
{
   System.out.print(arr[i]+" ");
}
 System.out.println();

}
public void display()
{
 


   
     

  
for(i=0;i<arr.length-1;i++)
{
  if(arr[i+1]-arr[i]==1)
{}
else
{
   System.out.println(arr[i]+1+"elements is missing from array ");
}

} 

}
  public static void main(String[] args)
  {
System.out.println("Enter size of array");

   Example ob=new Example();
    
    ob.input();
    ob.display();
   }
}