import java.util.*;
class Printing_name_reverse
{
 public static void main(String args[])
 {
  int i;
String[] s=new String[5];
  Scanner sc=new Scanner(System.in);

  
  System.out.println("Enter string elments array");
  for(i=0;i<5;i++)
  {
   s[i]=sc.nextLine();
  }
  System.out.println("reverse string:");
  for(i=4;i>=0;i--)
  {
   System.out.println(s[i]);
  }
 }
}