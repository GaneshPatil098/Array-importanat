import java.util.*;
class Reverse_number
{
 int i,rev=0,rem;
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
public void input()
{
for(i=0;num!=0;i++)
 {
  rem=num%10;
  rev=(rev*10)+rem;
  num=num/10;
  }

  System.out.println("reverse num="+rev);
 
}
public static void main(String args[])
 {
   System.out.println("enter any number");
Reverse_number ob=new Reverse_number();
ob.input();
}
}