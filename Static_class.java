class Static_class
{
  int id;
   String name;
   String clg_name="cocsit";
   static int a=10,b=20;
   Static_class(int id,String name)
     {
       this.id=id;
       this.name=name;
     }
    public void disp()
     
      {
        System.out.println("Student id="+id+"\t"+"name="+name+"college name="+clg_name);
     }
    static
     {
      System.out.println("this static block first");
 
     }
      static void input()
     {
       int c=a+b;
         System.out.println("sum of that two number="+c);

        }
   public static void main(String[] args)
    {
      Static_class ob=new Static_class(101,"ganesh");
      Static_class.input();
         ob.disp();
   
    }
   static
   {
   System.out.println("this static block second");
}
}