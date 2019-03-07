import java.util.Scanner;

public class SumaYPromedioDiezValores {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int x = 0, numero, suma = 0, promedio;
		
		while (x < 10) {
			System.out.print("Inserte numero: ");
			numero = teclado.nextInt();
			suma = numero + suma;
			x = x + 1;
		}
		
		promedio = suma / 10;
		
		System.out.println("La suma es igual a: " + suma);
		System.out.println("El promedio es igual a: " + promedio);
	}
}
