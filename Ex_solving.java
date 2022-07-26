import java.util.*;
class Ex_solving
{
   public boolean Armstrong(int num)
    {
       int x=num;
        int cube_sum=0;
      for(int i=0;num!=0;i++)
         {
           int rem=num%10;
           cube_sum=cube_sum+(rem*rem*rem);
           num=num/10;
          }
    if(x==cube_sum)
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
       Ex_solving ob=new Ex_solving();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter any number");
     int num=sc.nextInt();
      boolean k=ob.Armstrong(num);
       if(k==true)
        {
        System.out.println("Number is armstrong");
      }
else
  {
   System.out.println("Number is not armstrong");
}
     
   }
}