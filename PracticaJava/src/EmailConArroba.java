import java.util.Scanner;

public class EmailConArroba {

	Scanner teclado =new Scanner(System.in);
	String email;
	
	public EmailConArroba() {
		System.out.print("Inserte el email: ");
		email = teclado.nextLine();
	}
	
	public void contieneArroba (){
        if (email.contains("@")) {
        	System.out.println("El email contiene '@'.");
        }
        else {
    	System.out.println("El email no contiene '@'.");
        }
	}

	public static void main(String[] args) {
		EmailConArroba email = new EmailConArroba();
		email.contieneArroba();
	}
}
