import java.util.Scanner;

public class SumaRestaOProductoDivision {

	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		float num1, num2, suma, resta, producto, division;
		System.out.print("Introduzca el primer numero: ");
		num1 = teclado.nextFloat();
		System.out.print("Introduzca el segundo numero: ");
		num2 = teclado.nextFloat();
		
		if (num1 > num2) {
			System.out.println("El primer numero es mayor.");
			suma = num1 + num2;
			System.out.println("La suma es: " + suma);
			resta = num1 - num2;
			System.out.println("La resta es: " + resta);
		}
		else {
			System.out.println("El segundo numero es mayor.");
			producto = num1 * num2;
			System.out.println("El producto es: " + producto);
			division = num1 / num2;
			System.out.println("La division es: " + division);
		}
	}
}
