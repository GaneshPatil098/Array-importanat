class Parent_class
{
  int a=10;
Parent_class()
  {
    System.out.println("Parent class constructor");
  }
   
  public void display()
  {
    System.out.println("Parent class");
 }
}
class Child_class extends Parent_class
{
     int a=50;
      public void input()
       {
          System.out.println(a);
          System.out.println(super.a);
       }
    Child_class()
     {
       super();
       System.out.println("child class constructor");
     }
   public void dis()
    {
       super.display();
      System.out.println("Child class");
     }
public static void main(String[] args)
{

  Child_class ob=new Child_class();
   ob.dis();
ob.input();
    
}
}