/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
    public class Main {
	public static void main(String[] args) {

   //Variáveis 1
 
	char name='K';
	int year=15;
	boolean breakfast=true;
    System.out.println("my name "+ name);
    System.out.println("my years "+ year);
	System.out.println("breakfast "+ breakfast);
	
	
	//Scanner
	
		Scanner ka = new Scanner(System.in);
    System.out.println("Laranja");
    int Laranja = ka.nextInt();
    
    System.out.println("Uva");
    int Uva = ka.nextInt();
    
    System.out.print("resultado da soma = "+ (Laranja+Uva));
	}
}
