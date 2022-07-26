abstract class text
{
  public abstract void input();
  public void disp()
   {
     System.out.println("method is from abstract class");
   }
}
class text_class extends text
{
   public void display()
   {
    System.out.println("method is from normal class");
   }
   public void input()
   {
    System.out.println(" abstract method of abstract class");
   }

public static void main(String[] args)
  {
   text_class ob=new text_class();
    ob.display();
    ob.input();
     ob.disp();
  }
}