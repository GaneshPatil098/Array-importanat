class Constructor_class
{
 
  int id;
  String name;
  
  Constructor_class(int id, String name)
  {
    this.id=id;
     this.name=name;
  }

public void dis()
   {
     System.out.println("this is using");
   }
 
  public void display()
   
    {
        this.dis();
       System.out.println("Student id="+id+"name="+name);
    }
public static void main(String[] args)
  {
    Constructor_class ob=new Constructor_class(101,"ganesh");
    ob.display();
  }  
}