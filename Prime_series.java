import java.util.*;
public class Prime_series {
	Scanner sc=new Scanner(System.in);
	public void Input()
	{
		int n=sc.nextInt();
                  int count=0;
			for(int i=1;i<=n; i++)
			{
				
				
					if(i%n==0)

						{
							count++;
							
							
 						}
         			if(count==0)
					
				}
				
			System.out.println(i+" ");
					
		
			}
	}
	

	public static void main(String[] args) {
		System.out.println("enter upto which num you to find ");
		Prime_series om=new Prime_series();
		om.Input();
	}

}