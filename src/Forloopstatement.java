
public class Forloopstatement {

	public static void main(String[] args) {
		
		
/*		 for(int a=0;a<=10;a++)
	        {
	            
	            System.out.println("the value of i is-->"+ a);
	            
	            
	        }
	        
	        
	        System.out.println("for loop is finished");

	        int a=0;
	        
	        for(;a<=10;)
	        {
	            
	            System.out.println("the value of  a is-->"+ a);
	            a++;
	            
	            
	        }
	       System.out.println("for loop is finished"); 
	        
	     */
		
		System.out.println("the whole odd numbers are given below");
		int i=0;
		for(i=0;i<=20;i++)
			
		{
			if(i%2!=0)
			{
				System.out.println(i);
	
			}
		}
		System.out.println("all odd numbers are printed");
		
		System.out.println("******************************");
		System.out.println("the whole even numbers are given below");	
		int ii=0;
		for(ii=0;ii<=50;ii++)
			
		{
			if(ii%2==0)
			{
				System.out.println(ii);
			}
		}
		System.out.println("all even numbers are printed");
		
	}

}
