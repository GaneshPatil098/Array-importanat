import java.util.*;
class String_frequency
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
   public void Input()
   {
    int[] fre=new int[s.length()];
     char[] ch=s.toCharArray();
      for(int i=0;i<s.length();i++)
        {
           fre[i]=1;
          for(int j=i+1;j<s.length();j++)
           {
              if(ch[i]==ch[j])
               {
                 fre[i]++;
                  ch[j]='0';
               }
           }
        }
      for(int i=0;i<fre.length;i++)
           {
              if(ch[i]!='0' && ch[i]!=' ')
                {
                  System.out.println(ch[i]+"\t"+fre[i]);
                }
           }
     
  }
  public static void main(String[] args)
  {
      System.out.println("Enter any String:");
       String_frequency ob=new String_frequency();
    
    ob.Input();
  }
}