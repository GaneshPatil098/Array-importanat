import java.util.*;
class Printing_vowels_for_string
{
 public static void main(String args[])
 {
  int i;
  System.out.println("Enter string array");
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  for(i=0;i<str.length();i++)
  {
   if(str.charAt(i)=='a'|| str.charAt(i)=='A'||
      str.charAt(i)=='e'|| str.charAt(i)=='E'||
      str.charAt(i)=='i'|| str.charAt(i)=='I'||
      str.charAt(i)=='o'|| str.charAt(i)=='O'||
      str.charAt(i)=='u'|| str.charAt(i)=='U' )
   {
    System.out.println("Vowel="+str.charAt(i)+" "+"index="+i);
   }
   else{}
  }
 }
}