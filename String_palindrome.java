import java.util.*;
class String_palindrome
{ 

   public boolean string_Input(String s)
    {

      String rev="";
      for(int i=s.length()-1;i>=0;i--)
       {
           rev=rev+s.charAt(i);
        }
    if(s.equals(rev))
      {
        return true;
      }
   else
      {
        return false;
      }
   
    }

  public static void main(String[] args)
   {
         
     String_palindrome ob=new String_palindrome();
      Scanner sc=new Scanner(System.in);
     System.out.println("Enter any string");
     String s=sc.nextLine();
     boolean k=ob.string_Input(s);
       if(k==true)
         {
           System.out.println("String is palindrome");
         }
       else
      {
           System.out.println("String is not palindrome");
         }

   }
}