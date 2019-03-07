import java.util.Scanner;

public class Digitos {
	
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("Ingrese el numero: ");
		num = teclado.nextInt();
		if (Integer.toString(num).length() == 1) {
			System.out.println("El numero " + num + " tiene un digito.");
		}
		else {
			System.out.println("El numero " + num + " tiene " + Integer.toString(num).length() + " digitos.");
		}
	}
}
