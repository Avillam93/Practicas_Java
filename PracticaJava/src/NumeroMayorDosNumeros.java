import java.util.Scanner;

public class NumeroMayorDosNumeros {

	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		System.out.print("Ingrese el primer numero: ");
		num1 = teclado.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		num2 = teclado.nextInt();
		if (num1 > num2) {
			System.out.println("El primer numero es mayor.");
		}
		else {
			System.out.println("El segundo numero es mayor.");
		}
	}
}
