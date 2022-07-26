import java.util.*;
class Palindrome_number
{
int i,rev=0,rem;
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int n=num;
public void input()
{
for(i=0;n!=0;i++)
 {
  rem=n%10;
  rev=(rev*10)+rem;
  n=n/10;
  }
if(rev==num)
{
  System.out.println("num is palindrome");
}
else
{
  System.out.println("num is not palindrome");
}
 
}
public static void main(String args[])
 {
   System.out.println("enter any number");
Palindrome_number ob=new Palindrome_number();
ob.input();
}
}