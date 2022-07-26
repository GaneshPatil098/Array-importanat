class table extends Thread
{
  int num=5;
  public void run()
  {
    for(int i=1;i<=10;i++)
      {
     try
      {
       sleep(500);
      }
   catch(Exception e)
      {
        System.out.println(e);
      }
    
        System.out.println(num*i);
      }
   }
 public static void main(String[] args)
  {
    table ob=new table();
    ob.start();
  }
}