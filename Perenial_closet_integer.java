class Perenial_closet_integer
{

 static int closestInteger(int a,int b)
  {
    int c1=a-(a%b);
    int c2=(a+b)-(a%b);
    if(a-c1>c2-a)
    {
      return c2;
    }
else
{
 return c1;
}
  }

public static void main(String[] args)
  {

   System.out.println("the closest number="+closestInteger(17,3));
 }
}