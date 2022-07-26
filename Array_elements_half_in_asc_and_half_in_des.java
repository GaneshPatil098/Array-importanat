import java.util.*;
class Array_elements_half_in_asc_and_half_in_des
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of array:");
     int size=sc.nextInt();
     int[] arr=new int[size];
     int i,j,swap;
     System.out.println("Enter elements of array:");
     for(i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
      System.out.println("your array:");
     for(i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ");
      }
     System.out.println();
     for(i=0;i<arr.length/2;i++)
      {
       for(j=i+1;j<arr.length/2;j++)
        {
          if(arr[i]>arr[j])
          {
            swap=arr[i];
             arr[i]=arr[j];
             arr[j]=swap;
            }
        }
      }
        for(i=arr.length/2;i<arr.length;i++)
      {
       for(j=i+1;j<arr.length;j++)
        {
          if(arr[i]<arr[j])
          {
            swap=arr[i];
             arr[i]=arr[j];
             arr[j]=swap;
            }
        }
      }
   System.out.println("after your array:");
     for(i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ");
      }
   }
}