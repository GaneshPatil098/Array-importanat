import java.util.*;
class Prime_or_not
{
int i,count=0;
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
public void input()
{
for(i=2;i<=num/2;i++)
 {
   if(num%i==0)
    {
     count++;
      break;
     }
  }
if(count==0)
 { 
  System.out.println("num is prime");
 }
else
 { 
  System.out.println("num is not prime");
 }
}
public static void main(String args[])
 {
   System.out.println("enter any number");
    Prime_or_not ob=new Prime_or_not();
   ob.input();
 }
}
