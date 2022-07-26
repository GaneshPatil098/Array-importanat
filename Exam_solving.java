import java.util.*;
class Exam_solving
{
  public void input(int num)
   {
     int a=0,b=1;
    for(int i=1;i<=num;i++)
     {
       int add=a+b;
        a=b;
        b=add;
      System.out.println("fabonacii series of that number="+add);
    }
     
   }
  public static void main(String[] args)
   {
      Exam_solving ob=new Exam_solving();
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter any number");
      int num=sc.nextInt();
      ob.input(num);
        
   }
}