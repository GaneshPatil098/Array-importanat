import java.util.*;
class Printing_string_reverse
{
 public static void main(String args[])
 {
  int i;
   System.out.println("Enter string array:");
   Scanner sc=new Scanner(System.in);
   String str=sc.nextLine();
   System.out.println("reverse string arary:");
   for(i=str.length();i>0;i--)
   {
    System.out.print((str).charAt(i-1));
   }
 } 
}