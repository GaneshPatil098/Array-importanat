import java.util.*;
class Lowest_common_multiple
{
  int i,gcd=1,lcm;
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

  lcm=num1*num2/gcd;
System.out.println("lcm="+lcm);

 
}
public static void main(String args[])
 {
   System.out.println("enter first any number");
System.out.println("enter second any number");
Lowest_common_multiple ob=new Lowest_common_multiple();
ob.input();
}
}