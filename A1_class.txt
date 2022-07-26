class Overriding_class
{
 public void input()
  {
    System.out.println("Parent class method");
  }
}
public class class_a1 extends Overriding_class
{
   public void input()
  {
    System.out.println("child class method");
  }
public static void main(String[] args)
  {
   class_a1 ob=new class_a1();
     ob.input();
  }
} 