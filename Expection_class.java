class Expection_class
{
 public void input()
  {
    try
    {
      int a=20;
      int c=a/0;
       System.out.println("div="+c);
    }
    catch(ArithmeticException e)
     {
        System.out.println(e);
        System.out.println("catch block is executed");
     }
     finally
     {
        System.out.println("finally block is executed");
     }
  }
 public static void main(String[] args)
  {
    Expection_class ob=new Expection_class();
     ob.input();

    }
}