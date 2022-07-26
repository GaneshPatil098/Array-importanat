import java.util.*;
class Example4
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int num1=sc.nextInt();
int i,gcd=0;
public void input()
{
   
  for(i=1;i<=num && i<=num1;i++)
  {
    if(num%i==0 && num1%i==0)
    {
     gcd=i;
    }
}
 
 System.out.println((num*num1)/gcd);
}
  public static void main(String[] args)
 {
System.out.println("Enter any number;");
Example4 ob=new Example4();
ob.input();
 }
}