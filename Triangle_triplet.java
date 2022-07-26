import java.util.*;
class Triangle_triplet// pythagores theorem
{
   
Scanner sc=new Scanner(System.in);
int side1=sc.nextInt();
int side2=sc.nextInt();
int side3=sc.nextInt();
public void input()
{
if((side3*side3)==(side1*side1)+(side2*side2))
{
System.out.println("triangle is triplet");
}
else
{
System.out.println("triangle is not triplet");
}

  


 
}
public static void main(String args[])
 {
   System.out.println("enter first side of triangle");
System.out.println("enter second side of triangle");
  System.out.println("enter third side of triangle");
  Triangle_triplet ob=new Triangle_triplet();
   ob.input();
}
}