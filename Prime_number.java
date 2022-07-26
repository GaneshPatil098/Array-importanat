 import java.util.*;
class Prime_number
{
  Scanner sc=new Scanner(System.in);
   int num=sc.nextInt();
   int count=0;
 public void prime()
  {
   try
    {
    for(int i=0;i<num/2;i++)
     {
       if(num%i==0)
       {
         count++;
         break;
       }
     }
}
  catch()
    if(count==0)
     {
       System.out.println("Number is prime");
     }
    else
    {
      System.out.println("Number is not prime");
    }
  }
public static void main(String[] args)
  {
    System.out.println("Enter any number");
   Prime_number ob=new Prime_number();
   ob.prime();

}
}