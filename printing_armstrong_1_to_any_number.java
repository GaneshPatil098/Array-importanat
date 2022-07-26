import java.util.*;
class printing_armstrong_1_to_any_number
{
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number where to find armstrong number");
    int num1=sc.nextInt();
    System.out.println("Enter number puto that to find armstrong number");
    int num2=sc.nextInt();
     int i,cubesum;
     while(num1<=num2)
      {
        cubesum=0;
         int n=num1; 
        for(i=0;n!=0;i++)
          {
           int rem=n%10;
            cubesum=cubesum+(rem*rem*rem);
             n=n/10;
          }
        if(num1==cubesum)
         {
            System.out.println(num1);
         }
       num1++;
      }
   }
} 