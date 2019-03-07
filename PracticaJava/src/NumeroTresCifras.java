import java.util.Scanner;

public class NumeroTresCifras {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("Ingrese el numero: ");
		num = teclado.nextInt();
		
		if (Integer.toString(num).length() == 1) {
			System.out.println("El numero " + num + " tiene un digito.");
		} 
		else {
			if (Integer.toString(num).length() <= 3) {
				System.out.println("El numero " + num + " tiene " + Integer.toString(num).length() + " digitos.");
		}
			else {
				System.out.println("Error: El numero " + num + " tiene mas de 3 digitos.");
			}
		}
	}
}
