class Converting_zero_into_5_of_any_number
{
 public static void main(String[] args)
  {
   int i;
   int num=1004;
   int rem;
    for(i=1;num!=0;i++)
   {
    rem=num%10;
    if(rem==0)
      {
        rem=5;
         
       }
      else
      {
       }
     num=num/10;
   }
System.out.println(num); 
  }
}