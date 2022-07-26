class String_palindrome_or_not
{
 public static void main(String[] args)
  {
    String s="mom";
    String rev="";
    
    for(int i=s.length()-1;i>=0;i--)
     {
      rev=rev+s.charAt(i);
     }
     if(s.equals(rev))
      {
        System.out.println("String is palindrome");
      }
     else 
      {
        System.out.println("String is not palindrome");
      }
  }
}