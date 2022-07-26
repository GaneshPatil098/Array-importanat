import java.util.*;
class Example_solving
{
 
   
 

  public boolean input(int num)
   {
    
int x=num;
int rev=0;
     for(int i=1;num!=0;i++)
       {
            int rem=num%10;
            rev=rev*10+rem;
             num=num/10;
       
       }
if(x==rev)
 
 {
  return true;
}
 else

{
  return false;
}      
   }
 public static void main(String[] args)
  {
    
    Example_solving ob=new Example_solving();
Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int num=sc.nextInt();
    boolean k=ob.input(num);
     if(k==true)
      {
      System.out.println("number is palindrome");
     }
    else
     {
      System.out.println("number is not palindrome");
     }
  }
}