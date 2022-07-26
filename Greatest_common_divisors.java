import java.util.*;
class Greatest_common_divisors
{
   int i,gcd=1;
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
public void input()
{
for(i=1;i<=num1 && i<=num2;i++)
 {
  if(num1%i==0 && num2%i==0)
   {
    gcd=i;
   }
  }

  System.out.println("gcd="+gcd);

 
}
public static void main(String args[])
 {
   System.out.println("enter first any number");
System.out.println("enter second any number");
  Greatest_common_divisors ob=new Greatest_common_divisors();
  ob.input();
 }
}