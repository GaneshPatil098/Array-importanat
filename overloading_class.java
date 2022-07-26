class overloading_class
{
  public void input(int a,int b)
   {
     int c=a+b;
     System.out.println("Sum of that two number="+c);
   }
   public void input(float a,float b)
   {
     float c=a-b;
     System.out.println("sub of that two number="+c);
   }

  public void input(int a,int b, int c)
   {
     int d=a+b+c;
     System.out.println("sub of that three number="+d);
   }
public static void main(String[] args)
  {
   overloading_class ob=new overloading_class();
    ob.input(10,20);
    ob.input(10.54f,5.5f);
    ob.input(10,20,30); 
  }
}