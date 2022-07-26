interface interface1
{
  public abstract void input();
  public abstract void display();
}
interface interface2 extends interface1 
{
  public abstract void input2();
}
public class normal_class implements interface1
{
  public void disp()
  
  {
    System.out.println("method of normal class");
  }
public void input()
{
  System.out.println("first method of interface");
}
 public void input2()
{
  System.out.println("method of second interface");
}

  public void display()
{
  System.out.println("second method of interface");
}
public static void main(String[] args)
  {
   normal_class ob=new normal_class();
    ob.input();
     ob.input2();
     ob.disp();
     ob.display();
 }
}
