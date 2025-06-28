import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		{
			Scanner Nome = new Scanner (System.in);


			System.out.println("Nome do usuario");
			String digite = Nome.nextLine();


			int letras = digite.length();
			System.out.println("ola, " +digite+ ", seu nome tem " +letras+ " caracteres.");
		

		
		System.out.println("Qual a palavra secreta?");
		String secreta = Nome.nextLine();
		
        boolean  con = (secreta.equalsIgnoreCase("batata"));
        {
	    if(con == true);
	    System.out.println("Parábens você acertou");
	    }
	    	{
             else if(con == false);
        	System.out.println("você errou tente de novo");   
	    	}
	
		}

	}
}
}
