import java.util.*;
class Neon_number_or_not
{
  static public void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number:");
    int num=sc.nextInt();
    int squ=num*num;
    int sum=0;
     while(squ!=0)
      {
        int rem=squ%10;
         sum=sum+rem;
          squ=squ/10;
      }
   if(num==sum)
    {
      System.out.println("number is neon number");
    }
else
   {
      System.out.println("number is not neon number");
    }
 }
}