
class Sum_of_last_elements_in_array
{
 public static void main(String args[])
  {
    int i;
    int[] arr=new int[8]
    arr[i]={1,2,3,4,5,6,7,8};
    System.out.println("array");
    for(i=0;i<arr.length;i++)
   {
    System.out.println(arr[i]);
   }
   for(i=0;i<arr.length;i++)
   {
    if(arr[i]>arr.length/2)
    arr[i]=arr[i]*arr[i];
   }
   for(i=0;i<arr.length;i++)
   {
    System.out.println(arr[i]);
   }
}