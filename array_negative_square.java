class array_negative_square
{
 public static void main(String args[])
 {
  int i;
   int[]a={3,-1,5,6,-7,-8};
   System.out.println("your array:");
   for(i=0;i<a.length;i++)
   {
    System.out.println(a[i]);
   }
   
   for(i=0;i<a.length;i++)
   {
    if(a[i]<0)
    
     a[i]=a[i-1]*a[i-1];
   }
   System.out.println("modify array");
   for(i=0;i<a.length;i++)
   {
    System.out.println(a[i]);
   }
 }
}