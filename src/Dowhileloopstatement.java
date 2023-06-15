
public class Dowhileloopstatement {

	public static void main(String[] args) {
		int i=0;
		do
        {
            System.out.println("the value of i is --> "+ i);
           i++; 
           
          }while(i<=10);
		

        char c='a' ;
        char a='A';
        do
        {
            System.out.println(a);
            System.out.println(c);
            a++;
            c++;
        
        }while(c<='z');
		
        int j=0;
        while(true)
        {
            System.out.println("Welcome to Modi");//12345
            if(j==0)
            {
                break;
            }
            j--;
            
            
        }
        
        int ii=0;
        while(ii<=20)
        {
            System.out.println("*****The value  ii before incrementing-->**** "+ii);
            ii=ii+2;
            System.out.println("The value  ii After incrementing--> "+ii);
            
            
        }
        
        System.out.println("thanks");
        
        }
}
