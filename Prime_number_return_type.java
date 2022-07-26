import java.util.*;
class Prime_number_return_type
{

public boolean prime(int num)
   {
       int count=0;
      for(int i=2;i<=num/2;i++)
      {
            if(num%i==0)
              {

               count++;
                break;
              }
        }
         if(count==0)
           {
              return true;
            }
           else
           {
             return false;
           }
 
      
   }
 public static void main(String[] args)
{
    Prime_number_return_type ob=new Prime_number_return_type();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
     int num=sc.nextInt();
      boolean k=ob.prime(num);
       if(k==true)
        {
          System.out.println("number is prime");
        }
        else
        {
          System.out.println("number is not prime");
        }
 
 }
}