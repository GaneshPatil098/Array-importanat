import java.util.*;
class Power_function_of_any_number
{
  int i;
Scanner sc=new Scanner(System.in);
int base=sc.nextInt();
int temp=base;
int exponent=sc.nextInt();
public void input()
{
for(i=1;i<exponent;i++)
 {
  temp=temp*base;
  }

  
System.out.println("power of number="+temp);

 
}
public static void main(String args[])
 {
   System.out.println("enter base any number");
System.out.println("enter exponent any number");
Power_function_of_any_number ob=new Power_function_of_any_number();
ob.input();
}
}