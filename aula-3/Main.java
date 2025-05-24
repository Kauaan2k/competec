import java.util.Scanner;
public class Main
{
   
	public static void main(String[] args) {
	    Scanner ka = new Scanner (System.in);
	
	    
        String letra = ka.nextLine();
        int x = 1;
        while  (x < 5) {
            System.out.println(letra);
            x++;
        }
        
     
     {System.out.println("resultado final");
     }
     
        int k = 1;
        int result = 0;
        while (k <= 100) {
            result += k;
            k++;
        }
        
        System.out.println(result);
	                                      
	                                      

	    System.out.println("resultado");
	    
	    int tabuada = ka.nextInt();
	    for (int i = 1; i <= 10; i++)
	    {
	    System.out.println(i*tabuada);
	    }
	}
}
