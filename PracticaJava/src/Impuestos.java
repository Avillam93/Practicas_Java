import java.util.Scanner;

public class Impuestos {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		float sueldo;
		System.out.print("Ingrese el sueldo: ");
		sueldo = teclado.nextFloat();
		if (sueldo > 2000000) {
			System.out.println("Debe pagar impuestos.");
		}
		else {
			System.out.println("No debe pagar impuestos.");
		}
	}
}
