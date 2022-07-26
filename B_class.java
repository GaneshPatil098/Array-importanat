abstract class A_class
{
  public abstract void input();

  public void disp()
   {
     System.out.println("this is abstract class method");
   }
}
public class B_class extends  A_class
{
  public void display()
  {
    System.out.println("method of normal class");
    }
  public void input()
   {
     System.out.println("abstract method of abstract class");
   }
public static void main(String[] args)
  {
    B_class ob=new B_class();
    ob.input();
     ob.disp();
     ob.display();
  }
}