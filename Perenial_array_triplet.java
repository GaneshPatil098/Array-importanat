class Perenial_array_triplet
{
  boolean triplet(int arr[],int size,int sum)
   {
     for(int i=0;i<arr.length-2;i++)
      {
       for(int j=i+1;j<arr.length-1;j++)
         {

          for(int k=j+1;k<arr.length;k++)
          {
           if(arr[i]+arr[j]+arr[k]==sum)
            {
              System.out.println("triplet is="+arr[i]+","+arr[j]+","+arr[k]);
             return true;
            }
          }
         }

         
      }
return false;
   }
public static void main(String args[])
{
  Perenial_array_triplet ob=new Perenial_array_triplet();
    int[] arr={12,3,4,1,6,9};
   ob.triplet(arr,arr.length,24);
}
}