import java.util.*;
class Armstrong_number_or_not
{
 int i,cube_sum=0,rem;
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int n=num;
public void input()
{
for(i=0;n!=0;i++)
 {
  rem=n%10;
  cube_sum=cube_sum+(rem*rem*rem);
  n=n/10;
  }
if(cube_sum==num)
{
  System.out.println("num is armstrong");
}
else
{
  System.out.println("num is not armstrong");
}
 
}
public static void main(String args[])
 {
   System.out.println("enter any number");
Armstrong_number_or_not ob=new Armstrong_number_or_not();
ob.input();
}
 }