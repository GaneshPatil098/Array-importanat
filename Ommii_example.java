class Ommii_example
{
  public static void main(String[] args)
{
       int[] arr= {3,30,34,5,9};
        int[] arr1=new int[arr.length];
           int[] arr2=new int[arr.length];
          
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
 
		{
			if(arr[i]==arr[0] && arr[i]==arr[1])
              {
                arr1[i]=arr[i];
               }
               else
               {
                arr2[i]=arr[i];
               }

			
		}
        for(int i=0;i<arr.length;i++)
 
		{
          if(arr[i]==arr[0] && arr[i]==arr[1])
              {
                arr[i]=arr1[i];
               }
              else
               {
                arr[i]=arr2[i];
               }

         } 
         for(int i=0;i<arr.length;i++)
 
		{
         System.out.print(arr[i]);
       }
        
}
}