import java.util.*;
class Frequency_of_string
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter any String");
       String s=sc.nextLine();
       int[] arr=new int[s.length()];
       char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++)
         {
           arr[i]=1;
           for(int j=i+1;j<s.length();j++)
            {
             if(ch[i]==ch[j])
                 {
              arr[i]++;
               ch[j]='0';
               }
            }
          }
       for(int i=0;i<arr.length;i++)
          {
            if(ch[i]!=' ' && ch[i]!='0')
              {
               System.out.println(ch[i]+" "+arr[i]);
              } 
          }
   }
}