import java.util.*;
class Krishanamurthy_number_or_not
{
static public void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number:");
    int num=sc.nextInt();
     int sum=0,rem;
     int x=num;
    while(num!=0)
     {
       rem=num%10;
        int fact=1;
      int i=1;
       while(i<=rem)
       {
         fact=fact*i;
         i++;
       }
      sum=sum+fact;
      num=num/10;
     }
   if(sum==x)
    {
       System.out.println("Number is krishanamurthy");
       }
   else
   {
       System.out.println("Number is not krishanamurthy");
       }
  }
}
